package com.hb.utils.tools;

import android.text.TextUtils;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by geely
 */
public class PropertiesUtil {


    private static Properties props;

    static {
        String fileName = "app.prop";
        props = new Properties();
        try {
            props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        String value = props.getProperty(key.trim());
        if(TextUtils.isEmpty(value)){
            return "";
        }
        return value.trim();
    }

    public static String getProperty(String key,String defaultValue){

        String value = props.getProperty(key.trim());
        if(TextUtils.isEmpty(value)){
            value = defaultValue;
        }
        return value.trim();
    }

    public static void setProperty(String key,String value){
        props.setProperty(key,value);
    }
}
