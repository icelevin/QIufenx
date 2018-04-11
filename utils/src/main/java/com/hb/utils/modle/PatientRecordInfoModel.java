package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/12/25.
 */

public class PatientRecordInfoModel extends BaseModel <PatientRecordInfoModel.PatientRecordInfo>{
    public static class PatientRecordInfo implements Serializable{
        /// 电子病历基础信息

        public PatientRecordBaseInfo Record ;


        /// 费用信息

        public PatientRecordFeeInfo Fee ;


        /// 处方明细

        public List<PatientRecordProjectInfo> Projects ;


        /// 手术明细

        public List<PatientRecordOperateInfo> Operations ;


        /// 检查信息

        public List<PatientRecordInspectInfo> Inspects ;


        /// 检验明细

        public List<PatientRecordExamineInfo> Examines ;

        public PatientRecordBaseInfo getRecord() {
            return Record;
        }

        public void setRecord(PatientRecordBaseInfo record) {
            Record = record;
        }

        public PatientRecordFeeInfo getFee() {
            return Fee;
        }

        public void setFee(PatientRecordFeeInfo fee) {
            Fee = fee;
        }

        public List<PatientRecordProjectInfo> getProjects() {
            return Projects;
        }

        public void setProjects(List<PatientRecordProjectInfo> projects) {
            Projects = projects;
        }

        public List<PatientRecordOperateInfo> getOperations() {
            return Operations;
        }

        public void setOperations(List<PatientRecordOperateInfo> operations) {
            Operations = operations;
        }

        public List<PatientRecordInspectInfo> getInspects() {
            return Inspects;
        }

        public void setInspects(List<PatientRecordInspectInfo> inspects) {
            Inspects = inspects;
        }

        public List<PatientRecordExamineInfo> getExamines() {
            return Examines;
        }

        public void setExamines(List<PatientRecordExamineInfo> examines) {
            Examines = examines;
        }

        @Override
        public String toString() {
            return "PatientRecordInfo{" +
                    "Record=" + Record +
                    ", Fee=" + Fee +
                    ", Projects=" + Projects +
                    ", Operations=" + Operations +
                    ", Inspects=" + Inspects +
                    ", Examines=" + Examines +
                    '}';
        }
    }




    


    


    


    


    

}
