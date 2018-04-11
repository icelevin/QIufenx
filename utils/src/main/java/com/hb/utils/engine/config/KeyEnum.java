package com.hb.utils.engine.config;

/**
 * Created by txl on 2018/3/13 0013.
 */

public enum KeyEnum {
    TodayClinic("TodayClinic"),//当日挂号
    MedicalRecord("MedicalRecord"),//病案复印预约
    AppointmentTest("AppointmentTest"),//预约检查
    Clinic("Clinic"),//预约挂号
    InnerPay("InnerPay"),//诊间支付
    ConsumptionSearch("ConsumptionSearch"),//门诊消费查询
    BalanceSearch("BalanceSearch"),//就诊卡余额
    Recharge("Recharge"),//就诊卡充值
    Prepaid("Prepaid"),//住院预交金
    DayList("DayList"),//住院清单
    TestReport("TestReport"),//检查报告查询
    ExamineReport("ExamineReport"),//检验报告查询
    Queue("Queue"),//智能排队
    DZBL("DZBL"),//电子病历查询
    Navigation("Navigation"),//导航
    JMCX("JMCX"),//价目查询
    NurseNavigate("NurseNavigate"),//护士导诊
    HospitalFound("HospitalFound"),//找医院
    PhoneClinic("PhoneClinic"),//电话挂号
    DiseaseCheck("DiseaseCheck"),//疾病自检
    HBLive("HBLive"),//惠医直播
    DoctorNurse("DoctorNurse"),//就医陪诊
    HomeNurse("HomeNurse"),//居家陪护
    HospitalNurse("HospitalNurse"),//住院陪护
    HealthWiki("HealthWiki"),//健康百科
    ClinicGuide("ClinicGuide");//挂号指南


    private String key;
    KeyEnum(String key){
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    @Override
    public String toString() {
        return "KeyEnum{" + "key='" + key + '\'' + '}';
    }
}
