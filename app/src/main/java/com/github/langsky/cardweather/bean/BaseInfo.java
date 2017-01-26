package com.github.langsky.cardweather.bean;

import com.google.gson.Gson;

/**
 * Created by swd1 on 17-1-26.
 */

public class BaseInfo {

    /**
     * location : {"city":"Beijing","country":"China","region":" Beijing"}
     * wind : {"chill":"23","direction":"340","speed":"11"}
     * atmosphere : {"humidity":"59","pressure":"1015.0","rising":"0","visibility":"16.1"}
     * astronomy : {"sunrise":"7:28 am","sunset":"5:27 pm"}
     * units : {"distance":"mi","pressure":"in","speed":"mph","temperature":"F"}
     */

    private LocationBean location;
    private WindBean wind;
    private AtmosphereBean atmosphere;
    private AstronomyBean astronomy;
    private UnitsBean units;

    public static BaseInfo objectFromData(String str) {

        return new Gson().fromJson(str, BaseInfo.class);
    }

    public LocationBean getLocation() {
        return location;
    }

    public void setLocation(LocationBean location) {
        this.location = location;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

    public AtmosphereBean getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(AtmosphereBean atmosphere) {
        this.atmosphere = atmosphere;
    }

    public AstronomyBean getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(AstronomyBean astronomy) {
        this.astronomy = astronomy;
    }

    public UnitsBean getUnits() {
        return units;
    }

    public void setUnits(UnitsBean units) {
        this.units = units;
    }
}
