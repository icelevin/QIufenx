package com.hb.utils.engine.interfaces;

import android.app.Activity;

import com.hb.utils.engine.WebUrl;

/**
 * Created by ice on 2018/1/30.
 */

public abstract class GetWeatherTask {
    private static GetWeatherTask weatherTask;

    public static GetWeatherTask getWeatherTask() {
        return weatherTask;
    }

    public static void setWeatherTask(GetWeatherTask weatherTask) {
        GetWeatherTask.weatherTask = weatherTask;
    }

    public abstract void openWeather(Activity activity, WebUrl webUrl);
}
