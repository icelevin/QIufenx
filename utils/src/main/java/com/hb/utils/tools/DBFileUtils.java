package com.hb.utils.tools;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.io.File;
import java.io.InputStream;

/**
 * 操作数据库文件
 * 
 * @author hbkj-android
 * 
 */
public class DBFileUtils {

	public final static String name = "medical.db";

	/**
	 * 根据databaseName来打开这个数据库db文件
	 * 
	 * @param databaseName
	 * @return
	 */
	public static SQLiteDatabase openDataBase(Context context, String databaseName) {

		String FileDir = context.getCacheDir() + "/db/";
		String path = FileDir + databaseName;

		// 如果文件夹不存在
		File file = new File(FileDir);
		if (!file.exists()) {
			file.mkdirs();
		}

		// 如果文件不存在
		file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
				InputStream open = context.getAssets().open(databaseName);
				boolean writeFile = FileUtils.writeFile(path, open);
				LogUtils.print("DBFileUtils", "数据库是否写入成功" + writeFile);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		SQLiteDatabase database = SQLiteDatabase.openOrCreateDatabase(file, null);
		return database;
	}
}
