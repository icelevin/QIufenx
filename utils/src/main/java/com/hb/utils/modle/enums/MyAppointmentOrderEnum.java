package com.hb.utils.modle.enums;

import java.io.Serializable;

/**
 * 自定义预约订单状态
 */
public enum MyAppointmentOrderEnum implements Serializable {
    Arrived(0,"已赴约");

    private String value;
    private int code;

    MyAppointmentOrderEnum(int code, String value){
        this.code = code;
        this.value = value;
    }
}
