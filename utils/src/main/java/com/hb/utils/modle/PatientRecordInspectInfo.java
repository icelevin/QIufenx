package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/25.
 */

/// 检查信息

public class PatientRecordInspectInfo implements Serializable
{

    /// 检查Id

    public String InspectId ;

    /// 检查类型

    public String InspectType ;


    /// 检查部位

    public String InspectBody ;


    /// 检查日期

    public String InspectDate ;

    public String getInspectId() {
        return InspectId;
    }

    public void setInspectId(String inspectId) {
        InspectId = inspectId;
    }

    public String getInspectType() {
        return InspectType;
    }

    public void setInspectType(String inspectType) {
        InspectType = inspectType;
    }

    public String getInspectBody() {
        return InspectBody;
    }

    public void setInspectBody(String inspectBody) {
        InspectBody = inspectBody;
    }

    public String getInspectDate() {
        return InspectDate;
    }

    public void setInspectDate(String inspectDate) {
        InspectDate = inspectDate;
    }

    @Override
    public String toString() {
        return "PatientRecordInspectInfo{" +
                "InspectId='" + InspectId + '\'' +
                ", InspectType='" + InspectType + '\'' +
                ", InspectBody='" + InspectBody + '\'' +
                ", InspectDate='" + InspectDate + '\'' +
                '}';
    }
}
