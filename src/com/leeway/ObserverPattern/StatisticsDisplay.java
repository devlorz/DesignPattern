package com.leeway.ObserverPattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by DEV-PC5 on 2017/02/01.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    ArrayList temps = new ArrayList();
    private float temp;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.temps.add(temp);
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    private float getAverage() {
        float average = 0.0f;
        for (Iterator<Float> i = temps.iterator(); i.hasNext();) {
            Float item = i.next();
            average += item;
        }
        return average / temps.size();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + getAverage() + "/"
                + Collections.max(temps) + "/"
                + Collections.min(temps));
    }
}
