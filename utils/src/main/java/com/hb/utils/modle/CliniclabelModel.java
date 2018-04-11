package com.hb.utils.modle;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 号别
 *
 * Created by txl on 2017/5/5 0005.
 */
public class CliniclabelModel extends BaseModel<List<CliniclabelModel.Cliniclabel>> {

    public static class Cliniclabel implements Serializable{
        private String ClinicLabelId;
        @SerializedName(value = "ClinicLabelName", alternate = {"ClinicName"})
        private String ClinicLabelName;
        @SerializedName(value = "DepartmentId", alternate = {"DepartId"})
        private String DepartmentId;
        @SerializedName(value = "DepartmentName", alternate = {"DepartName"})
        private String DepartmentName;
        private String DoctorId;
        private String DoctorName;
        @SerializedName(value = "OrganizationId", alternate = {"HospitalID"})
        private String OrganizationId;
        @SerializedName(value = "OrganizationName", alternate = {"HospitalName"})
        private String OrganizationName;
        @SerializedName(value = "DoctorImage", alternate = {"DoctorPicture"})
        private String DoctorImage;
        private String DoctorTitle;
        private String EmployeeTitleSort;
        private int AppointmentCount;
        private int TotalCount;
        @SerializedName(value = "DoctorSpecial", alternate = {"DoctorSpec"})
        private String DoctorSpecial;

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

        public String getDoctorId() {
            return DoctorId;
        }

        public void setDoctorId(String doctorId) {
            DoctorId = doctorId;
        }

        public String getDoctorName() {
            return DoctorName;
        }

        public void setDoctorName(String doctorName) {
            DoctorName = doctorName;
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

        public String getDoctorImage() {
            return DoctorImage;
        }

        public void setDoctorImage(String doctorImage) {
            DoctorImage = doctorImage;
        }

        public String getDoctorTitle() {
            return DoctorTitle;
        }

        public void setDoctorTitle(String doctorTitle) {
            DoctorTitle = doctorTitle;
        }

        public String getEmployeeTitleSort() {
            return EmployeeTitleSort;
        }

        public void setEmployeeTitleSort(String employeeTitleSort) {
            EmployeeTitleSort = employeeTitleSort;
        }

        public int getAppointmentCount() {
            return AppointmentCount;
        }

        public void setAppointmentCount(int appointmentCount) {
            AppointmentCount = appointmentCount;
        }

        public int getTotalCount() {
            return TotalCount;
        }

        public void setTotalCount(int totalCount) {
            TotalCount = totalCount;
        }

        public String getDoctorSpecial() {
            return DoctorSpecial;
        }

        public void setDoctorSpecial(String doctorSpecial) {
            DoctorSpecial = doctorSpecial;
        }

        @Override
        public String toString() {
            return "Cliniclabel{" +
                    "ClinicLabelId='" + ClinicLabelId + '\'' +
                    ", ClinicLabelName='" + ClinicLabelName + '\'' +
                    ", DepartmentId='" + DepartmentId + '\'' +
                    ", DepartmentName='" + DepartmentName + '\'' +
                    ", DoctorId='" + DoctorId + '\'' +
                    ", DoctorName='" + DoctorName + '\'' +
                    ", OrganizationId='" + OrganizationId + '\'' +
                    ", OrganizationName='" + OrganizationName + '\'' +
                    ", DoctorImage='" + DoctorImage + '\'' +
                    ", DoctorTitle='" + DoctorTitle + '\'' +
                    ", EmployeeTitleSort='" + EmployeeTitleSort + '\'' +
                    ", AppointmentCount=" + AppointmentCount +
                    ", TotalCount=" + TotalCount +
                    ", DoctorSpecial='" + DoctorSpecial + '\'' +
                    '}';
        }
    }
}
