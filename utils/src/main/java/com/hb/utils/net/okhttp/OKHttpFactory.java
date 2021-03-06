package com.hb.utils.net.okhttp;


import com.hb.utils.common.ConstUtils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * Created by xianlai on 2017/1/12 0012.
 */
public class OKHttpFactory {

    private final OkHttpClient okHttpClient;

    private static final int TIMEOUT_READ = ConstUtils.getInstance().isDebug()?60:60;
    private static final int TIMEOUT_CONNECTION = ConstUtils.getInstance().isDebug()?60:60;
    private static final int TIMEOUT_WRITE = ConstUtils.getInstance().isDebug()?60:60;


    public OKHttpFactory(boolean isDebug, String cachePath, Interceptor[] interceptors) {
        //打印请求Log
        HttpLoggingInterceptor logInterceptor = new HttpLoggingInterceptor();

        if (isDebug) {
            //debug 模式下开启日志
            logInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            //非debug 模式下关闭日志
            logInterceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
        }

        //缓存目录
        File cacheFile = new File(cachePath, "netWorkCache");
        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100);

        OkHttpClient.Builder builder = new OkHttpClient.Builder()

                //必须是设置Cache目录
                .cache(cache)
                //失败重连
                .retryOnConnectionFailure(true)
                //read time out
                .readTimeout(TIMEOUT_READ, TimeUnit.SECONDS)
                //write time out
                .writeTimeout(TIMEOUT_WRITE, TimeUnit.SECONDS)
                //connect time out
                .connectTimeout(TIMEOUT_CONNECTION, TimeUnit.SECONDS);
        //设置拦截器
        if (interceptors != null && interceptors.length > 0) {
            for (int i = 0; i < interceptors.length; i++) {
                Interceptor interceptor = interceptors[i];
                if (interceptor == null) {
                    continue;
                }
                builder.addInterceptor(interceptor);
            }
        }

        //打印请求log
        builder.addInterceptor(logInterceptor);

        okHttpClient = builder.build();
    }

    public OkHttpClient getOkHttpClient() {

        return okHttpClient;
    }
}
