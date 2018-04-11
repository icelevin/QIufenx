package com.hb.utils.modle;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * 医生坐诊原型
 *
 * Created by txl on 2017/5/10 0010.
 */
public class DoctorAppointmentModel extends BaseModel<List<DoctorAppointmentModel.DoctorAppointment>> implements Serializable{



    /**
     * 午别
     */
    public static enum  Noon implements Serializable{
        AM(1,"上午"),PM(2,"下午"),NAIGHT(3,"夜间"),DAWN(4,"凌晨"),DAY(5,"全天");

        private int value;
        private String valueText;

         Noon(int value,String valueText){
            this.value = value;
            this.valueText = valueText;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public String getValueText() {
            return valueText;
        }

        public void setValueText(String valueText) {
            this.valueText = valueText;
        }

        public static Noon getNoonByCode(int code){
            if(code == Noon.AM.getValue()){
                return Noon.AM;
            }else if(code == Noon.PM.getValue()){
                return Noon.PM;
            }else if(code == Noon.NAIGHT.getValue()){
                return Noon.NAIGHT;
            }else if(code == Noon.DAWN.getValue()){
                return Noon.DAWN;
            }else{
                return Noon.DAY;
            }
        }

        @Override
        public String toString() {
            return "Noon{" +
                    "value=" + value +
                    ", valueText='" + valueText + '\'' +
                    '}';
        }
    }

    public static class DoctorAppointment implements Serializable{
        private String ClinicLabelId;
        private String ClinicLabelName;
        private String DepartmentId;
        private String DepartmentName;
        private String OrganizationId;
        private String OrganizationName;
        private String StartClinicDate;
        private String EndClinicDate;
        private int ClinicMode;
        private List<Appointment> Appointments;

        public String getClinicLabelId() {
            return ClinicLabelId;
        }

        public void setClinicLabelId(String clinicLabelId) {
            ClinicLabelId = clinicLabelId;
        }

        public String getClinicLabelName() {
            return ClinicLabelName;
        }

        public void setClinicLabelName(String clinicLabelName) {
            ClinicLabelName = clinicLabelName;
        }

        public String getDepartmentId() {
            return DepartmentId;
        }

        public void setDepartmentId(String departmentId) {
            DepartmentId = departmentId;
        }

        public String getDepartmentName() {
            return DepartmentName;
        }

        public void setDepartmentName(String departmentName) {
            DepartmentName = departmentName;
        }

        public String getOrganizationId() {
            return OrganizationId;
        }

        public void setOrganizationId(String organizationId) {
            OrganizationId = organizationId;
        }

        public String getOrganizationName() {
            return OrganizationName;
        }

        public void setOrganizationName(String organizationName) {
            OrganizationName = organizationName;
        }

        public String getStartClinicDate() {
            return StartClinicDate;
        }

        public void setStartClinicDate(String startClinicDate) {
            StartClinicDate = startClinicDate;
        }

        public String getEndClinicDate() {
            return EndClinicDate;
        }

        public void setEndClinicDate(String endClinicDate) {
            EndClinicDate = endClinicDate;
        }

        public int getClinicMode() {
            return ClinicMode;
        }

        public void setClinicMode(int clinicMode) {
            ClinicMode = clinicMode;
        }

        public List<Appointment> getAppointments() {
            return Appointments;
        }

        public void setAppointments(List<Appointment> appointments) {
            Appointments = appointments;
        }

        @Override
        public String toString() {
            return "DoctorAppointment{" +
                    "ClinicLabelId='" + ClinicLabelId + '\'' +
                    ", ClinicLabelName='" + ClinicLabelName + '\'' +
                    ", DepartmentId='" + DepartmentId + '\'' +
                    ", DepartmentName='" + DepartmentName + '\'' +
                    ", OrganizationId='" + OrganizationId + '\'' +
                    ", OrganizationName='" + OrganizationName + '\'' +
                    ", StartClinicDate='" + StartClinicDate + '\'' +
                    ", EndClinicDate='" + EndClinicDate + '\'' +
                    ", ClinicMode=" + ClinicMode +
                    ", Appointments=" + Appointments +
                    '}';
        }
    }


