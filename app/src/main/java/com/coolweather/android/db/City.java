package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Windows on 2019-09-23.
 */

public class City extends DataSupport {

    //实体类唯一标识
    private int id;

    //城市名称
    private String cityName;

    //城市代号
    private int cityCode;

    //所属省份的唯一标识
    private int provinceId;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
