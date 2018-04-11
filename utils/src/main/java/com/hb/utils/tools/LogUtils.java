package com.hb.utils.tools;

import android.util.Log;

import com.hb.utils.BuildConfig;


/**
 * Created by txl on 2017/2/6 0006.
 */
public class LogUtils {
    public static void print(String tag,String message){
        if(tag == null || message == null){
            return;
        }
        if(BuildConfig.DEBUG){
            Log.e(tag,message);
        }
    }
}
