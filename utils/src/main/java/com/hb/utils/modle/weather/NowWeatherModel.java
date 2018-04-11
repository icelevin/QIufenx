package com.hb.utils.modle.weather;

import com.hb.utils.modle.BaseModel;

import java.util.List;

/**
 * Created by ice on 2018/1/26.
 */

public class NowWeatherModel extends BaseModel {

    private String status;

    private List<Weather> weather;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public List<Weather> getWeather() {
        return this.weather;
    }

}
