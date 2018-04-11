package cn.qiufenxi.www.qfx.common;

import cn.qiufenxi.www.qfx.BuildConfig;

public class Constants {
    private static final boolean isDebugPay =  false;
    public static final boolean isDebug = BuildConfig.log_debug;
    public static final String appid = "50000001";
    public static final String hospitalid = "61010014";
    public static final int codeTime = 60;   //重发验证码等待时间
    public static final long cacheTime = 1000 * 60 * 60 * 24;
    private final static String deviceType = "android";

    private static final String shareAppUrl = "http://health.hbjk114.com/home/downloadapp";
    private static final String shareTitle = "西安就医神器（必藏）";
    private static final String shareContent = "西安核心三甲医院在线预约挂号，陪诊陪护服务。（西京医院，中医医院，儿童医院...）";

    private static final String Host = BuildConfig.Host;
    private static final String channelid = BuildConfig.channelid;
    private static final String secret = BuildConfig.secret;

    private static final String passportHost = BuildConfig.passportHost;
    private static final String passportChannelid = BuildConfig.passportChannelid;
    private static final String passportSecret = BuildConfig.passportSecret;

    private static final String webUrl = BuildConfig.webUrl; //八大模块中的页面地址
    private static final String staticWebUrl = BuildConfig.staticwebUrl;   //八大模块中做了静态页面的cms地址



    //外网正式地址
//    private static final String Host = "http://106.14.255.226:8027/";
//    private static final String channelid = "01000896-a724-a11a-42c9-0b1ecb17c606";
//    private static final String secret = "0100023b-a724-b26c-4657-a8d8924c9d6a";
//    private static final String webUrl = "http://106.14.255.226:8028/";
//    private static final String wzUrl = "http://android.hbjk114.com/";


    public static String getPassportHost() {
        return passportHost+"api/";
    }

    public static String getPassportChannelid() {
        return passportChannelid;
    }

    public static String getPassportSecret() {
        return passportSecret;
    }

    private static final String ApiHost = getHost() + "api/";

    public static String getDeviceType() {
        return deviceType;
    }

    public static String getChannelid() {
        return channelid;
    }

    public static String getWebUrl() {
        return webUrl;
    }

    public static boolean isDebugPay() {
        return isDebugPay;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static String getSecret() {
        return secret;
    }

    public static String getHospitalid() {
        return hospitalid;
    }


    public static String getAppid() {
        return appid;
    }


    public static String getApiHost() {
        return ApiHost;
    }

    public static String getHost() {
        return Host;
    }


    public static String getShareAppUrl() {
        return shareAppUrl;
    }

    public static String getShareTitle() {
        return shareTitle;
    }

    public static String getShareContent() {
        return shareContent;
    }

    public static String getStaticWebUrl() {
        return staticWebUrl;
    }
}
