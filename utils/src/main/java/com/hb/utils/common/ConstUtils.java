package com.hb.utils.common;

import java.lang.reflect.Method;

/**
 * Created by txl on 2017/10/16 0016.
 */

public class ConstUtils {
    private static  ConstUtils constUtils;
    private Class clz;
    private Object obj;

    public static ConstUtils getInstance(){
        if(constUtils == null){
            constUtils = new ConstUtils();
        }
        return constUtils;
    }

    public void init(Class clz){
        this.clz = clz;
        try {
            this.obj = clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ConstUtils(){
    }

    public boolean isDebug(){
        try{
            return (boolean) run("isDebug");
        }catch (Exception e){
            e.printStackTrace();
        }
        return true;
    }

    public String getPassportHost(){
        return (String) run("getPassportHost");
    }
    public String getPassportChannelid(){
        return (String) run("getPassportChannelid");
    }
    public String getPassportSecret(){
        return (String) run("getPassportSecret");
    }

    public String getChannelid(){
        return (String) run("getChannelid");
    }

    public String getWebUrl(){
        return (String) run("getWebUrl");
    }

    public boolean isDebugPay(){
        return (boolean) run("isDebugPay");
    }

    public String getSecret(){
        return (String) run("getSecret");
    }

    public String getApiHost(){
        return (String) run("getApiHost");
    }

    public String getStaticWebUrl(){
        return (String) run("getStaticWebUrl");
    }

    private Object run(String methodName){
        Method isDebug = null;
        Object object = null;
        try {
            isDebug = clz.getMethod(methodName);
            object = isDebug.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
