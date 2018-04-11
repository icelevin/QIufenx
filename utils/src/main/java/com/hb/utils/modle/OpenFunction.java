package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2018/3/15.
 */

public class OpenFunction implements Serializable {
    private String key;

    private String value;

    public void setKey(String key){
        this.key = key;
    }
    public String getKey(){
        return this.key;
    }
    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return "OpenFunction{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}