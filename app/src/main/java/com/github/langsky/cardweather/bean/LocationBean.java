package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */
public class LocationBean {
    /**
     * city : Beijing
     * country : China
     * region :  Beijing
     */

    private String city;
    private String country;
    private String region;

    public static LocationBean objectFromData(String str) {

        return new Gson().fromJson(str, LocationBean.class);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
