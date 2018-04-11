package com.hb.utils.engine.interceptor;



import com.hb.utils.tools.SignUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by xianlai on 2017/1/12 0012.
 */
public class BasicParamsInterceptor implements Interceptor {

    private String secret,channelid;

    public BasicParamsInterceptor(String secret,String channelid){
        this.secret = secret;
        this.channelid = channelid;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        // 重新创建请求,添加参数
        Request request = addParam(chain.request());
        Response response = chain.proceed(request);
        return response;
    }

    /**
     * 添加公共参数
     *
     * @param originalRequest
     * @return
     */
    private Request addParam(Request originalRequest) {
        Map<String, String> mapParm = SignUtils.getApiMap(channelid);

        HttpUrl modifiedUrl = originalRequest.url();
        if (originalRequest.method().equals("POST")) {

            //请求体定制：统一添加token参数
            if (originalRequest.body() instanceof FormBody) {
                FormBody.Builder newFormBody = new FormBody.Builder();
                FormBody oidFormBody = (FormBody) originalRequest.body();
                for (int i = 0; i < oidFormBody.size(); i++) {
                    mapParm.put(oidFormBody.encodedName(i).toLowerCase(Locale.getDefault()), oidFormBody.encodedValue(i));
                }
                for (String key : mapParm.keySet()) {
                    newFormBody.addEncoded(key, mapParm.get(key));
                }
                //获取sign
                String sign = getSign(mapParm);
                newFormBody.addEncoded("sign", sign);

                // 新的请求
                return originalRequest.newBuilder().method(originalRequest.method(), newFormBody.build()).url(modifiedUrl).build();
            } else {
                //不是FormBody    以后再说
                return originalRequest;
            }
        } else {
            //创建新的url,老url上的参数依然存在于新url上
            HttpUrl.Builder builder = originalRequest.url().newBuilder();

            //将map上的参数追加入url
            Object[] keys = mapParm.keySet().toArray();
            for (int i = 0; i < mapParm.size(); i++) {
                String key = keys[i].toString();
                builder.addQueryParameter(key, mapParm.get(key));
            }

            for (int i = 0; i < modifiedUrl.querySize(); i++) {
                String name = modifiedUrl.queryParameterName(i);
                String value = modifiedUrl.queryParameterValue(i);
                //将旧url上已有的参数加入map
                mapParm.put(name, value);
            }

            //获取sign
            String sign = getSign(mapParm);
            //将sign加入
            builder.addQueryParameter("sign", sign);
            //创建url
            modifiedUrl = builder.build();
            // 新的请求
            return originalRequest.newBuilder().method(originalRequest.method(), originalRequest.body()).url(modifiedUrl).build();
        }
    }

    /**
     * 获取对参数的签名
     *
     * @param mapParm
     * @return
     */
    public String getSign(Map<String, String> mapParm) {
        //获取sign
        String sign = "sign_error";
        try {
            sign = SignUtils.getSignature(true, mapParm,secret);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return sign;
    }
}

