package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */
public class UnitsBean {
    /**
     * distance : mi
     * pressure : in
     * speed : mph
     * temperature : F
     */

    private String distance;
    private String pressure;
    private String speed;
    private String temperature;

    public static UnitsBean objectFromData(String str) {

        return new Gson().fromJson(str, UnitsBean.class);
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
