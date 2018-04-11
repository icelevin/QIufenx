package com.hb.utils.modle.weather;

/**
 * Created by ice on 2018/1/26.
 */

public class Today {
    private String sunrise;

    private String sunset;

    private Suggestion suggestion;

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunrise() {
        return this.sunrise;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getSunset() {
        return this.sunset;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }

    public Suggestion getSuggestion() {
        return this.suggestion;
    }
}
