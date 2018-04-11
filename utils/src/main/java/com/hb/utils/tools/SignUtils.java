package com.hb.utils.tools;

import android.text.TextUtils;


import com.hb.utils.modle.User;
import com.hb.utils.modle.login.Passport;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * Created by xianlai on 2017/1/12 0012.
 */
public class SignUtils {

    /**
     * weburl签名
     *
     * @return
     */
    public static Map<String, String> getWebMap(String channelid,String secret) {
        Map<String, String> mapParm = new LinkedHashMap<>();

        Passport loginUser = DBUtils.getPassport();

        if (loginUser != null) {
            String timeSpan = DateFormat.getFormatDate(DateFormat.yyyy_MM_dd_HH_mm_ss_1);
            //组装map,key需小写，不然影响排序
            mapParm.put("channel", channelid);
            mapParm.put("secret", secret);
            mapParm.put("timestamp", timeSpan);
            mapParm.put("ssopassportid", loginUser.getPassportId());
        }
        return mapParm;
    }

    /**
     * api签名
     *
     * @return
     */
    public static Map<String, String> getApiMap(String channelid) {
        Passport passport  =  DBUtils.getPassport();

        Map<String, String> mapParm = new LinkedHashMap<>();

        String timeSpan = DateFormat.getFormatDate(DateFormat.yyyy_MM_dd_HH_mm_ss);
        //组装map,key需小写，不然影响排序
        mapParm.put("channelid", channelid);
        mapParm.put("timestamp", timeSpan);
        if(passport != null){
            mapParm.put("passportid",passport.getPassportId());
        }
        return mapParm;
    }

    /**
     * 根据参数生成MD5签名, 获得签名 注：方法中参数paramMap即参数键值对的Map存储，参数secret即应用的Secret Key。
     *
     * @param paramMap
     * @param secret
     * @return
     */
    public static String getSignature(boolean isSort,Map<String, String> paramMap, String secret) throws UnsupportedEncodingException {
        List<String> paramList = new ArrayList<>(paramMap.size());
        List<String> keyList = new ArrayList<>(paramMap.size());
        // 1、参数格式化
        for (Map.Entry<String, String> param : paramMap.entrySet()) {
            keyList.add(param.getKey());
        }
        // 2、排序并拼接成一个字符串
        StringBuffer buffer = new StringBuffer();
        buffer.append(secret);
        buffer.append("(");
        if(isSort){
            Collections.sort(keyList);
        }
        for (String k : keyList) {
            String v = paramMap.get(k);
            v = URLDecoder.decode(v, "UTF-8");
            paramList.add(k + "=" + v);
            if (v == null || "".equals(v)) {
                continue;
            }
            buffer.append(k + "=" + v);
        }

        buffer.append(")");
        // 4、将拼好的字符串转成MD5值
        return Utils.md5(buffer.toString()).toUpperCase(Locale.getDefault());
    }
}
