package com.hb.utils.common;


import com.hb.utils.modle.UpdateModel;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * 所有的网络请求模型均放在此类中
 * <p/>
 * 其中
 * get方法应使用@Query 表示
 * post方法应使用@Field 表示
 * <p/>
 * post方法还需要添加 @FormUrlEncoded 来以表单形式进行提交
 * <p/>
 * Created by xianlai on 2017/1/12 0012.
 */
public class API {

    /**
     * 获取配置信息
     */
    public interface GetCurrentConfigApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("subsystemconfig/GetCurrentConfig")
        Call<String> getConfig(@Field("TargetType") String TargetType, @Field("TargetId") String TargetId, @Field("ChannelId") String ChannelId,
                               @Field("Groupkey") String groupkey, @Field("Key") String key, @Field("PassportId") String PassportId);
    }

    /**
     * 版本更新
     */
    public interface UpdateApi {
        @GET("api/android/version/get")
        Call<UpdateModel> update(@Query("version") String version);
    }

    /**
     * 登录
     */
    public interface LoginApi {
        @FormUrlEncoded
        @POST("account/Login")
        Call<String> login(@Field("LoginName") String loginName, @Field("Password") String password, @Field("PassportId") String passportId, @Field
                ("LoginIp") String loginIp, @Field("PushKey") String pushKey);
    }


    /**
     * 密码登录或验证码登录
     */
    public interface PhoneLoginApi {
        @FormUrlEncoded
        @POST("passport/login")
        Call<String> login(@Field("UserId") String UserId, @Field("UserPwd") String UserPwd, @Field("IsRandomPassport") boolean IsRandomPassport, @Field
                ("AutoRegist") boolean AutoRegist, @Field("LoginChannelId") String LoginChannelId, @Field("PushType") String PushType, @Field("PushKey") String pushKey);
    }

    /**
     * 获取长效授权代码token
     */
    public interface GetTokenApi {
        @FormUrlEncoded
        @POST("passport/gettoken")
        Call<String> get(@Field("TokenCode") String TokenCode);
    }

    /**
     * 获取账户信息passport
     */
    public interface GetPassportApi {
        @FormUrlEncoded
        @POST("passport/getpassport")
        Call<String> get(@Field("OAuthCode") String OAuthCode);
    }


    /**
     * 账户授权绑定
     */
    public interface BindpassportApi {
        @FormUrlEncoded
        @POST("passport/bindpassport")
        Call<String> get(@Field("AuthSource") String AuthSource, @Field("AuthDevice") String AuthDevice, @Field("AuthAccount") String AuthAccount, @Field("AuthCode") String AuthCode, @Field("OAuthCode") String OAuthCode);
    }

    /**
     * 账户退出
     */
    public interface LoginoutApi {
        @FormUrlEncoded
        @POST("passport/loginout")
        Call<String> logout(@Field("PassportId") String PassportId,@Field("AuthSource") String AuthSource, @Field("AuthDevice") String AuthDevice, @Field("AuthAccount") String AuthAccount, @Field("AuthCode") String AuthCode, @Field("OAuthCode") String OAuthCode);
    }

    /**
     * 授权验证
     */
    public interface ValidPassportApi {
        @FormUrlEncoded
        @POST("passport/validpassport")
        Call<String> valid(@Field("AuthSource") String AuthSource, @Field("AuthDevice") String AuthDevice, @Field("AuthAccount") String AuthAccount, @Field("AuthCode") String AuthCode);
    }

    /**
     * 登录发送短信接口
     * OwnerType 所有者类型（手机 0 、邮箱 1、其它..)
     * CheckType 验证码类型(1注册，2找回密码，3登录，4变更绑定..)
     */
    public interface SendverificationcodeApi {
        @FormUrlEncoded
        @POST("passport/sendverificationcode")
        Call<String> send(@Field("OwnerType") int OwnerType, @Field("OwnerCode") String OwnerCode, @Field("CheckType") int CheckType);
    }


    /**
     * 获取用户详细信息
     */
    public interface GetUserInfoApi {
        @FormUrlEncoded
        @POST("account/getuserinfo")
        Call<String> getUserInfo(@Field("PassportId") String pssportId);
    }

    /**
     * 修改真实姓名
     */
    public interface ChangeRealNameApi {
        @FormUrlEncoded
        @POST("account/ChangeRealName")
        Call<String> change(@Field("PassportId") String pssportId, @Field("RealName") String RealName);
    }

    /**
     * 修改登录名
     */
    public interface UpdateLoginNameApi {
        @FormUrlEncoded
        @POST("account/updateloginname")
        Call<String> change(@Field("PassportId") String pssportId, @Field("LoginName") String LoginName, @Field("NewLoginName") String newLoginName);
    }

    /**
     * 判断登录名是否修改过
     */
    public interface CheckLoginNameIsUpdateApi {
        @FormUrlEncoded
        @POST("account/checkloginnameisupdate")
        Call<String> isChange(@Field("PassportId") String pssportId);
    }

    /**
     * 修改昵称
     */
    public interface ChangeNickNameApi {
        @FormUrlEncoded
        @POST("account/ChangeNickname")
        Call<String> change(@Field("PassportId") String pssportId, @Field("Nickname") String Nickname);
    }

    /**
     * 修改手机号
     */
    public interface ModifyUserCellphoneApi {
        @FormUrlEncoded
        @POST("account/modifyusercellphone")
        Call<String> change(@Field("PassportId") String pssportId, @Field("CellPhone") String CellPhone, @Field("ValidCode") String ValidCode);
    }

    /**
     * 修改电子邮箱
     */
    public interface ModifyUserEmailApi {
        @FormUrlEncoded
        @POST("account/modifyuseremail")
        Call<String> change(@Field("PassportId") String pssportId, @Field("Email") String Nickname, @Field("ValidCode") String ValidCode);
    }

    /**
     * 修改密码
     */
    public interface changepwdApi {
        @FormUrlEncoded
        @POST("account/changepwd")
        Call<String> change(@Field("PassportId") String pssportId, @Field("OriginalPwd") String OriginalPwd, @Field("NewPwd") String NewPwd);
    }

    /**
     * 修改电子邮箱时，向新邮箱发送验证码
     */
    public interface SendeMailForappApi {
        @FormUrlEncoded
        @POST("account/sendemailforapp")
        Call<String> sendMail(@Field("PassportId") String pssportId, @Field("Email") String email, @Field("Tag") int tag);
    }

    /**
     * 完善个人信息
     */
    public interface ImprovememberApi {
        @FormUrlEncoded
        @POST("account/improvemember")
        Call<String> improvemember(@FieldMap Map<String, String> names);
    }

    /**
     * 个人头像上传
     */
    public interface changemembericonApi {
        @FormUrlEncoded
        @POST("account/changemembericon")
        Call<String> upload(@Field("PassportId") String pssportId, @Field("FileName") String FileName, @Field("FileStream") String FileStream);
    }


    /**
     * 发送手机短信
     */
    public interface SendPhoneCodeApi {
        @FormUrlEncoded
        @POST("common/sendphonecode")
        Call<String> sendPhoneCode(@Field("Phone") String phone, @Field("Tag") int tag);
    }

    /**
     * 验证手机号是否可以使用
     */
    public interface CheckPhoneApi {
        @FormUrlEncoded
        @POST("account/checkphone")
        Call<String> checkphone(@Field("Phone") String phone);
    }

    /**
     * 注册
     */
    public interface PhoneregistApi {
        @FormUrlEncoded
        @POST("account/phoneregist")
        Call<String> phoneRegist(@Field("CellPhone") String phone, @Field("Password") String password, @Field("ValidCode") String code);
    }

    /**
     * 获取就诊人数量
     */
    public interface UserPatientCountApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("account/userpatientcount")
        Call<String> getCount(@Field("PassportId") String passportId);
    }

    /**
     * 获取就诊卡数量
     */
    public interface UserCardCountApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("account/usercardcount")
        Call<String> getCount(@Field("PassportId") String passportId);
    }

    /**
     * 获取就诊人列表
     */
    public interface selectpatientApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("account/selectpatient")
        Call<String> selectpatient(@Field("PassportId") String passportId, @Field("PageIndex") int PageIndex, @Field("PreCount") int PreCount);
    }

    /**
     * 获取就诊卡列表
     */
    public interface selectpatientcardApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("account/selectpatientcard")
        Call<String> selectpatientcard(@Field("PassportId") String passportId, @Field("PageIndex") int PageIndex, @Field("PreCount") int PreCount);
    }

    /**
     * 添加就诊卡
     */
    public interface addPatientCardApi {
        @FormUrlEncoded
        @POST("account/addcard")
        Call<String> add(@Field("PatientId") String patientId, @Field("OrganizationId") String organizationId, @Field("CardNumber") String
                cardNumber);
    }

    /**
     * 删除就诊卡
     */
    public interface removecardApi {
        @FormUrlEncoded
        @POST("account/removecard")
        Call<String> removecard(@Field("RelationId") String relationId);
    }

    /**
     * 编辑就诊人
     */
    public interface modifypatientApi {
        @FormUrlEncoded
        @POST("account/modifypatient")
        Call<String> modify(@FieldMap Map<String, String> names);
    }

    /**
     * 删除就诊人
     */
    public interface removepatientApi {
        @FormUrlEncoded
        @POST("account/removepatient")
        Call<String> remove(@Field("PatientId") String PatientId);
    }

    /**
     * 添加就诊人
     */
    public interface addpatientApi {
        @FormUrlEncoded
        @POST("account/addpatient")
        Call<String> add(@FieldMap Map<String, String> names);
    }

    /**
     * 根据地理编码获取医院
     */
    public interface GetHospitalByAreaApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("organization/getappointmentorganizations")
        Call<String> get(@Field("Area") String area, @Field("CurPage") int cur, @Field("PageSize") int size);
    }

    /**
     * 根据医院id获取预约科室
     */
    public interface GetDepartmentsByOrgIdApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("Department/GetDepartmentsByOrgId")
        Call<String> get(@Field("OrgId") String orgId, @Field("Property") String Property, @Field("CurPage") int cur, @Field("PageSize") int size);
    }

    /**
     * 号别列表
     * <p>
     * HasDoctor  固定值  false
     */
    public interface getCliniclabelApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("booking/getcliniclabel")
        Call<String> get(@Field("DepartmentId") String DepartmentId, @Field("HasDoctor") boolean HasDoctor);
    }

    /**
     * 医生列表
     */
    public interface getExpertDoctorApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("booking/GetExpertDoctor")
        Call<String> get(@Field("DepartmentId") String DepartmentId);
    }

    /**
     * 判断该号码是否已被注册
     * <p>
     * ResetType 重置类型，0：手机重置，1：邮箱重置  3：邮箱验证码（找回密码） 5：邮箱验证码（绑定邮箱）
     */
    public interface checkMobileApi {
        @FormUrlEncoded
        @POST("account/resetpassword")
        Call<String> check(@Field("Phone") String Phone, @Field("ResetType") int ResetType);
    }

    /**
     * 手机找回密码获取验证码
     */
    public interface sendresetpasswordcodeApi {
        @FormUrlEncoded
        @POST("common/sendresetpasswordcode")
        Call<String> send(@Field("Phone") String Phone, @Field("Tag") int Tag);
    }

    /**
     * 验证手机验证码
     */
    public interface validphonecodeApi {
        @FormUrlEncoded
        @POST("common/validphonecode")
        Call<String> check(@Field("Phone") String Phone, @Field("Code") String Code, @Field("Tag") int Tag);
    }

    /**
     * 修改密码
     */
    public interface updatepassportApi {
        @FormUrlEncoded
        @POST("account/updatepassport")
        Call<String> update(@Field("LoginName") String LoginName, @Field("PassportId") String PassportId, @Field("NewPassword") String NewPassword);
    }

    /**
     * 验证邮箱验证码
     */
    public interface checkcodebyemailApi {
        @FormUrlEncoded
        @POST("account/checkcodebyemail")
        Call<String> check(@Field("Email") String Email, @Field("VailCode") String VailCode, @Field("ResetType") int ResetType);
    }

    /**
     * 加载医生数据、医生简介、医生擅长
     */
    public interface getdoctorInfoApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("employee/getdoctor")
        Call<String> get(@Field("DoctorId") String DoctorId);
    }

    /**
     * 加载号别详细信息
     */
    public interface getclinicinfoApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("booking/getclinicinfobyclinicid")
        Call<String> get(@Field("ClinicId") String ClinicId);
    }

    /**
     * 关注、收藏医生
     */
    public interface followApi {
        @FormUrlEncoded
        @POST("follow/follow")
        Call<String> follow(@Field("PassportId") String PassportId, @Field("TargetId") String DoctorId, @Field("FollowType") int FollowType);
    }

    /**
     * 取消关注、收藏医生
     */
    public interface unfollowApi {
        @FormUrlEncoded
        @POST("follow/unfollow")
        Call<String> unfollow(@Field("PassportId") String PassportId, @Field("TargetId") String DoctorId, @Field("FollowType") int FollowType);
    }

    /**
     * 是否关注、收藏医生
     */
    public interface checkfollowApi {
        @FormUrlEncoded
        @POST("follow/checkfollow")
        Call<String> checkfollow(@Field("PassportId") String PassportId, @Field("TargetId") String DoctorId, @Field("FollowType") int FollowType);
    }

    /**
     * 获取医生坐诊
     */
    public interface DoctorappointmentsApi {
        @FormUrlEncoded
        @POST("booking/searchdoctorappointments")
        Call<String> get(@Field("DoctorId") String DoctorId, @Field("IsClinic") boolean IsClinic);
    }

    /**
     * 获取号别坐诊
     */
    public interface GetcliniclabelAppointmentsApi {
        @FormUrlEncoded
        @POST("booking/searchappointment")
        Call<String> get(@Field("cliniclabelid") String cliniclabelid);
    }

    /**
     * 获取时间段
     */
    public interface GetAppointmentTimepartApi {
        @FormUrlEncoded
        @POST("booking/searchappointmenttimepart")
        Call<String> get(@Field("cliniclabelid") String cliniclabelid, @Field("Date") String Date, @Field("Noon") int Noon, @Field("IsClinic")
                boolean IsClinic);
    }

    /**
     * 获取就诊类型
     */
    public interface getCheckClinicInfoApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("Booking/GetCheckClinicInfo")
        Call<String> get(@FieldMap Map<String, String> values);
    }

    /**
     * 获取预约支付类型
     */
    public interface getPayMethodApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("Booking/GetPayMethod")
        Call<String> get(@Field("OrgId") String OrgId);
    }

    /**
     * 提交预约
     */
    public interface ClinicSubmitApi {
        @FormUrlEncoded
        @POST("booking/ClinicPay")
        Call<String> submit(@FieldMap Map<String, String> values);
    }

    /**
     * 获取我的预约
     */
    public interface CriteriaAppointmentApi {
        @FormUrlEncoded
        @POST("order/searchcriteriaappointment")
        Call<String> get(@FieldMap Map<String, String> values);
    }

    /**
     * 获取标准科室分类
     * <p>
     * <p>
     * 框架最少要有一个参数
     */
    public interface getsubjectinfoApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("subject/getsubjectinfo")
        Call<String> get(@Field("aaa") String aaa);
    }

    /**
     * 获取标准科室
     */
    public interface getbasedepartmentsbysubjectApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("department/getbasedepartmentsbysubject")
        Call<String> get(@Field("SubjectId") String SubjectId);
    }

    /**
     * 取消订单、取消预约
     */
    public interface usercancelappointmentApi {
        @FormUrlEncoded
        @POST("booking/usercancelappointment")
        Call<String> cancel(@Field("PassportId") String PassportId, @Field("AppointmentCode") String AppointmentCode);
    }

    /**
     * 预约（挂号）信息详情
     */
    public interface GetMemAppointmentInfoApi {
        @FormUrlEncoded
        @POST("appointment/GetMemAppointmentInfoById")
        Call<String> get(@Field("PassportId") String PassportId, @Field("AppointmentCode") String AppointmentCode);
    }

    /**
     * 加载标准科室下的医生
     */
    public interface getstanddoctorApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("booking/getstanddoctor")
        Call<String> get(@Field("StandDepartmentId") String StandDepartmentId, @Field("Area") String Area, @Field("PageIndex") int PageIndex,
                         @Field("PreCount") int PreCount);
    }

    /**
     * 站内搜索
     */
    public interface gmixsearchApi {
        @FormUrlEncoded
        @POST("search/gmixsearch")
        Call<String> search(@Field("DataKey") String DataKey, @Field("DataType") String DataType, @Field("PageIndex") int PageIndex, @Field
                ("PreCount") int PreCount);
    }

    /**
     * 站内搜索日志
     */
    public interface gmixsearchLogApi {
        @FormUrlEncoded
        @POST("search/glog")
        Call<String> post(@FieldMap Map<String, String> map);
    }

    /**
     * 我关注的医生
     */
    public interface GetFollowDoctorApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("follow/GetFollowDoctor")
        Call<String> get(@Field("PassportId") String PassportId, @Field("PageIndex") int PageIndex, @Field("PageSize") int PreCount);
    }

    /**
     * 获取常见科室
     */
    public interface getgeneraldepartmentsApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("department/getgeneraldepartments")
        Call<String> get(@Field("Count") int Count);
    }

    /**
     * 提交反馈
     */
    public interface suggestionApi {
        @FormUrlEncoded
        @POST("suggestion/savex")
        Call<String> save(@Field("PassportId") String PassportId, @Field("Content") String Content, @Field("SuggestionType") int SuggestionType,
                          @Field("Images") String Images);
    }

    /**
     * 提交反馈提交图片
     */
    public interface suggestionUploadApi {
        @FormUrlEncoded
        @POST("suggestion/upload")
        Call<String> save(@Field("PassportId") String PassportId, @Field("FileName") String FileName, @Field("FileStream") String FileStream);
    }

    /**
     * 提交反馈提交图片
     */
    public interface getpaychannelApi {
        @FormUrlEncoded
        @POST("booking/getpaychannel")
        Call<String> get(@Field("Commontypeid") String Commontypeid);
    }

    /**
     * 银联支付获取流水号
     */
    public interface AppYinLianPaymentApi {
        @FormUrlEncoded
        @POST("pay/AppPaymentPost")
        Call<String> get(@FieldMap Map<String, String> map);
    }

    /**
     * 获取支付预约详细信息
     */
    public interface GetMemOrderInfoApi {
        @FormUrlEncoded
        @POST("appointment/GetMemOrderInfoById")
        Call<String> get(@Field("passportId") String passportId, @Field("OrderId") String OrderId);
    }

    /**
     * 获取未读消息数量
     */
    public interface getmsgcountbyuserApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("sms/getmsgcountbyuser")
        Call<String> get(@Field("passportId") String passportId);
    }

    /**
     * 获取一级消息列表
     */
    public interface getMsgtypelistbyuserApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("sms/getmsgtypelistbyuser")
        Call<String> get(@Field("passportId") String passportId);
    }

    /**
     * 获取二级消息列表
     */
    public interface getmsginfolistbyuserApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("sms/getmsginfolistbyuser")
        Call<String> get(@Field("passportId") String passportId, @Field("messagetype") String messagetype);
    }

    /**
     * 删除消息
     */
    public interface deletemsgbyidApi {
        @FormUrlEncoded
        @POST("sms/deletemsgbyid")
        Call<String> delete(@Field("passportId") String passportId, @Field("MsgId") String MsgId);
    }

    /**
     * 更新消息
     */
    public interface setmsgreadbyidApi {
        @FormUrlEncoded
        @POST("sms/setmsgreadbyid")
        Call<String> delete(@Field("passportId") String passportId, @Field("MsgId") String MsgId);
    }

    /**
     * 轮播图
     */
    public interface getbiaoshiarticlelistApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("cms/getbiaoshiarticlelist")
        Call<String> get(@Field("HospitalId") String HospitalId, @Field("CallIndex") String CallIndex, @Field("PageSize") String PageSize, @Field("PageIndex") String PageIndex);
    }

    /**
     * 广告图
     */
    public interface getbiaoshiarticlelistforappApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("cms/getbiaoshiarticlelistforapp")
        Call<String> get(@Field("HospitalId") String HospitalId, @Field("CallIndex") String CallIndex, @Field("PageSize") String PageSize, @Field("PageIndex") String PageIndex);
    }

    /**
     * 医院详情
     */
    public interface getOrganizationBaseInfoApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("organization/getOrganizationBaseInfo")
        Call<String> get(@Field("OrganizatonId") String OrganizatonId);
    }

    /**
     * 消费查询
     */
    public interface ConsumersearchApi {
        @FormUrlEncoded
        @POST("patientconsumer/consumersearch")
        Call<String> get(@Field("HospitalId") String hospitalId, @Field("patientId") String patientId, @Field("cardNumber") String cardNumber,
                         @Field("startDate") String startDate, @Field("endDate") String endDate);
    }

    /**
     * 获取医院，包含功能列表
     */
    public interface GetOrganizationListByShiJuApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("organization/GetOrganizationListByShiJu")
        Call<String> get(@Field("Area") String area, @Field("CurPage") int cur, @Field("PageSize") int size);
    }

    /**
     * 报告记录时间
     */
    public interface GetreportdayscountApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("organization/getreportdayscount")
        Call<String> get(@Field("OrgId") String OrgId);
    }

    /**
     * 住院清单
     */
    public interface GethospitalizationconsumelistApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("consume/gethospitalizationconsumelist")
        Call<String> get(@Field("PatientId") String patientId, @Field("CardNumber") String cardNumber, @Field("HospitalId") String HospitalId,
                         @Field("HospitalizationNumber") String HospitalizationNumber,@Field("StartDate")String StartDate,@Field("EndDate")String EndDate,@Field("PageIndex")int PageIndex,@Field("PreCount")int PreCount);
    }


    /**
     * 就诊卡余额查询
     */
    public interface GetcardbalanceApi {
        @FormUrlEncoded
        @POST("cardrecharge/getcardbalance")
        Call<String> get(@FieldMap Map<String, String> map);
    }

    /**
     * 充值记录查询
     */
    public interface GetOrderHospitalCzListApi {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("order/GetOrderCzList")
        Call<String> get(@Field("PassportId") String PassportId, @Field("PageIndex") int PageIndex, @Field("PageSize") int PageSize);
    }


    /**
     * 获取检验报告查询列表
     */
    public interface Getexaminesearch {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("patientexamine/examinesearch")
        Call<String> get(@Field("StartDate") String startDate, @Field("EndDate") String endDate, @Field("HospitalId") String hospitalId, @Field("PatientId") String patientId, @Field("CardNumber") String cardNumber);

    }

    /**
     * 获取检验详情
     */
    public interface Getexaminesearchdetail {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("patientexamine/examinesearchdetail")
        Call<String> get(@Field("ExamineId") String ExamineId, @Field("ExamineName") String ExamineName, @Field("OrgId") String OrgId);
    }


    /**
     * 获取检查列表
     */
    public interface GetInspectSearch {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("patientinspect/inspectsearch")
        Call<String> get(@Field("StartDate") String startDate, @Field("EndDate") String endDate, @Field("HospitalId") String hospitalId, @Field("PatientId") String patientId, @Field("CardNumber") String cardNumber);
    }

    /**
     * 获取检查详情
     */
    public interface GetInspectSearchDetail {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("patientinspect/inspectsearchdetail")
        Call<String> get(@Field("InspectId") String inspectId, @Field("OrgId") String orgId);
    }

    /**
     * 获取电子病历列表
     */
    public interface GetEmrList {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("patientrecord/queuesearch")
        Call<String> get(@Field("HospitalId") String hospitalId, @Field("PatientId") String patientId, @Field("CardNumber") String cardNumber);
    }

    /**
     * 获取电子病历详情
     */
    public interface GetPatientInfo {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("patientrecord/getpatientinfo")
        Call<String> get(@Field("OrgId") String OrgId, @Field("RecordId") String RecordId);
    }

    /**
     * 价目查询
     */
    public interface GetPriceItemSearch {
        @FormUrlEncoded
        @POST("patientqueue/PriceItemSearch")
        Call<String> get(@Field("Keyword") String Keyword, @Field("Type") String Type, @Field("OrgId") String OrgId);
    }

    /**
     * 价表类型
     */
    public interface GetPriceList {
        @Headers({"isCache: true"})
        @FormUrlEncoded
        @POST("patientqueue/GetPriceList")
        Call<String> get(@Field("OrgId") String OrgId, @Field("Keyword") String Keyword, @Field("Type") String Type);
    }

    /**
     * 根据经纬度获取城市
     */
    public interface GetCity {
        @Headers({"isCache: true"})
        @GET("weather/cityid")
        Call<String> get(@Query("location") String location);
    }

    /**
     * 根据城市获取当前天气
     */
    public interface GetNowWeather {
        @GET("weather/now")
        Call<String> get(@Query("cityid") String cityid);
    }

    /**
     * 联网获取ip
     */
    public interface GetWeatherIp {
        @Headers({"isCache: true"})
        @GET("weather/ip")
        Call<String> get();
    }

    /**
     * 获取直播列表
     */
    public interface GetLiveList {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("live/getarticlelistforlive")
        Call<String> get(@Field("hospitalid") String hospitalid, @Field("sortid") String sortid, @Field("categoryid") String categoryid, @Field("pageindex") String pageindex, @Field("pagesize") String pagesize);
    }

    /**
     * 获取找医院列表
     */
    public interface GetHospitalList {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("hospitalinfo/GetHospitalList")
        Call<String> get(@Field("HosId") String HosId, @Field("Area") String Area, @Field("HosProperty") String HosProperty, @Field("OrderByType") String OrderByType, @Field("Longitude") String Longitude, @Field("Latitude") String Latitude, @Field("IsBook") String IsBook, @Field("PageIndex") int PageIndex, @Field("PageSize") int PageSize, @Field("ImageUrl") String ImageUrl);
    }

    /**
     * 获取找医院详情
     */
    public interface GetHospitalType {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("hospitalinfo/GetHospitalTypeList")
        Call<String> get(@Field("OrderByType") String OrderByType);
    }

    /**
     * 获取老医院详情
     */
    public interface GetHosByGuidApi {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("organization/getOrganizationInfo")
        Call<String> get(@Field("OrganizatonId") String OrganizatonId, @Field("OrganizatonCode") String OrganizatonCode);
    }

    /**
     * 获取新医院详情
     */
    public interface GetNewHosByGuidApi {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("hospitalinfo/GetHosByGuid")
        Call<String> get(@Field("HosId") String hosid);
    }

    /**
     * 获取关注的医院列表
     * follow/GetFollowHospital
     */
    public interface GetFollowHospital {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("follow/GetFollowHospital")
        Call<String> get(@Field("PassportId") String PassportId, @Field("PageIndex") int PageIndex, @Field("PageSize") int PageSize);
    }

    /**
     * 获取诊间支付-待缴费
     * innerclinic/getinnerclinic
     */
    public interface GetInnerClinic {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("innerclinic/getinnerclinic")
        Call<String> get(@Field("HospitalId") String HospitalId, @Field("PatientId") String PatientId, @Field("CardNum") String CardNum);
    }

    /**
     * cardrecharge/recharepay
     * 产生就诊卡充值订单
     */
    public interface ReCharePay {
        @FormUrlEncoded
        @POST("cardrecharge/recharepay")
        Call<String> get(@Field("PassportId") String PassportId, @Field("HospitalId") String HospitalId, @Field("PatientName") String PatientName, @Field("IdType") String IdType, @Field("IdNumber") String IdNumber, @Field("CardNumber") String CardNumber, @Field("PayMoney") String PayMoney, @Field("CardPassword") String CardPassword);
    }

    /**
     * cardrecharge/getorder
     * 获取就诊卡充值订单
     */
    public interface getOrder {
        @FormUrlEncoded
        @POST("cardrecharge/getorder")
        Call<String> get(@Field("PassportId") String PassportId, @Field("OrderId") String OrderId);
    }

    /**
     * innerclinic/innerclinicpatientcardpay
     * 就诊卡支付接口
     */
    public interface GetInnerClinicPatientCardPay {
        @FormUrlEncoded
        @POST("innerclinic/innerclinicpatientcardpay")
        Call<String> get(@Field("PassportId") String PassportId, @Field("OrderId") String OrderId, @Field("CardPassword") String CardPassword, @Field("SignTimestamp") String SignTimestamp);
    }

    /**
     * cardrecharge/hbpaymentpost
     * 就诊卡充值网关
     */
    public interface hbpaymentpost {
        @FormUrlEncoded
        @POST("cardrecharge/hbpaymentpost")
        Call<String> get(@Field("PassportId") String PassportId, @Field("OrderId") String OrderId, @Field("OrderNumber") String OrderNumber, @Field("OrderAmount") String OrderAmount, @Field("CustomerIp") String CustomerIp, @Field("SettlementDate") String SettlementDate, @Field("PayChannelId") String PayChannelId, @Field("CardPassword") String CardPassword);
    }

    /**
     * order/GetOrderHospitalCzList
     * 住院预交金充值订单
     */
    public interface GetOrderHospitalCzList {
        @Headers({"isCache:true"})
        @FormUrlEncoded
        @POST("order/GetOrderHospitalCzList")
        Call<String> get(@Field("PassportId") String PassportId, @Field("PageIndex") int PageIndex, @Field("PageSize") int PageSize);
    }

    /**
     * 智能排队-我的排队
     */
    public interface QueuesearchApi {
        @FormUrlEncoded
        @POST("patientqueue/queuesearch")
        Call<String> queue(@Field("hospitalid") String hospitalid, @Field("patientid") String patientid, @Field("departmentid") String departmentid);
    }

    /**
     * 智能排队-科室下队列搜索
     */
    public interface QueueSearchByDepartmentIdApi {
        @FormUrlEncoded
        @POST("patientqueue/QueueSearchByDepartmentId")
        Call<String> queue(@Field("hospitalid") String hospitalid, @Field("patientid") String patientid, @Field("departmentid") String departmentid);
    }

}
