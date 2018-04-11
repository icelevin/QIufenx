package com.hb.utils.modle.weather;

import java.util.List;

/**
 * Created by ice on 2018/1/26.
 */

public class Weather {
    private String city_name;

    private String city_id;

    private String last_update;

    private Now now;

    private Today today;

    private List<Future> future;

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public String getCity_name() {
        return this.city_name;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getCity_id() {
        return this.city_id;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public String getLast_update() {
        return this.last_update;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public Now getNow() {
        return this.now;
    }

    public void setToday(Today today) {
        this.today = today;
    }

    public Today getToday() {
        return this.today;
    }

    public void setFuture(List<Future> future) {
        this.future = future;
    }

    public List<Future> getFuture() {
        return this.future;
    }
}
