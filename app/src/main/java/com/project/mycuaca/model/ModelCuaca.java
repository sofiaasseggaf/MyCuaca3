package com.project.mycuaca.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ModelCuaca {

    Long updatedAt;
    String updatedAtText;
    String temp;
    String tempMin;
    String tempMax;
    String pressure;
    String humidity;
    Long sunrise;
    Long sunset;
    String windSpeed;
    String weatherDescription;
    String address;

    public ModelCuaca(Long updatedAt, String updatedAtText, String temp, String tempMin, String tempMax, String pressure, String humidity, Long sunrise, Long sunset, String windSpeed, String weatherDescription, String address) {
        this.updatedAt = updatedAt;
        this.updatedAtText = updatedAtText;
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
        this.sunrise = sunrise;
        this.sunset = sunset;
        this.windSpeed = windSpeed;
        this.weatherDescription = weatherDescription;
        this.address = address;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedAtText() {
        return updatedAtText;
    }

    public void setUpdatedAtText(String updatedAtText) {
        this.updatedAtText = updatedAtText;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getTempMin() {
        return tempMin;
    }

    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public Long getSunrise() {
        return sunrise;
    }

    public void setSunrise(Long sunrise) {
        this.sunrise = sunrise;
    }

    public Long getSunset() {
        return sunset;
    }

    public void setSunset(Long sunset) {
        this.sunset = sunset;
    }

    public String getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
