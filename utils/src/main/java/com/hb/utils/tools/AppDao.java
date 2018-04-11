package com.hb.utils.tools;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * 使用反射来进行表的增删改查操作
 * 
 * 
 * 使用方法：
 * 
 * 1.在创建表时：表名需要遵守一定规范 例如：类名为User时 User在数据库中的表名必须是 UserTable（包括大小写）
 * ,这样便于查找到相对应的表进行操作 2.在创建表时：字段名需要遵守一定规范
 * 例如：在类中字段名为userName，那么这个字段的get方法名应该是getUserName()，那么表中的字段名，必须是userName，（包括大小写）
 * 
 * @author hbkj-android
 * 
 */
public final class AppDao {
	private SQLiteDatabase openDataBase;

	/**
	 * 在类名后追加的字符串，以此就知道这个类相对应的表名
	 */
	private final static String endTableName = "";

	private AppDao(SQLiteDatabase openDataBase) {
		this.openDataBase = openDataBase;
	}

	/**
	 * 确保只有一个DBOperHelper的实例，
	 * 从DBOperHelper获取到的readableDatabase或writableDatabase是同步的， 所以就不需要考虑线程安全问题
	 * 
	 * @return
	 */
	public synchronized static AppDao getInstance(SQLiteDatabase openDataBase) {
		return new AppDao(openDataBase);
	}


	/**
	 * 查询出某个表中所有的数据
	 * 
	 * @param claz
	 */
	public <T> List<T> findAll(Class<T> claz) {
		return find(claz, null, null, null, null, null, null);
	}

	/**
	 * 有查询条件的查询某个表
	 * 
	 * @param claz
	 * @return
	 */
	public <T> List<T> findAll(Class<T> claz, String selection, String[] selectionArgs) {
		return find(claz, selection, selectionArgs, null, null, null, null);
	}

	/**
	 * 多条件查询
	 * 
	 * @param claz
	 *            需要返回的数据类型字节码对象，通过字节码对象才能通过反射进行下一步操作，不可为null
	 * @param selection
	 * @param selectionArgs
	 * @param groupBy
	 * @param having
	 * @param orderBy
	 * @param limit
	 */
	public <T> List<T> find(Class<T> claz, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) {
		// 获取到类名
		String className = claz.getName();

		SQLiteDatabase readableDatabase = openDataBase;

		// 表名必须为是类名+Table
		String tableName = className.substring(className.lastIndexOf(".") + 1) + endTableName;

		// 查询数据
		Cursor query = readableDatabase.query(tableName, null, selection, selectionArgs, groupBy, having, orderBy, limit);

		List<T> list = null;

		if (query == null) {
			if (readableDatabase != null) {
				readableDatabase.close();
			}
			return null;
		}

		try {
			list = initBean(query, className);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (query != null) {
				query.close();
			}
			if (readableDatabase != null) {
				readableDatabase.close();
			}
		}

		return list;
	}

	public <T> List<T> findBySql(String sql, Class<T> claz) {
		Cursor query = openDataBase.rawQuery(sql, null);

		if (query == null) {
			if (openDataBase != null) {
				openDataBase.close();
			}
			return null;
		}

		List<T> list = null;

		try {
			list = initBean(query, claz.getName());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (query != null) {
				query.close();
			}
			if (openDataBase != null) {
				openDataBase.close();
			}
		}

		return list;
	}

	private <T> List<T> initBean(Cursor query, String className) throws ClassNotFoundException {
		List<T> list = null;

		if (query != null) {
			list = new ArrayList<T>();

			// 得到字节码对象
			@SuppressWarnings("unchecked")
			Class<T> clz = (Class<T>) Class.forName(className);
			// 根据字节码对象获取到所有set开头的公共方法集合
			List<Method> methodList = parseSetMethodList(clz, "set");

			// 如果得到的set方法集合大于1
			if (methodList != null && methodList.size() > 0) {
				query.moveToFirst();
				for (int i = 0; i < query.getCount(); i++) {
					// 将获取到得数据组装为list集合
					list.add(initObject(clz, query, methodList));
					query.moveToNext();
				}
			}

		}
		Log.e("appDao", className + "表获取到数据" + list == null ? "0" : list.size() + "条");
		return list;
	}

