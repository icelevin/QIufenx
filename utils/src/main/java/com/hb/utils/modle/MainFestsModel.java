package com.hb.utils.modle;

import java.io.Serializable;
import java.util.List;

/**
 * 住院清单
 * Created by txl on 2017/12/25 0025.
 */

public class MainFestsModel extends BaseModel<List<MainFestsModel.MainFests>> {
    public static class  MainFests implements Serializable{
        private String HospitalName;
        private String ConsumeDate;
        private List<ConsumeInfo> consumeInfo;
        private String PatientName;

        private String InHospitalNum;

        private String DeptName;

        private String PayMoneyTotal;

        private String Balance;
        public String getHospitalName() {
            return HospitalName;
        }

        public void setHospitalName(String hospitalName) {
            HospitalName = hospitalName;
        }

        public String getConsumeDate() {
            return ConsumeDate;
        }

        public void setConsumeDate(String consumeDate) {
            ConsumeDate = consumeDate;
        }

        public List<ConsumeInfo> getConsumeInfo() {
            return consumeInfo;
        }

        public void setConsumeInfo(List<ConsumeInfo> consumeInfo) {
            this.consumeInfo = consumeInfo;
        }

        public String getPatientName() {
            return PatientName;
        }

        public void setPatientName(String patientName) {
            PatientName = patientName;
        }

        public String getInHospitalNum() {
            return InHospitalNum;
        }

        public void setInHospitalNum(String inHospitalNum) {
            InHospitalNum = inHospitalNum;
        }

        public String getDeptName() {
            return DeptName;
        }

        public void setDeptName(String deptName) {
            DeptName = deptName;
        }

        public String getPayMoneyTotal() {
            return PayMoneyTotal;
        }

        public void setPayMoneyTotal(String payMoneyTotal) {
            PayMoneyTotal = payMoneyTotal;
        }

        public String getBalance() {
            return Balance;
        }

        public void setBalance(String balance) {
            Balance = balance;
        }

        @Override
        public String toString() {
            return "MainFests{" +
                    "HospitalName='" + HospitalName + '\'' +
                    ", ConsumeDate='" + ConsumeDate + '\'' +
                    ", consumeInfo=" + consumeInfo +
                    ", PatientName='" + PatientName + '\'' +
                    ", InHospitalNum='" + InHospitalNum + '\'' +
                    ", DeptName='" + DeptName + '\'' +
                    ", PayMoneyTotal='" + PayMoneyTotal + '\'' +
                    ", Balance='" + Balance + '\'' +
                    '}';
        }
    }

    public static class ConsumeInfo implements Serializable{
        private String MedicineType;
        private String MedicineName;
        private String Specifications;
        private int MedicineNumber;
        private Double Price;
        private String MedicineUnit;

        public String getMedicineType() {
            return MedicineType;
        }

        public void setMedicineType(String medicineType) {
            MedicineType = medicineType;
        }

        public String getMedicineName() {
            return MedicineName;
        }

        public void setMedicineName(String medicineName) {
            MedicineName = medicineName;
        }

        public String getSpecifications() {
            return Specifications;
        }

        public void setSpecifications(String specifications) {
            Specifications = specifications;
        }

        public int getMedicineNumber() {
            return MedicineNumber;
        }

        public void setMedicineNumber(int medicineNumber) {
            MedicineNumber = medicineNumber;
        }

        public Double getPrice() {
            return Price;
        }

        public void setPrice(Double price) {
            Price = price;
        }

        public String getMedicineUnit() {
            return MedicineUnit;
        }

        public void setMedicineUnit(String medicineUnit) {
            MedicineUnit = medicineUnit;
        }

        @Override
        public String toString() {
            return "ConsumeInfo{" + "MedicineType='" + MedicineType + '\'' + ", MedicineName='" + MedicineName + '\'' + ", Specifications='" +
                    Specifications + '\'' + ", MedicineNumber=" + MedicineNumber + ", Price=" + Price + ", MedicineUnit='" + MedicineUnit + '\'' + '}';
        }
    }
}

