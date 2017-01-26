package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by swd1 on 17-1-26.
 */
public class ForestItemBean {
    /**
     * forecast : {"code":"30","date":"26 Jan 2017","day":"Thu","high":"49","low":"21","text":"Partly Cloudy"}
     */

    private ForecastBean forecast;

    public static ForestItemBean objectFromData(String str) {

        return new Gson().fromJson(str, ForestItemBean.class);
    }

    public static List<ForestItemBean> arrayForestItemBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<ForestItemBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public ForecastBean getForecast() {
        return forecast;
    }

    public void setForecast(ForecastBean forecast) {
        this.forecast = forecast;
    }
}
