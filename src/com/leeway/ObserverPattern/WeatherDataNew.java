package com.leeway.ObserverPattern;

import java.util.Observable;

/**
 * Created by DEV-PC5 on 2017/02/01.
 */
public class WeatherDataNew extends Observable{
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherDataNew() {

    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
