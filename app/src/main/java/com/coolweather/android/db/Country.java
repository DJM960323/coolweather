package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Windows on 2019-09-23.
 */

public class Country extends DataSupport {

    //id唯一标识
    private int id;

    //县名称
    private String countryName;

    //县所对应的的天气id
    private int weatherId;

    //所属城市的id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
