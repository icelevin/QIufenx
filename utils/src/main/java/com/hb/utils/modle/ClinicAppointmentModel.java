package com.hb.utils.modle;

import java.util.List;

/**
 *
 * 号别坐诊原型
 * Created by txl on 2017/5/11 0011.
 */
public class ClinicAppointmentModel extends BaseModel<ClinicAppointmentModel.Appointment>{


    public static class Appointment{
        private String StartClinicDate;
        private String EndClinicDate;
        private List<DoctorAppointmentModel.Appointment> ClinicInfos;

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

        public List<DoctorAppointmentModel.Appointment> getClinicInfos() {
            return ClinicInfos;
        }

        public void setClinicInfos(List<DoctorAppointmentModel.Appointment> clinicInfos) {
            ClinicInfos = clinicInfos;
        }

        @Override
        public String toString() {
            return "Appointment{" +
                    "StartClinicDate='" + StartClinicDate + '\'' +
                    ", EndClinicDate='" + EndClinicDate + '\'' +
                    ", ClinicInfos=" + ClinicInfos +
                    '}';
        }
    }
}
