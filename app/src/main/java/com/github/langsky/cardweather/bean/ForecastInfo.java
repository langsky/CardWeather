package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by swd1 on 17-1-26.
 */

public class ForecastInfo {


    /**
     * item : {"forecast":{"code":"30","date":"26 Jan 2017","day":"Thu","high":"49","low":"21","text":"Partly Cloudy"}}
     */

    private ForestItemBean item;

    public static ForecastInfo objectFromData(String str) {

        return new Gson().fromJson(str, ForecastInfo.class);
    }

    public static List<ForecastInfo> arrayForecastInfoFromData(String str) {

        Type listType = new TypeToken<ArrayList<ForecastInfo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public ForestItemBean getItem() {
        return item;
    }

    public void setItem(ForestItemBean item) {
        this.item = item;
    }
}
