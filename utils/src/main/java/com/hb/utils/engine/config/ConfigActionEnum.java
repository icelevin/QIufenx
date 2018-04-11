package com.hb.utils.engine.config;

import java.io.Serializable;

/**
 * Created by txl on 2018/3/9 0009.
 */

public enum ConfigActionEnum implements Serializable {
    openPage("page"),openFunction("function"),openWeb("url");

    private String actionName;
    ConfigActionEnum(String actionName){
        this.actionName = actionName;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    @Override
    public String toString() {
        return "ActionEnum{" + "actionName='" + actionName + '\'' + '}';
    }
}
