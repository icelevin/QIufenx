package com.hb.utils;


import android.content.Context;
import android.provider.SyncStateContract;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.hb.utils.common.ConstUtils;
import com.hb.utils.common.SettingPref;
import com.hb.utils.tools.MyBaseExceptionHandler;
import com.hb.utils.tools.Utils;

/**
 * Created by txl on 2017/5/26 0026.
 */
public class BaseApplication extends MultiDexApplication {
    private static BaseApplication application;

    @Override
    public void onCreate() {
        super.onCreate();
        BaseApplication.application = this;
        Thread.setDefaultUncaughtExceptionHandler(new MyBaseExceptionHandler());
    }

    public static BaseApplication getAppContext() {
        return BaseApplication.application;
    }
}
