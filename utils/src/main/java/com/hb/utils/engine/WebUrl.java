package com.hb.utils.engine;


import com.hb.utils.common.ConstUtils;

/**
 * Created by txl on 2017/5/22 0022.
 */
public enum  WebUrl {
    //4.6
//    jkzx("健康资讯",false, ConstUtils.getInstance().getWebUrl()+"Content/List"),
//    jkbk("健康百科",false,Constants.getWebUrl()+"Content/List2?key=hbjk_baike"),
//    jkhd("健康互动",false,Constants.getWebUrl()+"Content/List2?key=hbjk_interaction"),
//    jkcx("健康查询",false,Constants.getWebUrl()+"Content/List2?key=hbjk_query"),
//    jkdh("健康导航",false,Constants.getWebUrl()+"Content/List2?key=hbjk_navigation"),
//    jyfw("就医服务",false,Constants.getWebUrl()+"Content/List2?key=hbjk_jiuyi"),
//    yyzy("医院主页",false,Constants.getWebUrl()+"Content/List2?key=hbjk_hospitals"),
//    hspz("护士陪诊",true,Constants.getWebUrl()+"Escort/DoctorAccompany"),
//    zyph("住院陪护",true,Constants.getWebUrl()+"Escort/HospitalEscort"),
//    jtph("家庭陪护",true,Constants.getWebUrl()+"Escort/FamilyEscor"),
//
//    jztx("就诊提醒",false,Constants.getWebUrl()+"Content/Notice"),
//    yyxz("预约须知",false,Constants.getWebUrl()+"Content/Guide"),
//
//    zcxy("注册协议",false,Constants.getWebUrl()+"Me/Agreement"),
//    mzsm("免责声明",false,Constants.getWebUrl()+"Me/Disclaimer"),
//
//    pzdd("我的订单",true,Constants.getWebUrl()+"Escort/OrderList"),
//
//    ysjj("医生简介",false,Constants.getWebUrl()+"Doctors/Introduce"),
//    defaultEnum("",false,"");

//4.8

    jkzx("健康资讯", false, ConstUtils.getInstance().getStaticWebUrl()+"WXNewList.html"),
    jkbk("健康百科",false,ConstUtils.getInstance().getStaticWebUrl()+"ContentNewList/hbjk_baike/hbjk_baike.html"),
    jkhd("健康互动",false,ConstUtils.getInstance().getStaticWebUrl()+"ContentNewList/hbjk_interaction/hbjk_interaction.html"),
    jkcx("健康查询",false,ConstUtils.getInstance().getStaticWebUrl()+"ContentNewList/hbjk_query/hbjk_query.html"),
    jkdh("健康导航",false,ConstUtils.getInstance().getStaticWebUrl()+"ContentNewList/hbjk_navigation/hbjk_navigation.html"),
    jyfw("就医服务",false,ConstUtils.getInstance().getStaticWebUrl()+"ContentNewList/hbjk_jiuyi/hbjk_jiuyi.html"),
    yyzy("医院主页",false,ConstUtils.getInstance().getStaticWebUrl()+"ContentNewList/hbjk_hospitals/hbjk_hospitals.html"),
    hspz("就医陪诊",true,ConstUtils.getInstance().getWebUrl()+"Escort/DoctorAccompany"),
    zyph("医院陪护",true,ConstUtils.getInstance().getWebUrl()+"Escort/HospitalEscort"),
    jtph("家庭陪护",true,ConstUtils.getInstance().getWebUrl()+"Escort/FamilyEscor"),

    jztx("就诊提醒",false,ConstUtils.getInstance().getWebUrl()+"Content/Notice"),
    yyxz("预约须知",false,ConstUtils.getInstance().getWebUrl()+"Content/Guide"),

    zcxy("注册协议",false,ConstUtils.getInstance().getWebUrl()+"Me/Agreement"),
    mzsm("免责声明",false,ConstUtils.getInstance().getWebUrl()+"Me/Disclaimer"),

    pzdd("我的订单",true,ConstUtils.getInstance().getWebUrl()+"Escort/OrderList"),
    ghzn("挂号指南",false,ConstUtils.getInstance().getWebUrl()+"Content/Consultation"),

