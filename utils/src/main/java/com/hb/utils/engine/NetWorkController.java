package com.hb.utils.engine;


import android.text.TextUtils;

import com.google.gson.Gson;
import com.hb.utils.BaseApplication;
import com.hb.utils.R;
import com.hb.utils.common.API;
import com.hb.utils.common.ConstUtils;
import com.hb.utils.common.SettingPref;
import com.hb.utils.engine.observable.UserInfoObservable;
import com.hb.utils.engine.result.ApiCallback;
import com.hb.utils.modle.AppointmentListModel;
import com.hb.utils.modle.AppointmentTimePartModel;
import com.hb.utils.modle.AppointmentTypeModel;
import com.hb.utils.modle.BannerModel;
import com.hb.utils.modle.BaseModel;
import com.hb.utils.modle.CardBlanceModel;
import com.hb.utils.modle.CardRechargeModel;
import com.hb.utils.modle.CardRechargeRecordModel;
import com.hb.utils.modle.ClinicAppointmentModel;
import com.hb.utils.modle.ClinicOrderInfoModle;
import com.hb.utils.modle.ClinicResultModel;
import com.hb.utils.modle.CliniclabelModel;
import com.hb.utils.modle.CommonlyDepartModel;
import com.hb.utils.modle.CountModel;
import com.hb.utils.modle.DepartClassItemModel;
import com.hb.utils.modle.DepartClassModle;
import com.hb.utils.modle.DepartModel;
import com.hb.utils.modle.DoctorAppointmentModel;
import com.hb.utils.modle.DoctorInfoModel;
import com.hb.utils.modle.EmrListModel;
import com.hb.utils.modle.ExamineDetailsModel;
import com.hb.utils.modle.ExpenseQueryModel;
import com.hb.utils.modle.FollowModel;
import com.hb.utils.modle.HospitalInfoModel;
import com.hb.utils.modle.HospitalListModel;
import com.hb.utils.modle.HospitalModel;
import com.hb.utils.modle.HospitalNewInfoModel;
import com.hb.utils.modle.HospitalTypeModel;
import com.hb.utils.modle.ImageUploadResultModel;
import com.hb.utils.modle.ExamineListModel;
import com.hb.utils.modle.InspectListModel;
import com.hb.utils.modle.InspectSearchDetailModel;
import com.hb.utils.modle.LiveListModel;
import com.hb.utils.modle.MainFestsModel;
import com.hb.utils.modle.MessageBeanModel;
import com.hb.utils.modle.MessageTypeListModel;
import com.hb.utils.modle.PatientCardModel;
import com.hb.utils.modle.PatientModel;
import com.hb.utils.modle.PatientRecordInfoModel;
import com.hb.utils.modle.PayChannelModel;
import com.hb.utils.modle.PayOrderStatusModel;
import com.hb.utils.modle.PayTypeModel;
import com.hb.utils.modle.PriceItemSearchModel;
import com.hb.utils.modle.PriceListModel;
import com.hb.utils.modle.QueueListModel;
import com.hb.utils.modle.SerachValueModel;
import com.hb.utils.modle.SettingListModel;
import com.hb.utils.modle.SettingModel;
import com.hb.utils.modle.UnionpayQidModel;
import com.hb.utils.modle.UpdateModel;
import com.hb.utils.modle.User;
import com.hb.utils.modle.UserInfo;
import com.hb.utils.modle.UserInfoModel;
import com.hb.utils.modle.UserModel;
import com.hb.utils.modle.config.ConfigModel;
import com.hb.utils.modle.login.Passport;
import com.hb.utils.modle.login.PassportModel;
import com.hb.utils.modle.login.TokenModel;
import com.hb.utils.modle.weather.NowWeatherModel;
import com.hb.utils.modle.weather.WeatherCityModel;
import com.hb.utils.modle.weather.WeatherIpModel;
import com.hb.utils.net.listener.OnResultListener;
import com.hb.utils.net.okhttp.ApiFactory;
import com.hb.utils.tools.ApiFactoryUtils;
import com.hb.utils.tools.DBUtils;
import com.hb.utils.tools.DeviceUtils;
import com.hb.utils.tools.LogUtils;
import com.hb.utils.tools.Utils;
import com.hb.utils.tools.glide.ImageLoadUtils;
import com.hb.utils.view.recycler.adapter.BaseRecyclerAdapter;


import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;

/**
 * 业务网络请求处理类
 * <p/>
 * Created by xianlai on 2017/1/13 0013.
 */
public enum NetWorkController {
    INSTANCE;

