package com.hb.utils.modle;

import java.io.Serializable;

/**
 * Created by ice on 2017/12/25.
 */

/// 电子病历基础信息

public class PatientRecordBaseInfo implements Serializable {

    /// 科室

    public String DepartmentName;


    /// 主治医生

    public String DoctorName;


    /// 主诉

    public String PatientDescript;


    /// 查体

    public String BodyExamine;


    /// 诊断

    public String Diagnosis;


    /// 疾病史

    public String Siseases;


    /// 注意事项

    public String Attention;


    /// 医院姓名

    public String HospitalName;

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

    public String getPatientDescript() {
        return PatientDescript;
    }

    public void setPatientDescript(String patientDescript) {
        PatientDescript = patientDescript;
    }

    public String getBodyExamine() {
        return BodyExamine;
    }

    public void setBodyExamine(String bodyExamine) {
        BodyExamine = bodyExamine;
    }

    public String getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        Diagnosis = diagnosis;
    }

    public String getSiseases() {
        return Siseases;
    }

    public void setSiseases(String siseases) {
        Siseases = siseases;
    }

    public String getAttention() {
        return Attention;
    }

    public void setAttention(String attention) {
        Attention = attention;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String hospitalName) {
        HospitalName = hospitalName;
    }

    @Override
    public String toString() {
        return "PatientRecordBaseInfo{" +
                "DepartmentName='" + DepartmentName + '\'' +
                ", DoctorName='" + DoctorName + '\'' +
                ", PatientDescript='" + PatientDescript + '\'' +
                ", BodyExamine='" + BodyExamine + '\'' +
                ", Diagnosis='" + Diagnosis + '\'' +
                ", Siseases='" + Siseases + '\'' +
                ", Attention='" + Attention + '\'' +
                ", HospitalName='" + HospitalName + '\'' +
                '}';
    }
}