    yyjj("医院概况",false,ConstUtils.getInstance().getWebUrl()+"Content/HospitalIntroduction"),
    ysjj("医生简介",false,ConstUtils.getInstance().getWebUrl()+"Doctors/Introduce"),
    yyfw("育婴服务",true,ConstUtils.getInstance().getWebUrl()+"Product/ProductCenter?type=3509f5ff-0d87-49b5-b730-3b01da937e6c"),
    ysfw("月嫂服务",true,ConstUtils.getInstance().getWebUrl()+"Product/ProductCenter?type=6eeeef7b-d42f-4939-b698-672e26b8f39b"),
    crfw("催乳服务",true,ConstUtils.getInstance().getWebUrl()+"Product/ProductCenter?type=af6957ad-174b-4cfa-b080-5444f7e0e94e"),
    slfw("沙龙服务",true,ConstUtils.getInstance().getWebUrl()+"Product/ProductCenter?type=41505fbe-ae52-4ed7-ac9e-878b23d40339"),
    tjfw("体检服务",true,ConstUtils.getInstance().getWebUrl()+"Product/ProductCenter?type=f78841d1-8b8f-453a-ad81-542f24a295f9"),
    shop("微店",false,"https://weidian.com/?userid=1291425973"),
    live("直播讲座",false,ConstUtils.getInstance().getWebUrl()+"Content/LiveDetail?id="),
    defaultEnum("",false,"");

//    public static WebUrl jkzx(String url){
//       return new WebUrl("健康资讯", false, url+"WXNewList.html");
//    }
//
//    public static WebUrl jkbk(String url){
//        return new WebUrl("健康百科",false,url+"ContentNewList/hbjk_baike/hbjk_baike.html");
//    }
//
//    public static WebUrl jkhd(String url){
//        return new WebUrl("健康互动",false,url+"ContentNewList/hbjk_interaction/hbjk_interaction.html");
//    }
//
//    public static WebUrl jkcx(String url){
//        return new WebUrl("健康查询",false,url+"ContentNewList/hbjk_query/hbjk_query.html");
//    }
//
//    public static WebUrl jkdh(String url){
//        return new WebUrl("健康导航",false,url+"ContentNewList/hbjk_navigation/hbjk_navigation.html");
//    }
//
//    public static WebUrl jyfw(String url){
//        return new WebUrl("就医服务",false,url+"ContentNewList/hbjk_jiuyi/hbjk_jiuyi.html");
//    }
//
//    public static WebUrl yyzy(String url){
//        return new WebUrl("医院主页",false,url+"ContentNewList/hbjk_hospitals/hbjk_hospitals.html");
//    }
//
////==================================上面cms获取，下面动态网页==========================================================================
//
//    public static WebUrl hspz(String url){
//        return new WebUrl("护士陪诊",true,url+"Escort/DoctorAccompany");
//    }
//
//    public static WebUrl zyph(String url){
//        return new WebUrl("住院陪护",true,url+"Escort/HospitalEscort");
//    }
//
//    public static WebUrl jtph(String url){
//        return new WebUrl("家庭陪护",true,url+"Escort/FamilyEscor");
//    }
//
//    public static WebUrl jztx(String url){
//        return new  WebUrl("就诊提醒",false,url+"Content/Notice");
//    }
//
//    public static WebUrl yyxz(String url){
//        return  new WebUrl("预约须知",false,url+"Content/Guide");
//    }
//
//    public static WebUrl zcxy(String url){
//        return new WebUrl("注册协议",false,url+"Me/Agreement");
//    }
//
//    public static WebUrl mzsm(String url){
//        return new WebUrl("免责声明",false,url+"Me/Disclaimer");
//    }
//
//    public static WebUrl pzdd(String url){
//        return new WebUrl("我的订单",true,url+"Escort/OrderList");
//    }


    private String url;  //地址
    private String title; //标题
    private boolean login; //是否需要先登录才能打开

    private WebUrl(String title,boolean login,String url) {
        this.url = url;
        this.login = login;
        this.title = title;
    }

    public boolean isLogin() {
        return login;
    }

    public String getUrl() {
        return url;
    }

    public String getTitle() {
        return title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "WebUrl{" +
                "url='" + url + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