    /**
     * 获取配置信息
     *
     * @param targetType
     * @param targetId
     * @param groupKey
     * @param key
     * @param listener
     */
    public Call<String> getConfig(String targetType, String targetId, String groupKey, String key, OnResultListener<ConfigModel> listener) {
        Passport passport = DBUtils.getPassport();
        String passportId = "";
        if (passport != null) {
            passportId = passport.getPassportId();
        }
        API.GetCurrentConfigApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetCurrentConfigApi.class);
        Call<String> call = api.getConfig(targetType, targetId, ConstUtils.getInstance().getChannelid(), groupKey, key, passportId);
        call.enqueue(new ApiCallback<ConfigModel>(call, ConfigModel.class, listener) {
            @Override
            public String onPreResponse(String body) {
                if (body == null || "".equals(body)) {
                    return super.onPreResponse(body);
                }

                if (body.contains("\"{")) {
                    body = body.replaceAll("\"\\{", "{");
                }

                if (body.contains("}\"")) {
                    body = body.replaceAll("\\}\"", "}");
                }

                if (body.contains("&#39;")) {
                    body = body.replaceAll("&#39;", "\"");
                }
                return body;
            }
        });
        return call;
    }

    /**
     * 获取配置信息
     *
     * @param targetType
     * @param targetId
     * @param groupKey
     * @param key
     * @param listener
     */
    public Call<String> getConfigs(String targetType, String targetId, String groupKey, String key, OnResultListener<SettingModel> listener) {
        Passport passport = DBUtils.getPassport();
        String passportId = "";
        if (passport != null) {
            passportId = passport.getPassportId();
        }
        API.GetCurrentConfigApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetCurrentConfigApi.class);
        Call<String> call = api.getConfig(targetType, targetId, ConstUtils.getInstance().getChannelid(), groupKey, key, passportId);
        call.enqueue(new ApiCallback<SettingModel>(call, SettingModel.class, listener) {
            @Override
            public String onPreResponse(String body) {
                if (body == null || "".equals(body)) {
                    return super.onPreResponse(body);
                }

                if (body.contains("\"{")) {
                    body = body.replaceAll("\"\\{", "{");
                }

                if (body.contains("}\"")) {
                    body = body.replaceAll("\\}\"", "}");
                }

                if (body.contains("&#39;")) {
                    body = body.replaceAll("&#39;", "\"");
                }
                if (body.contains("\"[")) {
                    body = body.replaceAll("\"\\[", "[");
                }

                if (body.contains("]\"")) {
                    body = body.replaceAll("]\"", "]");
                }
                if (body.contains("\\")) {
                    body = body.replaceAll("\\\\", "");
                }
                return body;
            }
        });
        return call;
    }

    /**
     * 获取配置信息
     *
     * @param targetType
     * @param targetId
     * @param groupKey
     * @param key
     * @param listener
     */
    public Call<String> getConfiges(String targetType, String targetId, String groupKey, String key, OnResultListener<SettingListModel> listener) {
        Passport passport = DBUtils.getPassport();
        String passportId = "";
        if (passport != null) {
            passportId = passport.getPassportId();
        }
        API.GetCurrentConfigApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetCurrentConfigApi.class);
        Call<String> call = api.getConfig(targetType, targetId, ConstUtils.getInstance().getChannelid(), groupKey, key, passportId);
        call.enqueue(new ApiCallback<SettingListModel>(call, SettingListModel.class, listener) {
            @Override
            public String onPreResponse(String body) {
                if (body == null || "".equals(body)) {
                    return super.onPreResponse(body);
                }

                if (body.contains("\"{")) {
                    body = body.replaceAll("\"\\{", "{");
                }

                if (body.contains("}\"")) {
                    body = body.replaceAll("\\}\"", "}");
                }

                if (body.contains("&#39;")) {
                    body = body.replaceAll("&#39;", "\"");
                }
                if (body.contains("\"[")) {
                    body = body.replaceAll("\"\\[", "[");
                }

                if (body.contains("]\"")) {
                    body = body.replaceAll("]\"", "]");
                }
                if (body.contains("\\")) {
                    body = body.replaceAll("\\\\", "");
                }
                return body;
            }
        });
        return call;
    }

    /**
     * 检查更新
     */
    public void update(String version, Callback<UpdateModel> callback) {
        API.UpdateApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getWebUrl(), API.UpdateApi.class);
        Call<UpdateModel> call = api.update(version);
        call.enqueue(callback);
    }




    /**
     * 登录
     */
    public void login(String UserId, String UserPwd, boolean IsRandomPassport, OnResultListener<TokenModel> listener) {
//        API.LoginApi loginApi = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.LoginApi.class);
        API.PhoneLoginApi loginApi = ApiFactoryUtils.getApi(ConstUtils.getInstance().getPassportHost(), API.PhoneLoginApi.class, ConstUtils.getInstance().getPassportSecret(), ConstUtils.getInstance().getPassportChannelid(), ConstUtils.getInstance().isDebug());
//        String passportId = "00000000-0000-0000-0000-000000000000";
//        String loginIp = "::1";

        String LoginChannelId = ConstUtils.getInstance().getPassportChannelid();
        boolean AutoRegist = IsRandomPassport;
        String PushType = "";
        String pushKey = "";
        UserPwd = Utils.md5(UserPwd);


        Call<String> loginCall = loginApi.login(UserId, UserPwd, IsRandomPassport, AutoRegist, LoginChannelId, PushType, pushKey);
        loginCall.enqueue(new ApiCallback<>(loginCall, TokenModel.class, listener));
    }



    /**
     * 获取用戶详细信息
     */
    public void getUserInfo() {
        final Passport loginUser = DBUtils.getPassport();
        UserInfo userInfo = DBUtils.getUserInfo();

        UserInfoObservable.getInstance().onLoadUserInfo(userInfo);
        API.GetUserInfoApi getDoctorInfoApi = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetUserInfoApi.class);
        Call<String> getInfoCall = getDoctorInfoApi.getUserInfo(loginUser.getPassportId());
        getInfoCall.enqueue(new ApiCallback<>(getInfoCall, UserInfoModel.class, new OnResultListener<UserInfoModel>() {
            @Override
            public void onResult(UserInfoModel userInfoModel) {


                UserInfo userInfo = userInfoModel.getResultData();
                UserInfoObservable.getInstance().onPostLoadUserInfo(userInfo);
                if (userInfo == null) {
                    UserInfoObservable.getInstance().update(null);
                    return;
                }
                userInfo.setPassportId(loginUser.getPassportId());
                UserInfoObservable.getInstance().update(userInfo);
            }
        }));
    }

    /**
     * 获取就诊人
     *
     * @param passportId
     * @param listener
     */
    public void getPatient(String passportId, int PageIndex, int PreCount, OnResultListener<PatientModel> listener) {
        API.selectpatientApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.selectpatientApi.class);
        Call<String> call = api.selectpatient(passportId, PageIndex, PreCount);
        call.enqueue(new ApiCallback<>(call, PatientModel.class, listener));
    }

    /**
     * 获取就诊卡
     *
     * @param passportId
     * @param listener
     */
    public void getPatientCard(String passportId, int PageIndex, int PreCount, OnResultListener<PatientCardModel> listener) {
        API.selectpatientcardApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.selectpatientcardApi.class);
        Call<String> call = api.selectpatientcard(passportId, PageIndex, PreCount);
        call.enqueue(new ApiCallback<>(call, PatientCardModel.class, listener));
    }


    /**
     * 或者就诊人数量
     *
     * @param passportId
     * @param listener
     */
    public void getUserPatientCount(String passportId, OnResultListener<CountModel> listener) {
        API.UserPatientCountApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.UserPatientCountApi.class);
        Call<String> call = api.getCount(passportId);
        call.enqueue(new ApiCallback<>(call, CountModel.class, listener));
    }

    /**
     * 或者就诊卡数量
     *
     * @param passportId
     * @param listener
     */
    public void getUserCardCount(String passportId, OnResultListener<CountModel> listener) {
        API.UserCardCountApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.UserCardCountApi.class);
        Call<String> call = api.getCount(passportId);
        call.enqueue(new ApiCallback<>(call, CountModel.class, listener));
    }

    /**
     * 添加就诊卡
     *
     * @param patientId
     * @param organizationId
     * @param cardNumber
     * @param listener
     */
    public void addPatientCard(String patientId, String organizationId, String cardNumber, OnResultListener<BaseModel> listener) {
        API.addPatientCardApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.addPatientCardApi.class);
        Call<String> call = api.add(patientId, organizationId, cardNumber);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 删除就诊卡
     *
     * @param listener
     */
    public void removecard(String PatientId, OnResultListener<BaseModel> listener) {
        API.removecardApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.removecardApi.class);
        Call<String> call = api.removecard(PatientId);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 编辑就诊人
     *
     * @param listener
     */
    public void modifyPatient(PatientModel.Patient patient, OnResultListener<BaseModel> listener) {
        API.modifypatientApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.modifypatientApi.class);

        String passportId = DBUtils.getPassport().getPassportId();
        Map<String, String> map = new HashMap<>();
        map.put("PassportId", passportId);
        map.put("PatientId", patient.getId());
        map.put("Name", patient.getName());
        map.put("IdType", patient.getIdType() + "");
        map.put("IdCode", patient.getIdCode());
        map.put("CellPhone", patient.getCellPhone());
        map.put("Age", patient.getAge() + "");
        map.put("Sex", patient.getSex() + "");
        map.put("PatientType", patient.getPatientType() + "");
        map.put("BirthDay", patient.getBirthDay());

        Call<String> call = api.modify(map);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 删除就诊人
     *
     * @param PatientId
     * @param listener
     */
    public void removePatient(String PatientId, OnResultListener<BaseModel> listener) {
        API.removepatientApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.removepatientApi.class);
        Call<String> call = api.remove(PatientId);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 添加就诊人
     *
     * @param patient
     * @param listener
     */
    public void addPatient(PatientModel.Patient patient, OnResultListener<BaseModel> listener) {
        API.addpatientApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.addpatientApi.class);

        String passportId = DBUtils.getPassport().getPassportId();
        Map<String, String> map = new HashMap<>();
        map.put("PassportId", passportId);
        map.put("Name", patient.getName());
        map.put("IdType", patient.getIdType() + "");
        map.put("IdCode", patient.getIdCode());
        map.put("CellPhone", patient.getCellPhone());
        map.put("Age", patient.getAge() + "");
        map.put("Sex", patient.getSex() + "");
        map.put("PatientType", patient.getPatientType() + "");
        map.put("BirthDay", patient.getBirthDay());

        Call<String> call = api.add(map);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }


    /**
     * 根据地理编码获取医院
     *
     * @param listener
     */
    public void getetHospitalByArea(final String area, final OnResultListener<HospitalModel> listener) {
        API.GetHospitalByAreaApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetHospitalByAreaApi.class);
        Call<String> call = api.get(area, 1, 1000);
        //接着访问网络
        call.enqueue(new ApiCallback<>(call, HospitalModel.class, listener));
    }


    /**
     * 根据医院id获取科室
     *
     * @param OrgId    医院id
     * @param Property 科室属性
     * @param listener
     */
    public void getDepartmentsByOrgId(String OrgId, String Property, final OnResultListener<DepartModel> listener) {

        API.GetDepartmentsByOrgIdApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetDepartmentsByOrgIdApi.class);
        Call<String> call = api.get(OrgId, Property, 1, 1000);
        call.enqueue(new ApiCallback<>(call, DepartModel.class, listener));
    }

    /**
     * 没有医生的号别列表
     *
     * @param listener
     */
    public Call<String> getCliniclabel(String DepartmentId, OnResultListener<CliniclabelModel> listener) {
        API.getCliniclabelApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getCliniclabelApi.class);
        Call<String> call = api.get(DepartmentId, false);
        call.enqueue(new ApiCallback<>(call, CliniclabelModel.class, listener));
        return call;
    }

    /**
     * 没有医生的号别列表
     *
     * @param listener
     */
    public Call<String> getExpertDoctor(String DepartmentId, OnResultListener<CliniclabelModel> listener) {

        API.getExpertDoctorApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getExpertDoctorApi.class);
        Call<String> call = api.get(DepartmentId);
        call.enqueue(new ApiCallback<>(call, CliniclabelModel.class, listener));
        return call;
    }

    /**
     * 加载医生数据、医生简介、医生擅长
     *
     * @param DoctorId
     * @param listener
     */
    public void getDoctorInfo(String DoctorId, OnResultListener<DoctorInfoModel> listener) {
        API.getdoctorInfoApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getdoctorInfoApi.class);
        Call<String> call = api.get(DoctorId);
        call.enqueue(new ApiCallback<>(call, DoctorInfoModel.class, listener));
    }

    /**
     * 加载号别详细信息
     */
    public void getclinicinfo(String ClinicId, OnResultListener<DoctorInfoModel> listener) {
        API.getclinicinfoApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getclinicinfoApi.class);
        Call<String> call = api.get(ClinicId);
        call.enqueue(new ApiCallback<>(call, DoctorInfoModel.class, listener));
    }

    /**
     * 关注、收藏医生
     *
     * @param DoctorId
     * @param listener
     */
    public void follow(String PassportId, String DoctorId, int followType, OnResultListener<FollowModel> listener) {
        API.followApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.followApi.class);
        Call<String> call = api.follow(PassportId, DoctorId, followType);
        call.enqueue(new ApiCallback<>(call, FollowModel.class, listener));
    }

    /**
     * 取消关注、收藏医生
     *
     * @param DoctorId
     * @param listener
     */
    public void unfollow(String PassportId, String DoctorId, int followType, OnResultListener<FollowModel> listener) {
        API.unfollowApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.unfollowApi.class);
        Call<String> call = api.unfollow(PassportId, DoctorId, followType);
        call.enqueue(new ApiCallback<>(call, FollowModel.class, listener));
    }


    /**
     * 是否关注、收藏医生
     *
     * @param DoctorId
     * @param listener
     */
    public void checkfollow(String PassportId, String DoctorId, int followType, OnResultListener<FollowModel> listener) {
        API.checkfollowApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.checkfollowApi.class);
        Call<String> call = api.checkfollow(PassportId, DoctorId, followType);
        call.enqueue(new ApiCallback<>(call, FollowModel.class, listener));
    }

    /**
     * 获取预约或挂号医生坐诊数据
     *
     * @param DoctorId
     * @param IsClinic 挂号：true,预约 false
     */
    public void getDoctorappointments(String DoctorId, boolean IsClinic, OnResultListener<DoctorAppointmentModel> listener) {
        API.DoctorappointmentsApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.DoctorappointmentsApi.class);
        Call<String> call = api.get(DoctorId, IsClinic);
        call.enqueue(new ApiCallback<>(call, DoctorAppointmentModel.class, listener));
    }


    /**
     * 获取号别坐诊
     *
     * @param cliniclabelid
     * @param listener
     */
    public void getCliniclabelAppointments(String cliniclabelid, OnResultListener<ClinicAppointmentModel> listener) {
        API.GetcliniclabelAppointmentsApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetcliniclabelAppointmentsApi
                .class);
        Call<String> call = api.get(cliniclabelid);
        call.enqueue(new ApiCallback<>(call, ClinicAppointmentModel.class, listener));
    }

    /**
     * 获取未读消息数量
     *
     * @param listener
     */
    public void getmsgcountbyuser(OnResultListener<BaseModel> listener) {
        Passport loginUser = DBUtils.getPassport();
        if (loginUser == null) {
            return;
        }
        String passportId = loginUser.getPassportId();
        API.getmsgcountbyuserApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getmsgcountbyuserApi.class);
        Call<String> call = api.get(passportId);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 获取一级消息列表
     *
     * @param listener
     */
    public void getMsgtypelistbyuser(OnResultListener<MessageBeanModel> listener) {
        String passportId = DBUtils.getPassport().getPassportId();
        API.getMsgtypelistbyuserApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getMsgtypelistbyuserApi.class);
        Call<String> call = api.get(passportId);
        call.enqueue(new ApiCallback<>(call, MessageBeanModel.class, listener));
    }

    /**
     * 获取二级消息列表
     *
     * @param listener
     */
    public void getmsginfolistbyuser(String messagetype, OnResultListener<MessageTypeListModel> listener) {
        String passportId = DBUtils.getPassport().getPassportId();
        API.getmsginfolistbyuserApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getmsginfolistbyuserApi.class);
        Call<String> call = api.get(passportId, messagetype);
        call.enqueue(new ApiCallback<>(call, MessageTypeListModel.class, listener));
    }

    /**
     * 删除消息
     */
    public void deletemsgbyid(String MsgId, OnResultListener<BaseModel> listener) {
        String passportId = DBUtils.getPassport().getPassportId();
        API.deletemsgbyidApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.deletemsgbyidApi.class);
        Call<String> call = api.delete(passportId, MsgId);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 更新消息
     */
    public void setmsgreadbyid(String MsgId, OnResultListener<BaseModel> listener) {
        String passportId = DBUtils.getPassport().getPassportId();
        API.setmsgreadbyidApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.setmsgreadbyidApi.class);
        Call<String> call = api.delete(passportId, MsgId);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 获取时间段
     *
     * @param cliniclabelid
     * @param listener      noon  午别
     *                      IsClinic 是否是预约
     */
    public void getAppointmentTimepart(String cliniclabelid, String date, int noon, boolean IsClinic, OnResultListener<AppointmentTimePartModel>
            listener) {
        API.GetAppointmentTimepartApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetAppointmentTimepartApi.class);
        Call<String> call = api.get(cliniclabelid, date, noon, IsClinic);
        call.enqueue(new ApiCallback<>(call, AppointmentTimePartModel.class, listener));
    }

    /**
     * 就诊类型
     *
     * @param ClinicLabelId
     * @param Noon
     * @param ClinicDate
     * @param IsClinic
     * @param listener
     */
    public Call<String> getCheckClinicInfo(String ClinicLabelId, String AgcId, Integer Noon, String ClinicDate, Boolean IsClinic,
                                           OnResultListener<AppointmentTypeModel> listener) {
        Map<String, String> map = new HashMap<>();
        map.put("ClinicLabelId", ClinicLabelId);
        map.put("AgcId", AgcId);
        map.put("Noon", Noon.toString());
        map.put("ClinicDate", ClinicDate);
        map.put("IsClinic", IsClinic.toString());


        API.getCheckClinicInfoApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getCheckClinicInfoApi.class);
        Call<String> call = api.get(map);
        call.enqueue(new ApiCallback<>(call, AppointmentTypeModel.class, listener));
        return call;
    }

    /**
     * 获取预约支付类型
     *
     * @param listener noon  午别
     *                 IsClinic 是否是预约
     */
    public Call<String> getPayMethod(String OrgId, OnResultListener<PayTypeModel> listener) {
        API.getPayMethodApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getPayMethodApi.class);
        Call<String> call = api.get(OrgId);
        call.enqueue(new ApiCallback<>(call, PayTypeModel.class, listener));
        return call;
    }

    /**
     * 提交预约
     *
     * @param listener
     */
    public void submitClinicMethod(Map<String, String> map, OnResultListener<ClinicResultModel> listener) {
        API.ClinicSubmitApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.ClinicSubmitApi.class);
        Call<String> call = api.submit(map);
        call.enqueue(new ApiCallback<>(call, ClinicResultModel.class, listener));
    }

    /**
     * 获取我的预约
     * <p/>
     * IsClinic true:挂号 false：预约
     */
    public void getCriteriaAppointment(String UserId, Boolean IsClinic, String AppointmentStatus, int PageIndex, int PreCount,
                                       OnResultListener<AppointmentListModel> listener) {
        Map<String, String> map = new HashMap<>();
        map.put("UserId", UserId);
        map.put("IsClinic", IsClinic.toString());
        map.put("AppointmentStatus", AppointmentStatus);
        map.put("PageIndex", PageIndex + "");
        map.put("PreCount", PreCount + "");

        API.CriteriaAppointmentApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.CriteriaAppointmentApi.class);
        Call<String> call = api.get(map);
        call.enqueue(new ApiCallback<>(call, AppointmentListModel.class, listener));
    }

    /**
     * 获取标准科室分类
     *
     * @param listener
     */
    public void getsubjectinfo(OnResultListener<DepartClassModle> listener) {
        API.getsubjectinfoApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getsubjectinfoApi.class);
        Call<String> call = api.get("abc");
        call.enqueue(new ApiCallback<>(call, DepartClassModle.class, listener));
    }

    /**
     * 获取标准科室
     *
     * @param listener
     */
    public Call<String> getbasedepartmentsbysubject(String SubjectId, OnResultListener<DepartClassItemModel> listener) {
        API.getbasedepartmentsbysubjectApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getbasedepartmentsbysubjectApi
                .class);
        Call<String> call = api.get(SubjectId);
        call.enqueue(new ApiCallback<>(call, DepartClassItemModel.class, listener));
        return call;
    }

    /**
     * 取消订单、取消预约
     */
    public void usercancelappointment(String AppointmentCode, OnResultListener<BaseModel> listener) {
        Passport loginUser = DBUtils.getPassport();
        API.usercancelappointmentApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.usercancelappointmentApi.class);
        Call<String> call = api.cancel(loginUser.getPassportId(), AppointmentCode);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 预约（挂号）信息详情
     */
    public void getMemAppointmentInfo(String AppointmentCode, OnResultListener<ClinicOrderInfoModle> listener) {
        Passport loginUser = DBUtils.getPassport();
        API.GetMemAppointmentInfoApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetMemAppointmentInfoApi.class);
        Call<String> call = api.get(loginUser.getPassportId(), AppointmentCode);
        call.enqueue(new ApiCallback<>(call, ClinicOrderInfoModle.class, listener));
    }

    /**
     * 加载标准科室下的医生
     */
    public void getstanddoctorInfo(String StandDepartmentId, String Area, int PageIndex, int PreCount, OnResultListener<CliniclabelModel> listener) {
        API.getstanddoctorApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getstanddoctorApi.class);
        Call<String> call = api.get(StandDepartmentId, Area, PageIndex, PreCount);
        call.enqueue(new ApiCallback<>(call, CliniclabelModel.class, listener));
    }


    /**
     * 站内搜索
     */
    public Call<String> gmixsearch(String DataKey, String DataType, int PageIndex, int PreCount, OnResultListener<SerachValueModel> listener) {
        API.gmixsearchApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.gmixsearchApi.class);
        Call<String> call = api.search(DataKey, DataType, PageIndex, PreCount);
        call.enqueue(new ApiCallback<>(call, SerachValueModel.class, listener));
        return call;
    }

    /**
     * 站内搜索日志
     */
    public Call<String> gmixsearchLog(String DataKey) {
        String UserIdentify = "";
        Passport loginUser = DBUtils.getPassport();
        if (loginUser != null && !TextUtils.isEmpty(loginUser.getPassportId())) {
            UserIdentify = loginUser.getPassportId();
        }

        StringBuilder builder = new StringBuilder();
        builder.append(BaseApplication.getAppContext().getResources().getString(R.string.app_name));
        builder.append("-V" + Utils.getVersionName(BaseApplication.getAppContext()));

        Map<String, String> map = new HashMap<>();
        map.put("UserIdentify", UserIdentify);
        map.put("DataKey", DataKey);
        map.put("UserIp", Utils.getIPAddress(BaseApplication.getAppContext()));
        map.put("UserAgent", "android-系统型号:" + Utils.getSysVersionName());
        map.put("AppAgent", builder.toString());

        API.gmixsearchLogApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.gmixsearchLogApi.class);
        Call<String> call = api.post(map);
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
        return call;
    }

    /**
     * 我关注的医生
     */
    public Call<String> getFollowDoctor(String PassportId, int PageIndex, int PreCount, OnResultListener<CliniclabelModel> listener) {
        API.GetFollowDoctorApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetFollowDoctorApi.class);
        Call<String> call = api.get(PassportId, PageIndex, PreCount);
        call.enqueue(new ApiCallback<>(call, CliniclabelModel.class, listener));
        return call;
    }


    /**
     * 获取常见科室
     */
    public Call<String> getgeneraldepartments(int Count, OnResultListener<CommonlyDepartModel> listener) {
        API.getgeneraldepartmentsApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getgeneraldepartmentsApi.class);
        Call<String> call = api.get(Count);
        call.enqueue(new ApiCallback<>(call, CommonlyDepartModel.class, listener));
        return call;
    }

    /**
     * 提交反馈
     */
    public Call<String> saveSuggestion(String Content, int SuggestionType, String Images, OnResultListener<BaseModel> listener) {
        Passport loginUser = DBUtils.getPassport();
        String pssportId = "";
        if (loginUser != null) {
            pssportId = loginUser.getPassportId();
        }

        API.suggestionApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.suggestionApi.class);
        Call<String> call = api.save(pssportId, Content, SuggestionType, Images);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
        return call;
    }

    /**
     * 提交反馈上传图片  同步执行
     */
    public Call<String> saveSuggestionUpload(String FileName, String FileStream, OnResultListener<ImageUploadResultModel> listener) {
        Passport loginUser = DBUtils.getPassport();
        String pssportId = "";
        if (loginUser != null) {
            pssportId = loginUser.getPassportId();
        }

        API.suggestionUploadApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.suggestionUploadApi.class);
        Call<String> call = api.save(pssportId, FileName, FileStream);
        Response<String> response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ApiCallback apiCallBack = new ApiCallback<>(call, ImageUploadResultModel.class, listener);
        apiCallBack.onResponse(call, response);
        return call;
    }

    /**
     * 获取支付方式
     */
    public Call<String> getpaychannel(String Commontypeid, OnResultListener<PayChannelModel> listener) {
        API.getpaychannelApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getpaychannelApi.class);
        Call<String> call = api.get(Commontypeid);
        call.enqueue(new ApiCallback<>(call, PayChannelModel.class, listener));
        return call;
    }

    /**
     * 获取支付预约详细信息
     */
    public Call<String> getMemOrderInfo(String Commontypeid, OnResultListener<ClinicOrderInfoModle> listener) {
        String passportId = DBUtils.getPassport().getPassportId();
        API.GetMemOrderInfoApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetMemOrderInfoApi.class);
        Call<String> call = api.get(passportId, Commontypeid);
        call.enqueue(new ApiCallback<>(call, ClinicOrderInfoModle.class, listener));
        return call;
    }


    /**
     * 银联支付获取流水号
     */
    public Call<String> AppYinLianPayment(String OrderId, String OrderNumber, String OrderAmount, String PayChannelId,
                                          OnResultListener<UnionpayQidModel> listener) {
        Map<String, String> map = new HashMap<>();
        map.put("OrderId", OrderId);
        map.put("OrderNumber", OrderNumber);
        map.put("OrderAmount", OrderAmount);
        map.put("PayChannelId", PayChannelId);


        API.AppYinLianPaymentApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.AppYinLianPaymentApi.class);
        Call<String> call = api.get(map);
        call.enqueue(new ApiCallback<>(call, UnionpayQidModel.class, listener));
        return call;
    }

    /**
     * 获取轮播图
     */
    public Call<String> getbiaoshiarticlelist(String hospital, String callIndex, int pagesize, int pageIndex, OnResultListener<BannerModel> listener) {
        API.getbiaoshiarticlelistApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getbiaoshiarticlelistApi.class);
        Call<String> call = api.get(hospital, callIndex, pagesize + "", pageIndex + "");
        call.enqueue(new ApiCallback<>(call, BannerModel.class, listener));
        return call;
    }

    /**
     * 医院详情
     */
    public Call<String> getOrganizationBaseInfo(String OrganizatonId, OnResultListener<HospitalInfoModel> listener) {
        API.getOrganizationBaseInfoApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getOrganizationBaseInfoApi.class);
        Call<String> call = api.get(OrganizatonId);
        call.enqueue(new ApiCallback<>(call, HospitalInfoModel.class, listener));
        return call;
    }


    /**
     * 获取广告图
     */
    public void getbiaoshiarticlelistforapp() {
        API.getbiaoshiarticlelistforappApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getbiaoshiarticlelistforappApi
                .class);
        Call<String> call = api.get("hbjk_others", "hbjk_appad", "1", "1");
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if (response == null || response.code() != 200 || TextUtils.isEmpty(response.body())) {
                    return;
                }

                try {
                    BannerModel bannerModel = new Gson().fromJson(response.body(), BannerModel.class);
                    if (bannerModel.getResultCode() != 1) {
                        return;
                    }
                    List<BannerModel.Banner> resultData = bannerModel.getResultData();
                    if (resultData == null || resultData.size() < 1) {
                        return;
                    }
                    final BannerModel.Banner banner = resultData.get(0);
                    if (banner == null || TextUtils.isEmpty(banner.getImgUrl())) {
                        return;
                    }

                    new Thread(new Runnable() {
                        @Override
                        public void run() {
                            String downloadImageFileUrl = ImageLoadUtils.downloadImage(banner.getImgUrl());
                            if (TextUtils.isEmpty(downloadImageFileUrl)) {
                                return;
                            }
                            SettingPref.getInstance().setSplashImageUrl(downloadImageFileUrl);
                            SettingPref.getInstance().setSplashBanner(new Gson().toJson(banner));
                        }
                    }).start();


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                LogUtils.print("getbiaoshiarticlelistforapp", t.getMessage());
            }
        });
    }

    /**
     * 消费查询
     */
    public Call<String> consumersearch(String hospitalId, String patientId, String cardNumber, String startDate, String endDate,
                                       OnResultListener<ExpenseQueryModel> listener) {
        API.ConsumersearchApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.ConsumersearchApi.class);
        Call<String> call = api.get(hospitalId, patientId, cardNumber, startDate, endDate);
        call.enqueue(new ApiCallback<>(call, ExpenseQueryModel.class, listener));
        return call;
    }

    /**
     * 获取医院，包含功能列表
     */
    public Call<String> getOrganizationListByShiJu(String area, OnResultListener<HospitalModel> listener) {
        API.GetOrganizationListByShiJuApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetOrganizationListByShiJuApi
                .class);
        Call<String> call = api.get(area, 1, 1000);
        call.enqueue(new ApiCallback<>(call, HospitalModel.class, listener));
        return call;
    }


    /**
     * 报告记录时间
     */
    public Call<String> getreportdayscount(String OrgId, OnResultListener<BaseModel> listener) {
        API.GetreportdayscountApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetreportdayscountApi.class);
        Call<String> call = api.get(OrgId);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
        return call;
    }

    /**
     * 住院清单
     */
    public Call<String> gethospitalizationconsumelist(String patientId, String cardNumber, String HospitalId, String HospitalizationNumber, String StartDate, String EndDate, int PageIndex, int PreCount,
                                                      OnResultListener<MainFestsModel> listener) {
        API.GethospitalizationconsumelistApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API
                .GethospitalizationconsumelistApi.class);
        Call<String> call = api.get(patientId, cardNumber, HospitalId, HospitalizationNumber, StartDate, EndDate, PageIndex, PreCount);
        call.enqueue(new ApiCallback<>(call, MainFestsModel.class, listener));
        return call;
    }


    /**
     * 就诊卡余额查询
     */
    public Call<String> getInspectSearch(String HospitalId, String PatientName, String IdType, String IdNumber, String CardNumber, String
            CardPassword, String SignTimestamp, OnResultListener<CardBlanceModel> listener) {
        Map<String, String> map = new HashMap<>();
        map.put("HospitalId", HospitalId);
        map.put("PatientName", PatientName);
        map.put("IdType", IdType);
        map.put("IdNumber", IdNumber);
        map.put("CardNumber", CardNumber);
        map.put("CardPassword", CardPassword);
        map.put("SignTimestamp", SignTimestamp);

        API.GetcardbalanceApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetcardbalanceApi.class);
        Call<String> call = api.get(map);
        call.enqueue(new ApiCallback<>(call, CardBlanceModel.class, listener));
        return call;
    }

    /**
     * 获取检验报告列表
     */
    public Call<String> getexaminesearch(String startDate, String endDate, String hospitalId, String patientId, String cardNum,
                                         OnResultListener<ExamineListModel> listener) {
        API.Getexaminesearch api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.Getexaminesearch.class);
        Call<String> call = api.get(startDate, endDate, hospitalId, patientId, cardNum);
        call.enqueue(new ApiCallback<>(call, ExamineListModel.class, listener));
        return call;
    }

    /**
     * 获取检验详情
     */
    public Call<String> getexaminesearchdetail(String ExamineId, String ExamineName, String OrgId, OnResultListener<ExamineDetailsModel> listener) {
        API.Getexaminesearchdetail api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.Getexaminesearchdetail.class);
        Call<String> call = api.get(ExamineId, ExamineName, OrgId);
        call.enqueue(new ApiCallback<>(call, ExamineDetailsModel.class, listener));
        return call;
    }

    /**
     * 获取检查列表
     */
    public Call<String> getInspectSearch(String startDate, String endDate, String hospitalId, String patientId, String cardNumber,
                                         OnResultListener<InspectListModel> listener) {
        API.GetInspectSearch api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetInspectSearch.class);
        Call<String> call = api.get(startDate, endDate, hospitalId, patientId, cardNumber);
        call.enqueue(new ApiCallback<>(call, InspectListModel.class, listener));
        return call;
    }


    /**
     * 获取检查详情
     *
     * @param id
     * @param orgId
     * @param listener
     * @return
     */
    public Call<String> getInspectSearchDetail(String id, String orgId, OnResultListener<InspectSearchDetailModel> listener) {
        API.GetInspectSearchDetail api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetInspectSearchDetail.class);
        Call<String> call = api.get(id, orgId);
        call.enqueue(new ApiCallback<>(call, InspectSearchDetailModel.class, listener));
        return call;
    }

    /**
     * 获取电子病历列表
     *
     * @param hospitalId
     * @param patientId
     * @param cardNum
     * @param listener
     * @return
     */
    public Call<String> getEmrList(String hospitalId, String patientId, String cardNum, OnResultListener<EmrListModel> listener) {
        API.GetEmrList api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetEmrList.class);
        Call<String> call = api.get(hospitalId, patientId, cardNum);
        call.enqueue(new ApiCallback<>(call, EmrListModel.class, listener));
        return call;
    }

    /**
     * 获取电子病历详情
     *
     * @param orgId
     * @param recordId
     * @param listener
     * @return
     */
    public Call<String> getPatientRecordInfo(String orgId, String recordId, OnResultListener<PatientRecordInfoModel> listener) {
        API.GetPatientInfo api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetPatientInfo.class);
        Call<String> call = api.get(orgId, recordId);
        call.enqueue(new ApiCallback<>(call, PatientRecordInfoModel.class, listener));
        return call;
    }

    /**
     * 价目查询
     *
     * @param kw
     * @param type
     * @param orgId
     * @param listener
     * @return
     */
    public Call<String> GetPriceItemSearch(String kw, String type, String orgId, OnResultListener<PriceItemSearchModel> listener) {
        API.GetPriceItemSearch api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetPriceItemSearch.class);
        Call<String> call = api.get(kw, type, orgId);
        call.enqueue(new ApiCallback<>(call, PriceItemSearchModel.class, listener));
        return call;
    }

    /**
     * 价表类型
     *
     * @param orgId
     * @param kw
     * @param type
     * @param listener
     * @return
     */
    public Call<String> getPriceList(String orgId, String kw, String type, OnResultListener<PriceListModel> listener) {
        API.GetPriceList api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetPriceList.class);
        Call<String> call = api.get(orgId, kw, type);
        call.enqueue(new ApiCallback<>(call, PriceListModel.class, listener));
        return call;
    }

    /**
     * 充值记录查询
     */
    public Call<String> getOrderHospitalCzList(String PassportId, int PageIndex, int PageSize, OnResultListener<CardRechargeRecordModel> listener) {
        API.GetOrderHospitalCzListApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetOrderHospitalCzListApi.class);
        Call<String> call = api.get(PassportId, PageIndex, PageSize);
        call.enqueue(new ApiCallback<>(call, CardRechargeRecordModel.class, listener));
        return call;
    }

    /**
     * 根据ip获取城市信息
     *
     * @param ip
     * @param listener
     * @return
     */
    public Call<String> getCity(String ip, OnResultListener<WeatherCityModel> listener) {
        API.GetCity api = ApiFactoryUtils.getApi("http://weixin.jirengu.com/", API.GetCity.class);
        Call<String> call = api.get(ip);
        call.enqueue(new ApiCallback<>(call, WeatherCityModel.class, listener));
        return call;
    }

    /**
     * 根据城市id获取实时天气信息
     *
     * @param cityid
     * @param listener
     * @return
     */
    public Call<String> getNowWeather(String cityid, OnResultListener<NowWeatherModel> listener) {
        API.GetNowWeather api = ApiFactoryUtils.getApi("http://weixin.jirengu.com/", API.GetNowWeather.class);
        Call<String> call = api.get(cityid);
        call.enqueue(new ApiCallback<>(call, NowWeatherModel.class, listener));
        return call;
    }

    /**
     * 联网获取ip
     *
     * @param listener
     * @return
     */
    public Call<String> getWeatherIp(OnResultListener<WeatherIpModel> listener) {
        API.GetWeatherIp api = ApiFactoryUtils.getApi("http://weixin.jirengu.com/", API.GetWeatherIp.class);
        Call<String> call = api.get();
        call.enqueue(new ApiCallback<>(call, WeatherIpModel.class, listener));
        return call;
    }

    /**
     * 获取直播列表
     */
    public Call<String> getLiveList(String hospitalId, String sortId, String categoryid, String pageIndex, String pageSize, OnResultListener<LiveListModel> listener) {
        API.GetLiveList api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetLiveList.class);
        Call<String> call = api.get(hospitalId, sortId, categoryid, pageIndex, pageSize);
        call.enqueue(new ApiCallback<>(call, LiveListModel.class, listener));
        return call;
    }

    /**
     * 获取找医院列表
     */
    public Call<String> getHospitalList(String HosId, String Area, String HosProperty, String OrderByType, String Longitude, String Latitude, String IsBook, int PageIndex, int PageSize, String ImageUrl, OnResultListener<HospitalListModel> listener) {
        API.GetHospitalList api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetHospitalList.class);
        Call<String> call = api.get(HosId, Area, HosProperty, OrderByType, Longitude, Latitude, IsBook, PageIndex, PageSize, ImageUrl);
        call.enqueue(new ApiCallback<>(call, HospitalListModel.class, listener));
        return call;
    }

    /**
     * 获取找医院类型
     */
    public Call<String> getHospitalType(String OrderByType, OnResultListener<HospitalTypeModel> listener) {
        API.GetHospitalType api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetHospitalType.class);
        Call<String> call = api.get(OrderByType);
        call.enqueue(new ApiCallback<>(call, HospitalTypeModel.class, listener));
        return call;
    }

    /**
     * 获取找医院类型
     */
    public Call<String> getHospitalInfo(String HosId, String hosCode, OnResultListener<HospitalInfoModel> listener) {
        API.GetHosByGuidApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetHosByGuidApi.class);
        Call<String> call = api.get(HosId, hosCode);
        call.enqueue(new ApiCallback<>(call, HospitalInfoModel.class, listener));
        return call;
    }

    /**
     * 获取新医院详情
     */
    public Call<String> getNewHospitalInfo(String HosId, OnResultListener<HospitalNewInfoModel> listener) {
        API.GetNewHosByGuidApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetNewHosByGuidApi.class);
        Call<String> call = api.get(HosId);
        call.enqueue(new ApiCallback<>(call, HospitalNewInfoModel.class, listener));
        return call;
    }

    /**
     * 获取关注的医院列表
     */
    public Call<String> getFollowHospital(String passportId, int pageIndex, int pageSize, OnResultListener<HospitalModel> listener) {
        API.GetFollowHospital api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetFollowHospital.class);
        Call<String> call = api.get(passportId, pageIndex, pageSize);
        call.enqueue(new ApiCallback<>(call, HospitalModel.class, listener));
        return call;
    }

    /**
     * 我关注的医生
     */
    public Call<String> getFollowDoctors(String PassportId, int PageIndex, int PreCount, OnResultListener<BaseModel> listener) {
        API.GetFollowDoctorApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetFollowDoctorApi.class);
        Call<String> call = api.get(PassportId, PageIndex, PreCount);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
        return call;
    }

    /**
     * 获取诊间支付-待缴费
     * innerclinic/getinnerclinic
     */
    public void getInnerClinic(String hospitalId, String patientId, String cardNum, OnResultListener<BaseModel> listener) {
        API.GetInnerClinic api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetInnerClinic.class);
        Call<String> call = api.get(hospitalId, patientId, cardNum);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 产生就诊卡充值订单
     */
    public void rechagePay(String passportId, String hospitalId, String patientName, String idType, String idNum, String cardNum, String payMoney, String cardPwd, OnResultListener<CardRechargeModel> listener) {
        API.ReCharePay api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.ReCharePay.class);
        Call<String> call = api.get(passportId, hospitalId, patientName, idType, idNum, cardNum, payMoney, cardPwd);
        call.enqueue(new ApiCallback<>(call, CardRechargeModel.class, listener));
    }

    /**
     * 获取就诊卡充值订单
     */
    public void getCardRechargeOrder(String passportId, String OrderId, OnResultListener<PayOrderStatusModel> listener) {
        API.getOrder api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.getOrder.class);
        Call<String> call = api.get(passportId, OrderId);
        call.enqueue(new ApiCallback<>(call, PayOrderStatusModel.class, listener));
    }

    /**
     * 就诊卡支付接口
     */
    public void getInnerClinicPatientCardPay(String passportId, String orderId, String cardPwd, String SignTimestamp, OnResultListener<BaseModel> listener) {
        API.GetInnerClinicPatientCardPay api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetInnerClinicPatientCardPay.class);
        Call<String> call = api.get(passportId, orderId, cardPwd, SignTimestamp);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));

    }

    /**
     * 就诊卡充值网关
     */
    public void hbpaymentpost(String PassportId, String OrderId, String OrderNumber, String OrderAmount, String CustomerIp, String SettlementDate, String PayChannelId,  String CardPassword, OnResultListener<BaseModel> listener) {
        API.hbpaymentpost api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.hbpaymentpost.class);
        Call<String> call = api.get(PassportId, OrderId, OrderNumber, OrderAmount, CustomerIp, SettlementDate, PayChannelId, CardPassword);
        call.enqueue(new ApiCallback<>(call, BaseModel.class, listener));
    }

    /**
     * 住院预交金充值记录
     *
     * @param PassportId
     * @param PageIndex
     * @param PageSize
     * @param listener
     */
    public void getOrderHospitalCzLists(String PassportId, int PageIndex, int PageSize, OnResultListener<CardRechargeRecordModel> listener) {
        API.GetOrderHospitalCzList api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.GetOrderHospitalCzList.class);
        Call<String> call = api.get(PassportId, PageIndex, PageSize);
        call.enqueue(new ApiCallback<>(call, CardRechargeRecordModel.class, listener));
    }


    /**
     * 智能排队-我的排队
     *
     */
    public void queuesearch(String hospitalid, String patientid, String departmentid, OnResultListener<QueueListModel> listener) {
        API.QueuesearchApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.QueuesearchApi.class);
        Call<String> call = api.queue(hospitalid, patientid, departmentid);
        call.enqueue(new ApiCallback<>(call, QueueListModel.class, listener));
    }

    /**
     * 智能排队-科室下队列搜索
     */
    public void getOrderHospitalCzLists(String hospitalid, String patientid, String departmentid, OnResultListener<QueueListModel> listener) {
        API.QueueSearchByDepartmentIdApi api = ApiFactoryUtils.getApi(ConstUtils.getInstance().getApiHost(), API.QueueSearchByDepartmentIdApi.class);
        Call<String> call = api.queue(hospitalid, patientid, departmentid);
        call.enqueue(new ApiCallback<>(call, QueueListModel.class, listener));
    }
}
