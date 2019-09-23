package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Windows on 2019-09-20.
 */

public class Province extends DataSupport {

    //实体类的唯一标识id
    private int id;
    //省名
    private String provinceName;
    //省代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
