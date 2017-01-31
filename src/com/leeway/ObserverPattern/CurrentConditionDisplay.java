package com.leeway.ObserverPattern;

/**
 * Created by DEV-PC5 on 2017/01/31.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current condition: " + temp
            + "F degrees and " + humidity + "% humidity");
    }
}