    public static class Appointment implements Serializable{
        public static final int requestCode = 0x100; //预约请求code

        private String ClinicLabelId;
        private String ClinicLabelName;
        private String EmployeeId;
        private String EmployeeName;
        private String Date;
        private Date myParseDate;   //自定义的解析后的日期对象
        private int Noon;
        private String NoonName;
        private int Count;
        private int Total;
        private double Price;
        private double BasePrice;
        private boolean IsVisit;
        private int ClinicMode;
        private boolean IsOpenBookCheck;


        public Date getMyParseDate() {
            return myParseDate;
        }

        public void setMyParseDate(Date myParseDate) {
            this.myParseDate = myParseDate;
        }

        public String getClinicLabelId() {
            return ClinicLabelId;
        }

        public void setClinicLabelId(String clinicLabelId) {
            ClinicLabelId = clinicLabelId;
        }

        public String getClinicLabelName() {
            return ClinicLabelName;
        }

        public void setClinicLabelName(String clinicLabelName) {
            ClinicLabelName = clinicLabelName;
        }

        public String getEmployeeId() {
            return EmployeeId;
        }

        public void setEmployeeId(String employeeId) {
            EmployeeId = employeeId;
        }

        public String getEmployeeName() {
            return EmployeeName;
        }

        public void setEmployeeName(String employeeName) {
            EmployeeName = employeeName;
        }

        public String getDate() {
            return Date;
        }

        public void setDate(String date) {
            Date = date;
        }

        public int getNoon() {
            return Noon;
        }

        public void setNoon(int noon) {
            Noon = noon;
        }

        public String getNoonName() {
            return NoonName;
        }

        public void setNoonName(String noonName) {
            NoonName = noonName;
        }

        public int getCount() {
            return Count;
        }

        public void setCount(int count) {
            Count = count;
        }

        public int getTotal() {
            return Total;
        }

        public void setTotal(int total) {
            Total = total;
        }

        public double getPrice() {
            return Price;
        }

        public void setPrice(double price) {
            Price = price;
        }

        public double getBasePrice() {
            return BasePrice;
        }

        public void setBasePrice(double basePrice) {
            BasePrice = basePrice;
        }

        public boolean isVisit() {
            return IsVisit;
        }

        public void setVisit(boolean visit) {
            IsVisit = visit;
        }

        public int getClinicMode() {
            return ClinicMode;
        }

        public void setClinicMode(int clinicMode) {
            ClinicMode = clinicMode;
        }

        public boolean isOpenBookCheck() {
            return IsOpenBookCheck;
        }

        public void setOpenBookCheck(boolean openBookCheck) {
            IsOpenBookCheck = openBookCheck;
        }

        @Override
        public String toString() {
            return "Clinic{" +
                    "ClinicLabelId='" + ClinicLabelId + '\'' +
                    ", ClinicLabelName='" + ClinicLabelName + '\'' +
                    ", EmployeeId='" + EmployeeId + '\'' +
                    ", EmployeeName='" + EmployeeName + '\'' +
                    ", Date='" + Date + '\'' +
                    ", myParseDate=" + myParseDate +
                    ", Noon=" + Noon +
                    ", NoonName='" + NoonName + '\'' +
                    ", Count=" + Count +
                    ", Total=" + Total +
                    ", Price=" + Price +
                    ", BasePrice=" + BasePrice +
                    ", IsVisit=" + IsVisit +
                    ", ClinicMode=" + ClinicMode +
                    ", IsOpenBookCheck=" + IsOpenBookCheck +
                    '}';
        }
    }

    public static class AppointmentDate implements Serializable{
        private List<Date> dates;
        private Map<DoctorAppointmentModel.Noon,Map<Date,Appointment>> map;

        public List<Date> getDates() {
            return dates;
        }

        public void setDates(List<Date> dates) {
            this.dates = dates;
        }

        public Map<Noon, Map<Date, Appointment>> getMap() {
            return map;
        }

        public void setMap(Map<Noon, Map<Date, Appointment>> map) {
            this.map = map;
        }

        @Override
        public String toString() {
            return "AppointmentDate{" + "dates=" + dates + ", map=" + map + '}';
        }
    }
}
