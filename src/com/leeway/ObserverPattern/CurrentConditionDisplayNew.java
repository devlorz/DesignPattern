package com.leeway.ObserverPattern;

import java.util.*;

/**
 * Created by DEV-PC5 on 2017/02/01.
 */
public class CurrentConditionDisplayNew implements java.util.Observer, DisplayElement {

    Observable observable;
    private float temp;
    private float humidity;

    public CurrentConditionDisplayNew(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Condition: " + temp
            + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataNew) {
            WeatherDataNew weatherData = (WeatherDataNew) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
