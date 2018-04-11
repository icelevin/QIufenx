package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2018/3/15.
 */

public class HospitalListModel extends BaseModel<List<HospitalListModel.NewHospital>> {

    public static class NewHospital implements Serializable {
        private String HosId;

        private String FullName;

        private String ShortName;

        private List<OpenFunction> OpenFunction;

        private String StrOpenFunction;

        private boolean IsInsurance;

        private String AgcLevel;

        private String HosProperty;

        private String HosPropertyName;

        private String ThumbImageUrl;

        private double Distance;

        private String Latitude;

        private String Longitude;

        private String Sort;

        private String Area;

        private String SendTime;

        private String IsBook;

        private String HosPitalCode;

        private String Telphone;

        public void setHosId(String HosId) {
            this.HosId = HosId;
        }

        public String getHosId() {
            return this.HosId;
        }

        public void setFullName(String FullName) {
            this.FullName = FullName;
        }

        public String getFullName() {
            return this.FullName;
        }

        public void setShortName(String ShortName) {
            this.ShortName = ShortName;
        }

        public String getShortName() {
            return this.ShortName;
        }

        public void setOpenFunction(List<OpenFunction> OpenFunction) {
            this.OpenFunction = OpenFunction;
        }

        public List<OpenFunction> getOpenFunction() {
            return this.OpenFunction;
        }

        public void setStrOpenFunction(String StrOpenFunction) {
            this.StrOpenFunction = StrOpenFunction;
        }

        public String getStrOpenFunction() {
            return this.StrOpenFunction;
        }

        public void setIsInsurance(boolean IsInsurance) {
            this.IsInsurance = IsInsurance;
        }

        public boolean getIsInsurance() {
            return this.IsInsurance;
        }

        public void setAgcLevel(String AgcLevel) {
            this.AgcLevel = AgcLevel;
        }

        public String getAgcLevel() {
            return this.AgcLevel;
        }

        public void setHosProperty(String HosProperty) {
            this.HosProperty = HosProperty;
        }

        public String getHosProperty() {
            return this.HosProperty;
        }

        public void setHosPropertyName(String HosPropertyName) {
            this.HosPropertyName = HosPropertyName;
        }

        public String getHosPropertyName() {
            return this.HosPropertyName;
        }

        public void setThumbImageUrl(String ThumbImageUrl) {
            this.ThumbImageUrl = ThumbImageUrl;
        }

        public String getThumbImageUrl() {
            return this.ThumbImageUrl;
        }

        public void setDistance(double Distance) {
            this.Distance = Distance;
        }

        public double getDistance() {
            return this.Distance;
        }

        public void setLatitude(String Latitude) {
            this.Latitude = Latitude;
        }

        public String getLatitude() {
            return this.Latitude;
        }

        public void setLongitude(String Longitude) {
            this.Longitude = Longitude;
        }

        public String getLongitude() {
            return this.Longitude;
        }

        public void setSort(String Sort) {
            this.Sort = Sort;
        }

        public String getSort() {
            return this.Sort;
        }

        public void setArea(String Area) {
            this.Area = Area;
        }

        public String getArea() {
            return this.Area;
        }

        public void setSendTime(String SendTime) {
            this.SendTime = SendTime;
        }

        public String getSendTime() {
            return this.SendTime;
        }

        public void setIsBook(String IsBook) {
            this.IsBook = IsBook;
        }

        public String getIsBook() {
            return this.IsBook;
        }

        public void setHosPitalCode(String HosPitalCode) {
            this.HosPitalCode = HosPitalCode;
        }

        public String getHosPitalCode() {
            return this.HosPitalCode;
        }

        public void setTelphone(String Telphone) {
            this.Telphone = Telphone;
        }

        public String getTelphone() {
            return this.Telphone;
        }

        @Override
        public String toString() {
            return "NewHospital{" +
                    "HosId='" + HosId + '\'' +
                    ", FullName='" + FullName + '\'' +
                    ", ShortName='" + ShortName + '\'' +
                    ", OpenFunction=" + OpenFunction +
                    ", StrOpenFunction='" + StrOpenFunction + '\'' +
                    ", IsInsurance=" + IsInsurance +
                    ", AgcLevel='" + AgcLevel + '\'' +
                    ", HosProperty='" + HosProperty + '\'' +
                    ", HosPropertyName='" + HosPropertyName + '\'' +
                    ", ThumbImageUrl='" + ThumbImageUrl + '\'' +
                    ", Distance=" + Distance +
                    ", Latitude='" + Latitude + '\'' +
                    ", Longitude='" + Longitude + '\'' +
                    ", Sort='" + Sort + '\'' +
                    ", Area='" + Area + '\'' +
                    ", SendTime='" + SendTime + '\'' +
                    ", IsBook='" + IsBook + '\'' +
                    ", HosPitalCode='" + HosPitalCode + '\'' +
                    ", Telphone='" + Telphone + '\'' +
                    '}';
        }
    }
}