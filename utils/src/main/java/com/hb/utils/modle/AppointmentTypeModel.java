package com.hb.utils.modle;

import java.util.List;

/**
 * 就诊类型
 * Created by txl on 2017/5/12 0012.
 */
public class AppointmentTypeModel extends BaseModel<AppointmentTypeModel.Appointment> {

    public static class Appointment{
        private String HospitalName;
        private String HospitalId;
        private String DepartmentName;
        private String ClinicName;
        private String ClinicPrice;
        private String ClinicChannelType;
        private List<AppointmentType> ListAppointmentType;


        public String getHospitalName() {
            return HospitalName;
        }

        public void setHospitalName(String hospitalName) {
            HospitalName = hospitalName;
        }

        public String getHospitalId() {
            return HospitalId;
        }

        public void setHospitalId(String hospitalId) {
            HospitalId = hospitalId;
        }

        public String getDepartmentName() {
            return DepartmentName;
        }

        public void setDepartmentName(String departmentName) {
            DepartmentName = departmentName;
        }

        public String getClinicName() {
            return ClinicName;
        }

        public void setClinicName(String clinicName) {
            ClinicName = clinicName;
        }

        public String getClinicPrice() {
            return ClinicPrice;
        }

        public void setClinicPrice(String clinicPrice) {
            ClinicPrice = clinicPrice;
        }

        public String getClinicChannelType() {
            return ClinicChannelType;
        }

        public void setClinicChannelType(String clinicChannelType) {
            ClinicChannelType = clinicChannelType;
        }

        public List<AppointmentType> getListAppointmentType() {
            return ListAppointmentType;
        }

        public void setListAppointmentType(List<AppointmentType> listAppointmentType) {
            ListAppointmentType = listAppointmentType;
        }

        @Override
        public String toString() {
            return "Appointment{" +
                    "HospitalName='" + HospitalName + '\'' +
                    ", HospitalId='" + HospitalId + '\'' +
                    ", DepartmentName='" + DepartmentName + '\'' +
                    ", ClinicName='" + ClinicName + '\'' +
                    ", ClinicPrice='" + ClinicPrice + '\'' +
                    ", ClinicChannelType='" + ClinicChannelType + '\'' +
                    ", ListAppointmentType=" + ListAppointmentType +
                    '}';
        }
    }

    public static class AppointmentType{
        private String Name;
        private String Value;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getValue() {
            return Value;
        }

        public void setValue(String value) {
            Value = value;
        }

        @Override
        public String toString() {
            return "AppointmentType{" +
                    "Name='" + Name + '\'' +
                    ", Value='" + Value + '\'' +
                    '}';
        }
    }
}
