package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */
public class AtmosphereBean {
    /**
     * humidity : 59
     * pressure : 1015.0
     * rising : 0
     * visibility : 16.1
     */

    private String humidity;
    private String pressure;
    private String rising;
    private String visibility;

    public static AtmosphereBean objectFromData(String str) {

        return new Gson().fromJson(str, AtmosphereBean.class);
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getRising() {
        return rising;
    }

    public void setRising(String rising) {
        this.rising = rising;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }
}
