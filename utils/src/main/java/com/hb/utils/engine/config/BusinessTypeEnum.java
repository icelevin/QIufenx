package com.hb.utils.engine.config;

import java.io.Serializable;

/**
 * Created by ice on 2018/3/15.
 */

public enum BusinessTypeEnum implements Serializable{
    jiuzhenka(0x0000,"就诊卡充值"),
    zhenjianzhifu(0x0001,"诊间支付"),
    zhuyuanyujiaojin(0x0002,"住院预交金");
    private int key;
    private String value;

    BusinessTypeEnum(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BusinessTypeEnum{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
