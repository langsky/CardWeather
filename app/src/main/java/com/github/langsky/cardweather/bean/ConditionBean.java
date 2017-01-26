package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */
public class ConditionBean {
    /**
     * code : 28
     * date : Thu, 26 Jan 2017 12:00 PM CST
     * temp : 30
     * text : Mostly Cloudy
     */

    private String code;
    private String date;
    private String temp;
    private String text;

    public static ConditionBean objectFromData(String str) {

        return new Gson().fromJson(str, ConditionBean.class);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
