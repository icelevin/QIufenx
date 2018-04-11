package com.hb.utils.modle.config;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by txl on 2018/3/13 0013.
 */

public class ConfigActionModel implements Serializable {
    private String action;
    private String operate;
    private String parm;

    public ConfigActionModel(String action, String operate, String parm) {
        this.action = action;
        this.operate = operate;
        this.parm = parm;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getParm() {
        return parm;
    }

    public void setParm(String parm) {
        this.parm = parm;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this).replaceAll("\"","'");
    }
}
