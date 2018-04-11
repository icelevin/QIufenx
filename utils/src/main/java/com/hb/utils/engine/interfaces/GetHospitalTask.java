package com.hb.utils.engine.interfaces;

import android.app.Activity;

import com.hb.utils.modle.HospitalInfoModel;

/**
 * 获取医院
 * Created by txl on 2017/10/27 0027.
 */

public abstract class GetHospitalTask {
    private static GetHospitalTask hospitalTask;

    public static GetHospitalTask getHospitalTask() {
        return hospitalTask;
    }

    protected static void setHospitalTask(GetHospitalTask hospitalTask) {
        GetHospitalTask.hospitalTask = hospitalTask;
    }

    public abstract void openHospitalPage(Activity activity, HospitalInfoModel.Features features);
}
