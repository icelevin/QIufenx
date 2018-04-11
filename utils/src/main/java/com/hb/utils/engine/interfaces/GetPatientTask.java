package com.hb.utils.engine.interfaces;

import android.app.Activity;

/**
 *
 * 获取就诊人
 * Created by txl on 2017/10/27 0027.
 */

public abstract class GetPatientTask {
    private static GetPatientTask patientTask;

    public static GetPatientTask getPatientTask() {
        return patientTask;
    }

    protected static void setPatientTask(GetPatientTask patientTask) {
        GetPatientTask.patientTask = patientTask;
    }

    public abstract void openPatientPage(Activity activity);
}
