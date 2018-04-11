package com.hb.utils.tools;

import com.hb.utils.BaseApplication;
import com.hb.utils.common.ConstUtils;
import com.hb.utils.engine.interceptor.BasicParamsInterceptor;
import com.hb.utils.net.okhttp.ApiFactory;

import okhttp3.Interceptor;


/**
 * Created by txl on 2017/1/25 0025.
 */
public class ApiFactoryUtils {
    private static  String cachePath;
    static {
        try{
            cachePath = SDCardUtil.getInstance(BaseApplication.getAppContext()).CACHE_FOLDER;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static <T>  T getApi(String baseUrl,Class<T> clz){
        return getApi(baseUrl,clz,ConstUtils.getInstance().getSecret(),ConstUtils.getInstance().getChannelid(), ConstUtils.getInstance().isDebug());
    }

    public static <T>  T getApi(String baseUrl,Class<T> clz,String secret,String channelid,boolean isDebug){
        Interceptor[] interceptors = new Interceptor[]{new BasicParamsInterceptor(secret, channelid)};
        return ApiFactory.getApi(baseUrl, isDebug, cachePath , interceptors, clz);
    }

    public static <T>  T getApi(Class<T> clz){
        return getApi(ConstUtils.getInstance().getApiHost(),clz);
    }
}
