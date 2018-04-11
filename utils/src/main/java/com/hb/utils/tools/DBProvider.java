package com.hb.utils.tools;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;


/**
 * 数据库内容变化监听器
 * @author txl
 *
 */
public class DBProvider {
	
	private static DBProvider dbProvider;
	
	public static DBProvider getInstance(){
		if(dbProvider == null){
			dbProvider = new DBProvider();
		}
		return dbProvider;
	}
	
	//数据库状态变化监听
	private HashMap< OnDBChangeListener<String>,String> hashMap = new HashMap<OnDBChangeListener<String>, String>();
	
	/**
	 * 当tableName表中的数据发生改变时被appDao调用
	 * @param tableName
	 */
	public void onChange(String tableName){
		Set<OnDBChangeListener<String>> keySet = hashMap.keySet();
		Iterator<OnDBChangeListener<String>> iterator = keySet.iterator();
		
		while(iterator.hasNext()){
			OnDBChangeListener<String> next = iterator.next();
			String value = hashMap.get(next);
			if(tableName.equals(value)){
				next.onChange(tableName);
			}
		}
	}
	
	/**
	 * 注册监听
	 * @param tableName
	 * @param onRespanceListener
	 */
	public void addRegisterContentObserver(String tableName,OnDBChangeListener<String> onRespanceListener){
		hashMap.put(onRespanceListener, tableName);
	}
	
	/**
	 * 取消注册监听
	 * @param onRespanceListener
	 */
	public void unRegisterContentObserver(OnDBChangeListener<String> onRespanceListener){
		hashMap.remove(onRespanceListener);
	}

	public static interface  OnDBChangeListener<String>{
		void onChange(String tableName);
	}

}
