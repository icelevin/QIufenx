package com.hb.utils.modle.weather;

import java.util.List;

/**
 * Created by ice on 2018/1/26.
 */

public class Now {
    private String text;

    private String code;

    private String temperature;

    private String feels_like;

    private String wind_direction;

    private String wind_speed;

    private String wind_scale;

    private String humidity;

    private String visibility;

    private String pressure;

    private String pressure_rising;

    private Air_quality air_quality;

    private List<String> alarms;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return this.code;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperature() {
        return this.temperature;
    }

    public void setFeels_like(String feels_like) {
        this.feels_like = feels_like;
    }

    public String getFeels_like() {
        return this.feels_like;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWind_direction() {
        return this.wind_direction;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

    public String getWind_speed() {
        return this.wind_speed;
    }

    public void setWind_scale(String wind_scale) {
        this.wind_scale = wind_scale;
    }

    public String getWind_scale() {
        return this.wind_scale;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getVisibility() {
        return this.visibility;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getPressure() {
        return this.pressure;
    }

    public void setPressure_rising(String pressure_rising) {
        this.pressure_rising = pressure_rising;
    }

    public String getPressure_rising() {
        return this.pressure_rising;
    }

    public void setAir_quality(Air_quality air_quality) {
        this.air_quality = air_quality;
    }

    public Air_quality getAir_quality() {
        return this.air_quality;
    }

    public void setAlarms(List<String> alarms) {
        this.alarms = alarms;
    }

    public List<String> getAlarms() {
        return this.alarms;
    }

}
