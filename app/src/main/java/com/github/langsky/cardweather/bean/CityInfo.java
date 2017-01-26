package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by swd1 on 17-1-26.
 */

@Entity
public class CityInfo {

    /**
     * name : Xinyang country : China admin1 : Henan woeid : 26198100
     */

    @Id
    private Long id;

    private String name;
    private String country;
    private String admin1;
    private String woeid;

    @Generated(hash = 1472801619)
    public CityInfo(Long id, String name, String country, String admin1,
            String woeid) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.admin1 = admin1;
        this.woeid = woeid;
    }

    @Generated(hash = 300452937)
    public CityInfo() {
    }

    public static CityInfo objectFromData(String str) {

        return new Gson().fromJson(str, CityInfo.class);
    }

    public static List<CityInfo> arrayCityInfoFromData(String str) {

        Type listType = new TypeToken<ArrayList<CityInfo>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdmin1() {
        return admin1;
    }

    public void setAdmin1(String admin1) {
        this.admin1 = admin1;
    }

    public String getWoeid() {
        return woeid;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
