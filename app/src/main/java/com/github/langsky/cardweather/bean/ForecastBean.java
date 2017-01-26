package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by swd1 on 17-1-26.
 */
public class ForecastBean {
    /**
     * code : 30
     * date : 26 Jan 2017
     * day : Thu
     * high : 49
     * low : 21
     * text : Partly Cloudy
     */

    private String code;
    private String date;
    private String day;
    private String high;
    private String low;
    private String text;

    public static ForecastBean objectFromData(String str) {

        return new Gson().fromJson(str, ForecastBean.class);
    }

    public static List<ForecastBean> arrayForecastBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ForecastBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
