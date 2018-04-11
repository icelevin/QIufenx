package com.hb.utils.engine.interfaces;

import android.app.Activity;

/**
 * Created by ice on 2017/12/20.
 */

public abstract class GetLoginTask {
    private static GetLoginTask loginTask;

    public static GetLoginTask getLoginTask() {
        return loginTask;
    }

    protected static void setLoginTask(GetLoginTask loginTask) {
        GetLoginTask.loginTask = loginTask;
    }

    public abstract  void openLogin(Activity activity);
}
