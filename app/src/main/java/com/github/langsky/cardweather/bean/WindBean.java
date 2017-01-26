package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */
public class WindBean {
    /**
     * chill : 23
     * direction : 340
     * speed : 11
     */

    private String chill;
    private String direction;
    private String speed;

    public static WindBean objectFromData(String str) {

        return new Gson().fromJson(str, WindBean.class);
    }

    public String getChill() {
        return chill;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
