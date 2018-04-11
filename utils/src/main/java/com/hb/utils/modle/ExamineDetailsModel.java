package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * 检验详情model
 * Created by ice on 2017/12/21.
 */

public class ExamineDetailsModel extends BaseModel<ExamineDetailsModel.ExamineDetail> {
    public static class ExamineDetail implements Serializable{
        /// 检验Id

        public String ExamineId;

        /// 检验分类（常规检验，微生物检验）

        public String ExamineType;

        /// 标本名称

        public String ExamineName;

        /// 送检科室

        public String ExamineDepartment;

        /// 送检时间

        public String ExamineSendTime;

        /// 送检单号

        public String ExamineNumber;

        /// 生长状况（微生物--生长状况,常规检验无此项内容）

        public String ExamineGrowth;

        /// 鉴定结果（微生物--鉴定结果,常规检验无此项内容）

        public String ExamineResult;

        /// 检验说明

        public String ExamineDescript;

        /// 检验明细

        public List<ExamineItemResponse> Items;

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

        public String getExamineName() {
            return ExamineName;
        }

        public void setExamineName(String examineName) {
            ExamineName = examineName;
        }

        public String getExamineDepartment() {
            return ExamineDepartment;
        }

        public void setExamineDepartment(String examineDepartment) {
            ExamineDepartment = examineDepartment;
        }

        public String getExamineSendTime() {
            return ExamineSendTime;
        }

        public void setExamineSendTime(String examineSendTime) {
            ExamineSendTime = examineSendTime;
        }

        public String getExamineNumber() {
            return ExamineNumber;
        }

        public void setExamineNumber(String examineNumber) {
            ExamineNumber = examineNumber;
        }

        public String getExamineGrowth() {
            return ExamineGrowth;
        }

        public void setExamineGrowth(String examineGrowth) {
            ExamineGrowth = examineGrowth;
        }

        public String getExamineResult() {
            return ExamineResult;
        }

        public void setExamineResult(String examineResult) {
            ExamineResult = examineResult;
        }

        public String getExamineDescript() {
            return ExamineDescript;
        }

        public void setExamineDescript(String examineDescript) {
            ExamineDescript = examineDescript;
        }

        public List<ExamineItemResponse> getItems() {
            return Items;
        }

        public void setItems(List<ExamineItemResponse> items) {
            Items = items;
        }

        @Override
        public String toString() {
            return "ExamineDetail{" +
                    "ExamineId='" + ExamineId + '\'' +
                    ", ExamineType='" + ExamineType + '\'' +
                    ", ExamineName='" + ExamineName + '\'' +
                    ", ExamineDepartment='" + ExamineDepartment + '\'' +
                    ", ExamineSendTime='" + ExamineSendTime + '\'' +
                    ", ExamineNumber='" + ExamineNumber + '\'' +
                    ", ExamineGrowth='" + ExamineGrowth + '\'' +
                    ", ExamineResult='" + ExamineResult + '\'' +
                    ", ExamineDescript='" + ExamineDescript + '\'' +
                    ", Items=" + Items +
                    '}';
        }
    }
}
