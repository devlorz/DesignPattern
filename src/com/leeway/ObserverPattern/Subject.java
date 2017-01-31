package com.leeway.ObserverPattern;

/**
 * Created by DEV-PC5 on 2017/01/31.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
