package com.leeway.DecoratorPattern;

/**
 * Created by DEV-PC5 on 2017/02/06.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
