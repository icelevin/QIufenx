package com.hb.utils.modle;

import java.io.Serializable;

/**
 * 医院详情
 * Created by txl on 2017/6/2 0002.
 */
public class HospitalInfoModel extends BaseModel<HospitalInfoModel.Hospital> {

    /**
     * 医院所包含功能
     */
    public static enum Features implements Serializable{
        PayRecordOne(0x11),//消费记录查询
        ItemList(0x12),//价表查询
        Hospitalization(0x13),//住院一日清单
        RechargeOne(0x14),//就诊卡充值
        Query(0x15),//就诊卡余额
        TodayClinic(0x16),//当日挂号
        TrtimeOne(0x17),//诊间支付
        Trtime(0x18),//电子病历
        IntelligentOne(0x19), //智能排队
        Recharge(0x20),//住院预交金充值
        CheckInspection(0x21),//检验检查
        Examine(0x22);
        private int code;

        Features(int code){
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }


    public static class Hospital implements Serializable {

        private String OrganzationId; //机构id
        private String OrganzationCode; // 机构code
        private String area;  //地理编码
        private String Address;
        private int AppointmentCount;
        private int DoctorCount;
        private boolean IsAppointment;
        private boolean IsInsurance;
        private String Level;
        private String LevelText;
        private String LogoUrl;
        private String OrganizationName;
        private String OrganzationLogo;
        private String ShortName;
        private String TelPhone;
        private String ThumbimageUrl;
        private boolean PayRecordOne;//消费记录查询
        private boolean ItemList;//价表查询
        private boolean Hospitalization;//住院一日清单
        private boolean RechargeOne;//就诊卡充值
        private boolean Query;//就诊卡余额
        private boolean TodayClinic;//当日挂号
        private boolean TrtimeOne;//诊间支付
        private boolean Trtime;//电子病历
        private boolean IntelligentOne; //智能排队
        private boolean Recharge;//住院预交金充值
        private boolean Check;//检查
        private boolean Inspection;//检验
        private String Location; //组织机构坐标
        private String Latitude; //纬度
        private String Longitude; //经度
        private String HospitalBookThrowClinicNumberTime; //预约放号时间
        private String Remark;
        private String Description;

        public String getRemark() {
            return Remark;
        }

