package com.hb.utils.engine.interfaces;

import android.app.Activity;

import com.hb.utils.modle.HospitalInfoModel;
import com.hb.utils.modle.PatientModel;

/**
 *
 * 获取就诊卡
 * Created by txl on 2017/10/27 0027.
 */

public abstract class GetPatientCardTask {
    private static GetPatientCardTask patientCardTask;

    public static GetPatientCardTask getPatientCardTask() {
        return patientCardTask;
    }

    protected static void setPatientCardTask(GetPatientCardTask patientCardTask) {
        GetPatientCardTask.patientCardTask = patientCardTask;
    }

    public abstract void openPatientCardPage(Activity activity, HospitalInfoModel.Hospital hospital, PatientModel.Patient patient);
}
