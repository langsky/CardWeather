package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */

public class ConditionInfo {

    /**
     * condition : {"code":"28","date":"Thu, 26 Jan 2017 12:00 PM CST","temp":"30","text":"Mostly Cloudy"}
     */

    private ConditionBean condition;

    public static ConditionInfo objectFromData(String str) {

        return new Gson().fromJson(str, ConditionInfo.class);
    }

    public ConditionBean getCondition() {
        return condition;
    }

    public void setCondition(ConditionBean condition) {
        this.condition = condition;
    }
}
