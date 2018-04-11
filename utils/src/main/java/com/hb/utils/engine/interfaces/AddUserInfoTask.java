package com.hb.utils.engine.interfaces;

import android.app.Activity;

/**
 * Created by txl on 2017/12/21 0021.
 */

public abstract class AddUserInfoTask {
    private static AddUserInfoTask addUserInfoTask;

    public static AddUserInfoTask getAddUserInfoTask() {
        return addUserInfoTask;
    }

    protected static void setAddUserInfoTask(AddUserInfoTask addUserInfoTask) {
        AddUserInfoTask.addUserInfoTask = addUserInfoTask;
    }

    public abstract void openAddUserInfoPage(Activity activity);
}
