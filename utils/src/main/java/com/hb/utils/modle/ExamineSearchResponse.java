package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/21.
 */

public class ExamineSearchResponse implements Serializable {
    /// 检验日期
    public String ExamineDate;
    /// 检验ID
    public String ExamineId;
    /// 检验项目名
    public String ExamineName;
    /// 条码
    public String ExamineNumber;
    /// 医院名称
    public String HospitalName;

    public String getExamineDate() {
        return ExamineDate;
    }

    public void setExamineDate(String examineDate) {
        ExamineDate = examineDate;
    }

    public String getExamineId() {
        return ExamineId;
    }

    public void setExamineId(String examineId) {
        ExamineId = examineId;
    }

    public String getExamineName() {
        return ExamineName;
    }

    public void setExamineName(String examineName) {
        ExamineName = examineName;
    }

    public String getExamineNumber() {
        return ExamineNumber;
    }

    public void setExamineNumber(String examineNumber) {
        ExamineNumber = examineNumber;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "ExamineSearchResponse{" +
                "ExamineDate='" + ExamineDate + '\'' +
                ", ExamineId='" + ExamineId + '\'' +
                ", ExamineName='" + ExamineName + '\'' +
                ", ExamineNumber='" + ExamineNumber + '\'' +
                ", HospitalName='" + HospitalName + '\'' +
                '}';
    }
}
