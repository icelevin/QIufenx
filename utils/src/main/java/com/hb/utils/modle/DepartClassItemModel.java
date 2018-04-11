package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 *
 * 标准科室分类下的二级科室
 *
 * Created by txl on 2017/5/15 0015.
 */
public class DepartClassItemModel extends BaseModel<List<DepartClassItemModel.DepartClassItem>> {

    /**
     * 标准科室分类下的列表
     */
    public static class DepartClassItem implements Serializable{
        private String DepartmentId;
        private String DepartmentCode;
        private String FullName;
        private String ShortName;
        private String Address;
        private String Telephone;
        private String HospitalName;
        private String HospitalLevel;
        private String HospitalImg;

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

        public String getFullName() {
            return FullName;
        }

        public void setFullName(String fullName) {
            FullName = fullName;
        }

        public String getShortName() {
            return ShortName;
        }

        public void setShortName(String shortName) {
            ShortName = shortName;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }

        public String getTelephone() {
            return Telephone;
        }

        public void setTelephone(String telephone) {
            Telephone = telephone;
        }

        public String getHospitalName() {
            return HospitalName;
        }

        public void setHospitalName(String hospitalName) {
            HospitalName = hospitalName;
        }

        public String getHospitalLevel() {
            return HospitalLevel;
        }

        public void setHospitalLevel(String hospitalLevel) {
            HospitalLevel = hospitalLevel;
        }

        public String getHospitalImg() {
            return HospitalImg;
        }

        public void setHospitalImg(String hospitalImg) {
            HospitalImg = hospitalImg;
        }

        @Override
        public String toString() {
            return "DepartClassItem{" +
                    "DepartmentId='" + DepartmentId + '\'' +
                    ", DepartmentCode='" + DepartmentCode + '\'' +
                    ", FullName='" + FullName + '\'' +
                    ", ShortName='" + ShortName + '\'' +
                    ", Address='" + Address + '\'' +
                    ", Telephone='" + Telephone + '\'' +
                    ", HospitalName='" + HospitalName + '\'' +
                    ", HospitalLevel='" + HospitalLevel + '\'' +
                    ", HospitalImg='" + HospitalImg + '\'' +
                    '}';
        }
    }
}
