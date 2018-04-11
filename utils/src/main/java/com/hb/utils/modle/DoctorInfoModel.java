package com.hb.utils.modle;

import java.io.Serializable;

/**
 *
 * 医生详情
 *
 * Created by txl on 2017/5/9 0009.
 */
public class DoctorInfoModel extends BaseModel<DoctorInfoModel.DoctorInfo> {

    public static class DoctorInfo implements Serializable{
        private String DoctorId;
        private String DoctorCode;
        private String DoctorName;
        private String DoctorTitle;
        private String DoctorImage;
        private String DoctorIntro; //简介
        private String DoctorSpecial;//擅长
        private String DepartmentId;
        private String DepartmentCode;
        private String DepartmentName;
        private String OrganizationId;
        private String OrganizationCode;
        private String OrganizationName;
        private int AppointmentCount;
        private String SexText;
        private String QrCodeUrl;
        private String QrCodeImage;
        private boolean IsFollow;

        public String getDoctorId() {
            return DoctorId;
        }

        public void setDoctorId(String doctorId) {
            DoctorId = doctorId;
        }

        public String getDoctorCode() {
            return DoctorCode;
        }

        public void setDoctorCode(String doctorCode) {
            DoctorCode = doctorCode;
        }

        public String getDoctorName() {
            return DoctorName;
        }

        public void setDoctorName(String doctorName) {
            DoctorName = doctorName;
        }

        public String getDoctorTitle() {
            return DoctorTitle;
        }

        public void setDoctorTitle(String doctorTitle) {
            DoctorTitle = doctorTitle;
        }

        public String getDoctorImage() {
            return DoctorImage;
        }

        public void setDoctorImage(String doctorImage) {
            DoctorImage = doctorImage;
        }

        public String getDoctorIntro() {
            return DoctorIntro;
        }

        public void setDoctorIntro(String doctorIntro) {
            DoctorIntro = doctorIntro;
        }

        public String getDoctorSpecial() {
            return DoctorSpecial;
        }

        public void setDoctorSpecial(String doctorSpecial) {
            DoctorSpecial = doctorSpecial;
        }

        public String getDepartmentId() {
            return DepartmentId;
        }

        public void setDepartmentId(String departmentId) {
            DepartmentId = departmentId;
        }

        public String getDepartmentCode() {
            return DepartmentCode;
        }

        public void setDepartmentCode(String departmentCode) {
            DepartmentCode = departmentCode;
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

        public String getOrganizationCode() {
            return OrganizationCode;
        }

        public void setOrganizationCode(String organizationCode) {
            OrganizationCode = organizationCode;
        }

        public String getOrganizationName() {
            return OrganizationName;
        }

        public void setOrganizationName(String organizationName) {
            OrganizationName = organizationName;
        }

        public int getAppointmentCount() {
            return AppointmentCount;
        }

        public void setAppointmentCount(int appointmentCount) {
            AppointmentCount = appointmentCount;
        }

        public String getSexText() {
            return SexText;
        }

        public void setSexText(String sexText) {
            SexText = sexText;
        }

        public String getQrCodeUrl() {
            return QrCodeUrl;
        }

        public void setQrCodeUrl(String qrCodeUrl) {
            QrCodeUrl = qrCodeUrl;
        }

        public String getQrCodeImage() {
            return QrCodeImage;
        }

        public void setQrCodeImage(String qrCodeImage) {
            QrCodeImage = qrCodeImage;
        }

        public boolean isFollow() {
            return IsFollow;
        }

        public void setFollow(boolean follow) {
            IsFollow = follow;
        }

        @Override
        public String toString() {
            return "DoctorInfo{" +
                    "DoctorId='" + DoctorId + '\'' +
                    ", DoctorCode='" + DoctorCode + '\'' +
                    ", DoctorName='" + DoctorName + '\'' +
                    ", DoctorTitle='" + DoctorTitle + '\'' +
                    ", DoctorImage='" + DoctorImage + '\'' +
                    ", DoctorIntro='" + DoctorIntro + '\'' +
                    ", DoctorSpecial='" + DoctorSpecial + '\'' +
                    ", DepartmentId='" + DepartmentId + '\'' +
                    ", DepartmentCode='" + DepartmentCode + '\'' +
                    ", DepartmentName='" + DepartmentName + '\'' +
                    ", OrganizationId='" + OrganizationId + '\'' +
                    ", OrganizationCode='" + OrganizationCode + '\'' +
                    ", OrganizationName='" + OrganizationName + '\'' +
                    ", AppointmentCount=" + AppointmentCount +
                    ", SexText='" + SexText + '\'' +
                    ", QrCodeUrl='" + QrCodeUrl + '\'' +
                    ", QrCodeImage='" + QrCodeImage + '\'' +
                    ", IsFollow=" + IsFollow +
                    '}';
        }
    }
}
