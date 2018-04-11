package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/22.
 */

public class InspectSearchResponse implements Serializable {

    /// 检查日期

    public String InspectDate;

    /// 检查ID

    public String InspectId;

    /// 检查项目名称

    public String InspectName;

    /// 条码

    public String InspectNumber;

    /// 医院名称

    public String HospitalName;

    public String getInspectDate() {
        return InspectDate;
    }

    public void setInspectDate(String inspectDate) {
        InspectDate = inspectDate;
    }

    public String getInspectId() {
        return InspectId;
    }

    public void setInspectId(String inspectId) {
        InspectId = inspectId;
    }

    public String getInspectName() {
        return InspectName;
    }

    public void setInspectName(String inspectName) {
        InspectName = inspectName;
    }

    public String getInspectNumber() {
        return InspectNumber;
    }

    public void setInspectNumber(String inspectNumber) {
        InspectNumber = inspectNumber;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "InspectSearchResponse{" +
                "InspectDate='" + InspectDate + '\'' +
                ", InspectId='" + InspectId + '\'' +
                ", InspectName='" + InspectName + '\'' +
                ", InspectNumber='" + InspectNumber + '\'' +
                ", HospitalName='" + HospitalName + '\'' +
                '}';
    }
}