        public void setRemark(String remark) {
            Remark = remark;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getLocation() {
            return Location;
        }

        public void setLocation(String location) {
            Location = location;
        }

        public String getLatitude() {
            return Latitude;
        }

        public void setLatitude(String latitude) {
            Latitude = latitude;
        }

        public String getLongitude() {
            return Longitude;
        }

        public void setLongitude(String longitude) {
            Longitude = longitude;
        }

        public String getHospitalBookThrowClinicNumberTime() {
            return HospitalBookThrowClinicNumberTime;
        }

        public void setHospitalBookThrowClinicNumberTime(String hospitalBookThrowClinicNumberTime) {
            HospitalBookThrowClinicNumberTime = hospitalBookThrowClinicNumberTime;
        }

        public boolean isPayRecordOne() {
            return PayRecordOne;
        }

        public void setPayRecordOne(boolean payRecordOne) {
            PayRecordOne = payRecordOne;
        }

        public boolean isItemList() {
            return ItemList;
        }

        public void setItemList(boolean itemList) {
            ItemList = itemList;
        }

        public boolean isHospitalization() {
            return Hospitalization;
        }

        public void setHospitalization(boolean hospitalization) {
            Hospitalization = hospitalization;
        }

        public boolean isRechargeOne() {
            return RechargeOne;
        }

        public void setRechargeOne(boolean rechargeOne) {
            RechargeOne = rechargeOne;
        }

        public boolean isQuery() {
            return Query;
        }

        public void setQuery(boolean query) {
            Query = query;
        }

        public boolean isTodayClinic() {
            return TodayClinic;
        }

        public void setTodayClinic(boolean todayClinic) {
            TodayClinic = todayClinic;
        }

        public boolean isTrtimeOne() {
            return TrtimeOne;
        }

        public void setTrtimeOne(boolean trtimeOne) {
            TrtimeOne = trtimeOne;
        }

        public boolean isTrtime() {
            return Trtime;
        }

        public void setTrtime(boolean trtime) {
            Trtime = trtime;
        }

        public boolean isIntelligentOne() {
            return IntelligentOne;
        }

        public void setIntelligentOne(boolean intelligentOne) {
            IntelligentOne = intelligentOne;
        }

        public boolean isRecharge() {
            return Recharge;
        }

        public void setRecharge(boolean recharge) {
            Recharge = recharge;
        }

        public boolean isCheck() {
            return Check;
        }

        public void setCheck(boolean check) {
            Check = check;
        }

        public boolean isInspection() {
            return Inspection;
        }

        public void setInspection(boolean inspection) {
            Inspection = inspection;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public int getAppointmentCount() {
            return AppointmentCount;
        }

        public void setAppointmentCount(int appointmentCount) {
            AppointmentCount = appointmentCount;
        }

        public int getDoctorCount() {
            return DoctorCount;
        }

        public void setDoctorCount(int doctorCount) {
            DoctorCount = doctorCount;
        }

        public boolean isAppointment() {
            return IsAppointment;
        }

        public void setAppointment(boolean appointment) {
            IsAppointment = appointment;
        }

        public boolean isInsurance() {
            return IsInsurance;
        }

        public void setInsurance(boolean insurance) {
            IsInsurance = insurance;
        }

        public String getLevel() {
            return Level;
        }

        public void setLevel(String level) {
            Level = level;
        }

        public String getLevelText() {
            return LevelText;
        }

        public void setLevelText(String levelText) {
            LevelText = levelText;
        }

        public String getLogoUrl() {
            return LogoUrl;
        }

        public void setLogoUrl(String logoUrl) {
            LogoUrl = logoUrl;
        }

        public String getOrganizationName() {
            return OrganizationName;
        }

        public void setOrganizationName(String organizationName) {
            OrganizationName = organizationName;
        }

        public String getOrganzationCode() {
            return OrganzationCode;
        }

        public void setOrganzationCode(String organzationCode) {
            OrganzationCode = organzationCode;
        }

        public String getOrganzationId() {
            return OrganzationId;
        }

        public void setOrganzationId(String organzationId) {
            OrganzationId = organzationId;
        }

        public String getOrganzationLogo() {
            return OrganzationLogo;
        }

        public void setOrganzationLogo(String organzationLogo) {
            OrganzationLogo = organzationLogo;
        }

        public String getShortName() {
            return ShortName;
        }

        public void setShortName(String shortName) {
            ShortName = shortName;
        }

        public String getTelPhone() {
            return TelPhone;
        }

        public void setTelPhone(String telPhone) {
            TelPhone = telPhone;
        }

        public String getThumbimageUrl() {
            return ThumbimageUrl;
        }

        public void setThumbimageUrl(String thumbimageUrl) {
            ThumbimageUrl = thumbimageUrl;
        }


        public boolean getIsAppointment() {
            return this.IsAppointment;
        }

        public void setIsAppointment(boolean IsAppointment) {
            this.IsAppointment = IsAppointment;
        }

        public boolean getIsInsurance() {
            return this.IsInsurance;
        }

        public void setIsInsurance(boolean IsInsurance) {
            this.IsInsurance = IsInsurance;
        }

        @Override
        public String toString() {
            return "Hospital{" + "OrganzationId='" + OrganzationId + '\'' + ", OrganzationCode='" + OrganzationCode + '\'' + ", area='" + area +
                    '\'' + ", Address='" + Address + '\'' + ", AppointmentCount=" + AppointmentCount + ", DoctorCount=" + DoctorCount + ", " +
                    "IsAppointment=" + IsAppointment + ", IsInsurance=" + IsInsurance + ", Level='" + Level + '\'' + ", LevelText='" + LevelText +
                    '\'' + ", LogoUrl='" + LogoUrl + '\'' + ", OrganizationName='" + OrganizationName + '\'' + ", OrganzationLogo='" +
                    OrganzationLogo + '\'' + ", ShortName='" + ShortName + '\'' + ", TelPhone='" + TelPhone + '\'' + ", ThumbimageUrl='" +
                    ThumbimageUrl + '\'' + ", PayRecordOne=" + PayRecordOne + ", ItemList=" + ItemList + ", Hospitalization=" + Hospitalization +
                    ", RechargeOne=" + RechargeOne + ", Query=" + Query + ", TodayClinic=" + TodayClinic + ", TrtimeOne=" + TrtimeOne + ", Trtime="
                    + Trtime + ", IntelligentOne=" + IntelligentOne + ", Recharge=" + Recharge + ", Check=" + Check + ", Inspection=" + Inspection
                    + ", Location='" + Location + '\'' + ", Latitude='" + Latitude + '\'' + ", Longitude='" + Longitude + '\'' + ", " +
                    "HospitalBookThrowClinicNumberTime='" + HospitalBookThrowClinicNumberTime + '\'' + ", Remark='" + Remark + '\'' + ", " +
                    "Description='" + Description + '\'' + '}';
        }
    }
}
