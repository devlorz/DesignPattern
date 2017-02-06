package com.leeway.DecoratorPattern;

/**
 * Created by DEV-PC5 on 2017/02/06.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
