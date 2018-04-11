package com.hb.utils.modle.weather;

/**
 * Created by ice on 2018/1/26.
 */

public class Air_quality {
    private City city;

    private String stations;

    public void setCity(City city) {
        this.city = city;
    }

    public City getCity() {
        return this.city;
    }

    public void setStations(String stations) {
        this.stations = stations;
    }

    public String getStations() {
        return this.stations;
    }

    public static class City {
        private String aqi;

        private String pm25;

        private String pm10;

        private String so2;

        private String no2;

        private String co;

        private String o3;

        private String last_update;

        private String quality;

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getAqi() {
            return this.aqi;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPm25() {
            return this.pm25;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getPm10() {
            return this.pm10;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getSo2() {
            return this.so2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getNo2() {
            return this.no2;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getCo() {
            return this.co;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public String getO3() {
            return this.o3;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }

        public String getLast_update() {
            return this.last_update;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public String getQuality() {
            return this.quality;
        }
    }
}
