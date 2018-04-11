package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/25.
 */

/// 手术明细

public class PatientRecordOperateInfo implements Serializable{

    /// 手术明细Id

    public String OperateId;

    /// 手术明细名称

    public String OperateName;


    /// 手术日期

    public String OperateDate;


    /// 手术医师

    public String OperateDoctor;


    /// 麻醉医师

    public String AnesthesiaDoctor;


    /// 手术等级

    public String OperateLevel;


    /// 手术切口愈合等级

    public String OperateCutLevel;


    /// 手术开始时间

    public String StartTime;


    /// 手术结束时间

    public String EndTime;


    /// 麻醉等级

    public String AnesthesiaLevel;

    public String getOperateId() {
        return OperateId;
    }

    public void setOperateId(String operateId) {
        OperateId = operateId;
    }

    public String getOperateName() {
        return OperateName;
    }

    public void setOperateName(String operateName) {
        OperateName = operateName;
    }

    public String getOperateDate() {
        return OperateDate;
    }

    public void setOperateDate(String operateDate) {
        OperateDate = operateDate;
    }

    public String getOperateDoctor() {
        return OperateDoctor;
    }

    public void setOperateDoctor(String operateDoctor) {
        OperateDoctor = operateDoctor;
    }

    public String getAnesthesiaDoctor() {
        return AnesthesiaDoctor;
    }

    public void setAnesthesiaDoctor(String anesthesiaDoctor) {
        AnesthesiaDoctor = anesthesiaDoctor;
    }

    public String getOperateLevel() {
        return OperateLevel;
    }

    public void setOperateLevel(String operateLevel) {
        OperateLevel = operateLevel;
    }

    public String getOperateCutLevel() {
        return OperateCutLevel;
    }

    public void setOperateCutLevel(String operateCutLevel) {
        OperateCutLevel = operateCutLevel;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getAnesthesiaLevel() {
        return AnesthesiaLevel;
    }

    public void setAnesthesiaLevel(String anesthesiaLevel) {
        AnesthesiaLevel = anesthesiaLevel;
    }

    @Override
    public String toString() {
        return "PatientRecordOperateInfo{" +
                "OperateId='" + OperateId + '\'' +
                ", OperateName='" + OperateName + '\'' +
                ", OperateDate='" + OperateDate + '\'' +
                ", OperateDoctor='" + OperateDoctor + '\'' +
                ", AnesthesiaDoctor='" + AnesthesiaDoctor + '\'' +
                ", OperateLevel='" + OperateLevel + '\'' +
                ", OperateCutLevel='" + OperateCutLevel + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", AnesthesiaLevel='" + AnesthesiaLevel + '\'' +
                '}';
    }
}