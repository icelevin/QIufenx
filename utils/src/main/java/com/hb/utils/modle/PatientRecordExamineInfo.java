package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/25.
 */

/// 检验信息

public class PatientRecordExamineInfo implements Serializable{

    /// 检验Id

    public String ExamineId;

    /// 检验分类

    public String ExamineType;


    /// 检验日期

    public String ExamineDate;


    /// 检验条形码

    public String BarCode;


    /// 检验条形码 图片地址

    public String BarCodeImage;


    /// 送检科室

    public String ExamineDepartment;

    public String getExamineId() {
        return ExamineId;
    }

    public void setExamineId(String examineId) {
        ExamineId = examineId;
    }

    public String getExamineType() {
        return ExamineType;
    }

    public void setExamineType(String examineType) {
        ExamineType = examineType;
    }

    public String getExamineDate() {
        return ExamineDate;
    }

    public void setExamineDate(String examineDate) {
        ExamineDate = examineDate;
    }

    public String getBarCode() {
        return BarCode;
    }

    public void setBarCode(String barCode) {
        BarCode = barCode;
    }

    public String getBarCodeImage() {
        return BarCodeImage;
    }

    public void setBarCodeImage(String barCodeImage) {
        BarCodeImage = barCodeImage;
    }

    public String getExamineDepartment() {
        return ExamineDepartment;
    }

    public void setExamineDepartment(String examineDepartment) {
        ExamineDepartment = examineDepartment;
    }

    @Override
    public String toString() {
        return "PatientRecordExamineInfo{" +
                "ExamineId='" + ExamineId + '\'' +
                ", ExamineType='" + ExamineType + '\'' +
                ", ExamineDate='" + ExamineDate + '\'' +
                ", BarCode='" + BarCode + '\'' +
                ", BarCodeImage='" + BarCodeImage + '\'' +
                ", ExamineDepartment='" + ExamineDepartment + '\'' +
                '}';
    }
}
