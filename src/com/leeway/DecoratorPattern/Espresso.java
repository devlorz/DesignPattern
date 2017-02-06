package com.leeway.DecoratorPattern;

/**
 * Created by DEV-PC5 on 2017/02/06.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
