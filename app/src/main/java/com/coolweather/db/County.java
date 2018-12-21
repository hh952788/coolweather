package com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by HH88 on 2018/12/21.
 */

public class County extends DataSupport {
    private  int id;
    private  String countName; //记录县的名字
    private  String weatherId; //记录对应天气的ID
    private  int cityId;       //记录所属市的ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
