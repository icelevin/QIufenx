package com.hb.utils.engine.config;

import java.io.Serializable;

/**
 * Created by ice on 2018/3/19.
 */

public enum PayMethodEnum implements Serializable{
    yinlian(0x00001,"银联"),weixin(0x00002,"微信"),zhifubao(0x00003,"支付宝"),jiuzhenka(0x000004,"就诊卡");
    private int id;
    private String value;


    PayMethodEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PayMethodEnum{" +
                "id=" + id +
                ", value='" + value + '\'' +
                '}';
    }
}
