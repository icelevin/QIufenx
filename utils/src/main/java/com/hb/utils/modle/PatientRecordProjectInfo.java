package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/25.
 */

/// 处方明细

public class PatientRecordProjectInfo implements Serializable
{

    /// 处方Id

    public String ProjectId ;


    /// 处方明细项Id

    public String ItemId ;


    /// 处方明细项名称

    public String ItemName ;


    /// 用药时间

    public String UseTime ;


    /// 用法

    public String UseAction ;


    /// 药品规格

    public String ItemStyle ;


    /// 医生嘱托

    public String DoctorAdvance ;


    /// 药品描述

    public String ItemDescript ;

    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getUseTime() {
        return UseTime;
    }

    public void setUseTime(String useTime) {
        UseTime = useTime;
    }

    public String getUseAction() {
        return UseAction;
    }

    public void setUseAction(String useAction) {
        UseAction = useAction;
    }

    public String getItemStyle() {
        return ItemStyle;
    }

    public void setItemStyle(String itemStyle) {
        ItemStyle = itemStyle;
    }

    public String getDoctorAdvance() {
        return DoctorAdvance;
    }

    public void setDoctorAdvance(String doctorAdvance) {
        DoctorAdvance = doctorAdvance;
    }

    public String getItemDescript() {
        return ItemDescript;
    }

    public void setItemDescript(String itemDescript) {
        ItemDescript = itemDescript;
    }

    @Override
    public String toString() {
        return "PatientRecordProjectInfo{" +
                "ProjectId='" + ProjectId + '\'' +
                ", ItemId='" + ItemId + '\'' +
                ", ItemName='" + ItemName + '\'' +
                ", UseTime='" + UseTime + '\'' +
                ", UseAction='" + UseAction + '\'' +
                ", ItemStyle='" + ItemStyle + '\'' +
                ", DoctorAdvance='" + DoctorAdvance + '\'' +
                ", ItemDescript='" + ItemDescript + '\'' +
                '}';
    }
}
