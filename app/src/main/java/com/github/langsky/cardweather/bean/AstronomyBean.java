package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */
public class AstronomyBean {
    /**
     * sunrise : 7:28 am
     * sunset : 5:27 pm
     */

    private String sunrise;
    private String sunset;

    public static AstronomyBean objectFromData(String str) {

        return new Gson().fromJson(str, AstronomyBean.class);
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
}
