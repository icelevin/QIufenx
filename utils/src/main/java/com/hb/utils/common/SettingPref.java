
package com.hb.utils.common;

import android.content.Context;
import android.text.TextUtils;

import com.hb.utils.BaseApplication;
import com.hb.utils.tools.AESOperator;
import com.hb.utils.tools.Utils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SettingPref extends PreferenceOpenHelper {

	private static SettingPref mSettingPref;

	public SettingPref(Context context, String prefname) {
		super(context, prefname);
	}

	public synchronized static SettingPref getInstance() {
		if (mSettingPref == null) {
			Context context = BaseApplication.getAppContext();
			String name = context.getPackageName();
			mSettingPref = new SettingPref(context, name);
		}
		return mSettingPref;
	}

	public Map<String, ?> getAll() {
		Map<String, ?> all = super.getAll();
		if (all == null || all.size() < 1) {
			return null;
		}

		Set<String> keySet = all.keySet();
		if (keySet == null || keySet.size() < 1) {
			return null;
		}

		Iterator<String> iterator = keySet.iterator();
		if (iterator == null) {
			return null;
		}

		Map<String, Object> decryptMap = new HashMap<String, Object>();
		while (iterator.hasNext()) {
			String key = iterator.next() + "";
			String value = all.get(key) + "";

			if (!TextUtils.isEmpty(key)) {
				key = AESOperator.getInstance().decrypt(key);
			} else {
				continue;
			}

			if (!TextUtils.isEmpty(value)) {
				value = AESOperator.getInstance().decrypt(value);
			}
			decryptMap.put(key, value);
		}
		return decryptMap;
	}

	public String getSplashBanner(){
		return mSettingPref.getString(Key.splashBanner, "");
	}

	public void setSplashBanner(String splashBanner){
		mSettingPref.putString(Key.splashBanner, splashBanner);
	}

	public boolean isFirstOpenDoctorInfoPage(){
		return mSettingPref.getBoolean(Key.isFirstOpenDoctorInfoPage, true);
	}

	public void setFirstOpenDoctorInfoPage(boolean b){
		mSettingPref.putBoolean(Key.isFirstOpenDoctorInfoPage, b);
	}

	public String getSplashImageUrl(){
		return mSettingPref.getString(Key.splashImageUrl, "");
	}

	public void setSplashImageUrl(String value){
		mSettingPref.putString(Key.splashImageUrl, value);
	}

	public boolean isOpenMusic() {
		return mSettingPref.getBoolean(Key.openMusic, true);
	}

	public void setOpenMusic(boolean isopen) {
		mSettingPref.putBoolean(Key.openMusic, isopen);
	}

	public boolean isOpenVibrate() {
		return mSettingPref.getBoolean(Key.openVibrate, true);
	}

	public void setOpenVibrate(boolean isopen) {
		mSettingPref.putBoolean(Key.openVibrate, isopen);
	}

	public boolean isFirstOpen() {
		return mSettingPref.getBoolean(Key.isFirstOpen, true);
	}

	public void setFirstOpen(boolean isFirstOpen) {
		mSettingPref.putBoolean(Key.isFirstOpen, isFirstOpen);
	}

	public void setValue(String key, String value) {
		if (TextUtils.isEmpty(key)) {
			return;
		}
		if (TextUtils.isEmpty(value)) {
			value = new String();
		}
		mSettingPref.putString(key, value + "");
	}

	public String getValue(String key) {
		if (TextUtils.isEmpty(key)) {
			return null;
		}
		String value = mSettingPref.getString(key, "");
		return value;
	}
	
	private static interface Key {
		//每一次升级进入都算是用户第一次打开
		public static final String isFirstOpen = "isFirstOpen"+ Utils.getVersionName(BaseApplication.getAppContext());
		public static final String isFirstOpenDoctorInfoPage = "isFirstOpenDoctorInfoPage";
		public static final String openMusic = "openMusic";
		public static final String openVibrate = "openVibrate";
		public static final String splashImageUrl = "splashImageUrl";  //splash广告图本地保存的文件路径
		public static final String splashBanner = "splashBanner";    //splash广告图json
	}
}
