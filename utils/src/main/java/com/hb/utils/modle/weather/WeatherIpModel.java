package com.hb.utils.modle.weather;

import com.hb.utils.modle.BaseModel;

/**
 * Created by ice on 2018/1/28.
 */

public class WeatherIpModel extends BaseModel {

    private String status;

    private String data;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

}
