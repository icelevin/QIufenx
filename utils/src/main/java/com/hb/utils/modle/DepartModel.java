package com.hb.utils.modle;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by txl on 2017/5/5 0005.
 */
public class DepartModel extends BaseModel<List<DepartModel.Depart>> {
    public static class Depart implements Serializable {
        public static final long serialVersionUID = 1L;
        private String Area;
        private String AreaDescription;
        private String Building;
        private String City;
        private String Createip;
        private String Createtime;
        private String Createuser;
        private String Depratmentcode;
        private String Description;
        private String DisplayStatus;
        private String Floor;
        @SerializedName(value = "Fullname", alternate = {"FullName"})
        private String Fullname;
        private String HisCode;
        private String HospitalCode;
        private String Hospital_id;
        @SerializedName(value = "Id", alternate = {"DepartmentId"})
        private String Id;
        private boolean IsCreateCode;
        private boolean IsUnique;
        private String Logourl;
        private String ParentFullName;
        private String Parent_id;
        private String PinyinCode;
        private int Property;
        private String Province;
        private String Region;
        private String Shortname;
        private int Sort;
        //    private int Status;   搜索结果返回汉字，会导致json解析异常
        private String Telphone;
        private int Type;
        private String Updatetime;
        private String Updateuser;
        private int appCount;
        private String HospitalName;

        public String getHospitalName() {
            return HospitalName;
        }

        public void setHospitalName(String hospitalName) {
            HospitalName = hospitalName;
        }

        public String getArea() {
            return Area;
        }

        public void setArea(String area) {
            Area = area;
        }

        public String getAreaDescription() {
            return AreaDescription;
        }

        public void setAreaDescription(String areaDescription) {
            AreaDescription = areaDescription;
        }

        public String getBuilding() {
            return Building;
        }

        public void setBuilding(String building) {
            Building = building;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String city) {
            City = city;
        }

        public String getCreateip() {
            return Createip;
        }

        public void setCreateip(String createip) {
            Createip = createip;
        }

        public String getCreatetime() {
            return Createtime;
        }

        public void setCreatetime(String createtime) {
            Createtime = createtime;
        }

        public String getCreateuser() {
            return Createuser;
        }

        public void setCreateuser(String createuser) {
            Createuser = createuser;
        }

        public String getDepratmentcode() {
            return Depratmentcode;
        }

        public void setDepratmentcode(String depratmentcode) {
            Depratmentcode = depratmentcode;
        }

        public String getDescription() {
            return Description;
        }

        public void setDescription(String description) {
            Description = description;
        }

        public String getDisplayStatus() {
            return DisplayStatus;
        }

        public void setDisplayStatus(String displayStatus) {
            DisplayStatus = displayStatus;
        }

        public String getFloor() {
            return Floor;
        }

        public void setFloor(String floor) {
            Floor = floor;
        }

        public String getFullname() {
            return Fullname;
        }

        public void setFullname(String fullname) {
            Fullname = fullname;
        }

        public String getHisCode() {
            return HisCode;
        }

        public void setHisCode(String hisCode) {
            HisCode = hisCode;
        }

        public String getHospitalCode() {
            return HospitalCode;
        }

        public void setHospitalCode(String hospitalCode) {
            HospitalCode = hospitalCode;
        }

        public String getHospital_id() {
            return Hospital_id;
        }

        public void setHospital_id(String hospital_id) {
            Hospital_id = hospital_id;
        }

        public String getId() {
            return Id;
        }

        public void setId(String id) {
            Id = id;
        }

        public boolean isCreateCode() {
            return IsCreateCode;
        }

        public void setCreateCode(boolean createCode) {
            IsCreateCode = createCode;
        }

        public boolean isUnique() {
            return IsUnique;
        }

        public void setUnique(boolean unique) {
            IsUnique = unique;
        }

        public String getLogourl() {
            return Logourl;
        }

        public void setLogourl(String logourl) {
            Logourl = logourl;
        }

