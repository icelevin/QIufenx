package com.hb.utils.net.okhttp;

import okhttp3.Interceptor;
import retrofit2.Retrofit;

/**
 * Created by xianlai on 2017/1/12 0012.
 */
public class ApiFactory {
    /**
     * 创建 Api
     * @param baseUrl         服务器地址
     * @param isDebug         是否debug
     * @param cachePath       缓存路径
     * @param interceptors    拦截器数组
     * @param clz             模型字节码
     * @param <T>
     * @return
     */
    public static <T> T getApi(String baseUrl,boolean isDebug, String cachePath, Interceptor[] interceptors,Class<T> clz) {
        Retrofit retrofit = RetrofitClient.create(baseUrl, isDebug, cachePath, interceptors);
        return retrofit.create(clz);
    }


}
