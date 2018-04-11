package com.hb.utils.engine.result;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.hb.utils.modle.BaseModel;
import com.hb.utils.modle.CacheModle;
import com.hb.utils.net.listener.OnResultListener;
import com.hb.utils.net.okhttp.HttpCodeMessage;
import com.hb.utils.tools.DBUtils;
import com.hb.utils.tools.LogUtils;

import okhttp3.FormBody;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * 这个类中统一处理 api 接口返回响应的处理
 * <p/>
 * 如果发生了http错误，将判断httpcode的状态来返回错误提示信息
 * 如果没有发生http错误,将返回响应
 * <p/>
 * Created by xianlai on 2017/1/13 0013.
 */
public class ApiCallback<T extends BaseModel> implements Callback<String> {
    private OnResultListener<T> listener;
    private Class<T> clz;

    public ApiCallback(Call<String> call, Class<T> clz, OnResultListener<T> listener) {
        this.listener = listener;
        this.clz = clz;

        try{
            //首先获取缓存数据
            Request request = call.request();
            String urlByRequest = ApiCallback.getUrlByRequest(request);

            if (TextUtils.isEmpty(urlByRequest)) {
                return;
            }
            T cache = DBUtils.getCache(urlByRequest, clz);
            if (cache != null && listener != null) {
                listener.onResult(cache);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public String onPreResponse(String body) {

        return body;
    }


    /**
     * Invoked for a received HTTP response.
     * <p/>
     * Note: An HTTP response may still indicate an application-level failure such as a 404 or 500.
     * Call {@link Response#isSuccessful()} to determine if the response indicates success.
     *
     * @param call
     * @param response
     */
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        T obj = null;

        if (response == null) {
            obj = createObj(response);
            listener.onResult(obj);
            return;
        }

        String str = response.body();
        str = onPreResponse(str);
        LogUtils.print(ApiCallback.class.getName(), "请求：" + call.request().url() + "\n响应：" + str);

        if (TextUtils.isEmpty(str)) {
            obj = createObj(response);
            if(listener != null){
                listener.onResult(obj);
            }
        } else if (response.isSuccessful()) {
            try {
                obj = new Gson().fromJson(str, clz);
                //缓存逻辑
                cache(call.request(), str, obj);
            } catch (Exception e) {
                e.printStackTrace();
                obj = createObj(response);
            }
            if(listener != null){
                listener.onResult(obj);
            }
        }
    }

    /**
     * Invoked when a network exception occurred talking to the server or when an unexpected
     * exception occurred creating the request or processing the response.
     *
     * @param call
     * @param t
     */
    @Override
    public void onFailure(Call<String> call, Throwable t) {
        T body = createObj(null);
        if(listener != null){
            listener.onResult(body);
        }
        LogUtils.print(ApiCallback.class.getName(), t.getLocalizedMessage());
    }

    /**
     * 根据字节码创建出对象
     *
     * @return
     */
    private T createObj(Response<String> response) {
        T obj = null;
        try {
            obj = clz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        if(response != null){
            int code = response.code();
            String message = new HttpCodeMessage().codeHandle(code);
            obj.setMessage(message);
            obj.setResultCode(code);
        }
        return obj;
    }

    /**
     * 执行缓存
     *
     * @param request
     * @param obj
     */
    private void cache(Request request, String result, T obj) {
        String isCache = request.header("isCache");
        if (TextUtils.isEmpty(isCache)) {
            return;
        }

        if (obj.getResultCode() != 1) {
            return;
        }

        try {
            //检查数据体是否为null，如果为空不缓存
            BaseModel parseBaseModel = new Gson().fromJson(result, BaseModel.class);
            if (parseBaseModel.getResultData() == null) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        CacheModle cacheModle = new CacheModle();
        String url = getUrlByRequest(request);
        if (TextUtils.isEmpty(url)) {
            return;
        }

        cacheModle.setUrl(url);
        cacheModle.setResponse(result);
        DBUtils.saveCache(cacheModle);
    }

    /**
     * 从request获取请求
     *
     * @param request
     * @return
     */
    public static String getUrlByRequest(Request request) {
        String url = "";
        if (!request.method().equals("POST")) {
            //均以get处理
            url = request.url().toString();
            return url;
        }

        if (!(request.body() instanceof FormBody)) {
            //对于这种情况暂时不处理
            url = "request.body not instanceof FormBody";
            return url;
        }
        FormBody formBody = (FormBody) request.body();
        StringBuilder builder = new StringBuilder();
        builder.append(request.url());
        builder.append("?");
        for (int i = 0; i < formBody.size(); i++) {
            String name = formBody.name(i);
            String value = formBody.value(i);

            //检查是否是分页，如果是分页检查是否是第一页，只缓存第一页
            if ("PageIndex".equalsIgnoreCase(name) && !"1".equals(value)) {
                return "";
            }

            //剔除掉时间与签名参数
            if ("timestamp".equals(name)) {
                continue;
            } else if ("sign".equals(name)) {
                continue;
            }

            builder.append(name + "=" + value);
            builder.append("&");
        }
        url = builder.toString();
        return url;
    }
}
