package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ice on 2017/12/22.
 */

public class EmrListModel extends BaseModel<List<EmrListModel.EmrList>> {
    public static class EmrList implements Serializable {

        /// 病历ID

        public String RecordId;


        /// 病历编号

        public String RecordNumber;


        /// 病历类型（一般指门诊）

        public String RecordType;


        /// 病历

        public String RecordDate;


        /// 诊断结果

        public String RecordDiagnosis;


        /// 科室

        public String DepartmentName;


        /// 医生

        public String DoctorName;


        /// 医院名称

        public String HospitalName;


        /// 费用总计

        public String Price;

        public String getRecordId() {
            return RecordId;
        }

        public void setRecordId(String recordId) {
            RecordId = recordId;
        }

        public String getRecordNumber() {
            return RecordNumber;
        }

        public void setRecordNumber(String recordNumber) {
            RecordNumber = recordNumber;
        }

        public String getRecordType() {
            return RecordType;
        }

        public void setRecordType(String recordType) {
            RecordType = recordType;
        }

        public String getRecordDate() {
            return RecordDate;
        }

        public void setRecordDate(String recordDate) {
            RecordDate = recordDate;
        }

        public String getRecordDiagnosis() {
            return RecordDiagnosis;
        }

        public void setRecordDiagnosis(String recordDiagnosis) {
            RecordDiagnosis = recordDiagnosis;
        }

        public String getDepartmentName() {
            return DepartmentName;
        }

        public void setDepartmentName(String departmentName) {
            DepartmentName = departmentName;
        }

        public String getDoctorName() {
            return DoctorName;
        }

        public void setDoctorName(String doctorName) {
            DoctorName = doctorName;
        }

        public String getHospitalName() {
            return HospitalName;
        }

        public void setHospitalName(String hospitalName) {
            HospitalName = hospitalName;
        }

        public String getPrice() {
            return Price;
        }

        public void setPrice(String price) {
            Price = price;
        }

        @Override
        public String toString() {
            return "EmrList{" +
                    "RecordId='" + RecordId + '\'' +
                    ", RecordNumber='" + RecordNumber + '\'' +
                    ", RecordType='" + RecordType + '\'' +
                    ", RecordDate='" + RecordDate + '\'' +
                    ", RecordDiagnosis='" + RecordDiagnosis + '\'' +
                    ", DepartmentName='" + DepartmentName + '\'' +
                    ", DoctorName='" + DoctorName + '\'' +
                    ", HospitalName='" + HospitalName + '\'' +
                    ", Price='" + Price + '\'' +
                    '}';
        }
    }
}