        public String getParentFullName() {
            return ParentFullName;
        }

        public void setParentFullName(String parentFullName) {
            ParentFullName = parentFullName;
        }

        public String getParent_id() {
            return Parent_id;
        }

        public void setParent_id(String parent_id) {
            Parent_id = parent_id;
        }

        public String getPinyinCode() {
            return PinyinCode;
        }

        public void setPinyinCode(String pinyinCode) {
            PinyinCode = pinyinCode;
        }

        public int getProperty() {
            return Property;
        }

        public void setProperty(int property) {
            Property = property;
        }

        public String getProvince() {
            return Province;
        }

        public void setProvince(String province) {
            Province = province;
        }

        public String getRegion() {
            return Region;
        }

        public void setRegion(String region) {
            Region = region;
        }

        public String getShortname() {
            return Shortname;
        }

        public void setShortname(String shortname) {
            Shortname = shortname;
        }

        public int getSort() {
            return Sort;
        }

        public void setSort(int sort) {
            Sort = sort;
        }


        public String getTelphone() {
            return Telphone;
        }

        public void setTelphone(String telphone) {
            Telphone = telphone;
        }

        public int getType() {
            return Type;
        }

        public void setType(int type) {
            Type = type;
        }

        public String getUpdatetime() {
            return Updatetime;
        }

        public void setUpdatetime(String updatetime) {
            Updatetime = updatetime;
        }

        public String getUpdateuser() {
            return Updateuser;
        }

        public void setUpdateuser(String updateuser) {
            Updateuser = updateuser;
        }

        public int getAppCount() {
            return appCount;
        }

        public void setAppCount(int appCount) {
            this.appCount = appCount;
        }


        public boolean getIsCreateCode() {
            return this.IsCreateCode;
        }

        public void setIsCreateCode(boolean IsCreateCode) {
            this.IsCreateCode = IsCreateCode;
        }

        public boolean getIsUnique() {
            return this.IsUnique;
        }

        public void setIsUnique(boolean IsUnique) {
            this.IsUnique = IsUnique;
        }

        @Override
        public String toString() {
            return "Depart{" +
                    "Area='" + Area + '\'' +
                    ", AreaDescription='" + AreaDescription + '\'' +
                    ", Building='" + Building + '\'' +
                    ", City='" + City + '\'' +
                    ", Createip='" + Createip + '\'' +
                    ", Createtime='" + Createtime + '\'' +
                    ", Createuser='" + Createuser + '\'' +
                    ", Depratmentcode='" + Depratmentcode + '\'' +
                    ", Description='" + Description + '\'' +
                    ", DisplayStatus='" + DisplayStatus + '\'' +
                    ", Floor='" + Floor + '\'' +
                    ", Fullname='" + Fullname + '\'' +
                    ", HisCode='" + HisCode + '\'' +
                    ", HospitalCode='" + HospitalCode + '\'' +
                    ", Hospital_id='" + Hospital_id + '\'' +
                    ", Id='" + Id + '\'' +
                    ", IsCreateCode=" + IsCreateCode +
                    ", IsUnique=" + IsUnique +
                    ", Logourl='" + Logourl + '\'' +
                    ", ParentFullName='" + ParentFullName + '\'' +
                    ", Parent_id='" + Parent_id + '\'' +
                    ", PinyinCode='" + PinyinCode + '\'' +
                    ", Property=" + Property +
                    ", Province='" + Province + '\'' +
                    ", Region='" + Region + '\'' +
                    ", Shortname='" + Shortname + '\'' +
                    ", Sort=" + Sort +
                    ", Telphone='" + Telphone + '\'' +
                    ", Type=" + Type +
                    ", Updatetime='" + Updatetime + '\'' +
                    ", Updateuser='" + Updateuser + '\'' +
                    ", appCount=" + appCount +
                    ", HospitalName='" + HospitalName + '\'' +
                    '}';
        }
    }
}
