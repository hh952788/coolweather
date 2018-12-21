package com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HH88 on 2018/12/21.
 */

public class City extends DataSupport {
    private int id;
    private  String cityName; //记录城市名字
    private  int cityCode;    //记录城市的代号

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
}
