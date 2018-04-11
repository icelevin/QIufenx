package cn.qiufenxi.www.qfx;

import com.hb.utils.BaseApplication;
import com.hb.utils.common.ConstUtils;
import com.hb.utils.common.SettingPref;
import com.hb.utils.tools.Utils;

import cn.qiufenxi.www.qfx.common.Constants;

public class MyApplication extends BaseApplication {
    private static MyApplication baseApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        this.baseApplication = this;

        initPram();
    }

    private void initPram() {
        ConstUtils.getInstance().init(Constants.class);

        SettingPref.getInstance().setValue("devicetype", Constants.getDeviceType());
        SettingPref.getInstance().setValue("version", Utils.getVersionName(this) + "");

    }


    public static MyApplication getAppContext() {
        return baseApplication;
    }
}