	/**
	 * 根据从数据库获取到得数据封装对象并返回
	 * 
	 * @param clz
	 *            字节码对象
	 * @param query
	 *            数据库游标
	 * @param methodList
	 *            set开头的方法名称集合
	 * @return
	 */
	private <T> T initObject(Class<T> clz, Cursor query, List<Method> methodList) {
		T obj = null;

		try {
			obj = clz.newInstance();
			// 循环插入clz实例的每一个字段值
			for (Method method : methodList) {
				// 根据方法名获取到参数的名字
				String fieldName = method.getName().substring(4);
				// 截取第三个字符转换为小写，并拼接成字段
				fieldName = (method.getName().charAt(3) + "").toLowerCase(Locale.getDefault()) + fieldName;
				// 得到方法的参数类型
				Class<?>[] parameterTypes = method.getParameterTypes();

				// 如果参数类型数组不为null且大于0时才进行插入数据
				if (parameterTypes != null && !(parameterTypes.length < 1)) {

					int columnIndex = query.getColumnIndex(fieldName);
					if (parameterTypes[0] == String.class) {
						method.invoke(obj, query.getString(columnIndex));
					} else if (parameterTypes[0] == Integer.class) {
						method.invoke(obj, query.getInt(columnIndex));
					} else if (parameterTypes[0] == Long.class) {
						method.invoke(obj, query.getLong(columnIndex));
					} else if (parameterTypes[0] == Float.class) {
						method.invoke(obj, query.getFloat(columnIndex));
					} else if (parameterTypes[0] == Boolean.class) {
						method.invoke(obj, query.getBlob(columnIndex));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	/**
	 * 插入数据
	 * 
	 * @param list
	 * @return insert 返回插入操作所影响的行数
	 */
	public <T> Long insertAll(List<T> list) {
		Long insert = 0L;

		if (list == null || list.size() < 1) {
			return 0L;
		}

		String className = list.get(0).getClass().getName();
		String tableName = className.substring(className.lastIndexOf(".") + 1) + endTableName;
		SQLiteDatabase writableDatabase = openDataBase;
		Class<?> c = null;
		try {
			// 根据类名来获取字节码对象
			c = Class.forName(className);

			if (c != null) {
				// 查找出所有以get为开头的方法
				List<Method> methodList = parseSetMethodList(c, "get");

				// 根据查找出来的get方法集合来执行插入数据的动作
				for (T obj : list) {
					// 返回插入数据的id
					long number = insert(tableName, obj, methodList, writableDatabase);

					// 说明插入一条数据成功
					if (number != -1) {
						insert++;
					}
				}
			} else {
				Log.e(this.getClass().getName(), "=============== not found className class =================");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writableDatabase != null) {
				writableDatabase.close();
			}
		}
		Log.e("appDao", tableName + "表插入数据" + insert + "条");

		// 通知内容变化
		if (insert > 0) {
			DBProvider.getInstance().onChange(tableName);
		}

		return insert;
	}

	/**
	 * 执行具体的插入数据的动作
	 * 
	 * @param tableName
	 *            表名
	 * @param obj
	 *            数据源
	 * @param methodList
	 *            数据源中的对象类型中以get为开头的方法的集合
	 * @return
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	private <T> Long insert(String tableName, T obj, List<Method> methodList, SQLiteDatabase writableDatabase) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Long insert = 0L;

		ContentValues values = new ContentValues();

		for (Method method : methodList) {
			String name = method.getName();

			// 封装好ContentValues 数据
			if (name.startsWith("get") && !name.startsWith("getClass")) {

				Object methodValue = method.invoke(obj);
				String filedName = method.getName().substring(4);

				filedName = (method.getName().charAt(3) + "").toLowerCase(Locale.getDefault()) + filedName;

				values.put(filedName, methodValue + "");
			}
		}
		// 插入数据
		insert = writableDatabase.insert(tableName, null, values);
		return insert;
	}

	/**
	 * 删除一条数据
	 * 
	 * @param clz
	 *            字节码对象
	 * @param select
	 * @param selectArg
	 * @return 操作所影响的行数
	 */
	public int delete(Class<?> clz, String select, String[] selectArg) {
		int delete = 0;

		SQLiteDatabase writableDatabase = openDataBase;
		String tableName = "";
		try {
			tableName = clz.getName().substring(clz.getName().lastIndexOf(".") + 1) + endTableName;

			delete += writableDatabase.delete(tableName, select, selectArg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writableDatabase != null) {
				writableDatabase.close();
			}
		}
		Log.e("AppDao", tableName + "表删除" + delete + "条数据");

		// 通知内容变化
		if (delete > 0) {
			DBProvider.getInstance().onChange(tableName);
		}

		return delete;
	}

	/**
	 * 修改数据
	 * 
	 * @param clz
	 *            所要操作对象字节码
	 * @param select
	 *            选择条目的条件
	 * @param selectArg
	 *            选择条目的值
	 * @param values
	 *            所要修改的键值对
	 * @return 修改所影响的行数
	 */
	public int update(Class<?> clz, String select, String[] selectArg, ContentValues values) {
		int update = 0;

		SQLiteDatabase writableDatabase = openDataBase;
		String tableName = "";
		try {
			tableName = clz.getName().substring(clz.getName().lastIndexOf(".") + 1) + endTableName;

			update += writableDatabase.update(tableName, values, select, selectArg);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writableDatabase != null) {
				writableDatabase.close();
			}
		}
		Log.e("AppDao", tableName + "表修改所影响了" + update + "条数据");

		// 通知内容变化
		if (update > 0) {
			DBProvider.getInstance().onChange(tableName);
		}

		return update;
	}

	/**
	 * 删除所有数据
	 * 
	 * @param clz
	 * @return 操作所影响的行数
	 */
	public int deleteAll(Class<?> clz) {
		return delete(clz, null, null);
	}

	/**
	 * 根据class的字节码对象来反射获取到以set或get开头的公共方法集合
	 * 
	 * @param clz
	 * @param methodStartsWith
	 *            寻找以什么开头的方法（在这里也就是setXxx()或者getXxx()之类的方法）
	 * @return
	 */
	private List<Method> parseSetMethodList(Class<?> clz, String methodStartsWith) {
		Method[] methods = clz.getMethods();
		List<Method> list = new ArrayList<Method>();

		for (Method m : methods) {
			if (m.getName().startsWith(methodStartsWith)) {
				// 根据方法名获取到参数的名字
				list.add(m);
			}
		}
		return list;
	}
}
