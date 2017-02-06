package com.leeway.DecoratorPattern;

/**
 * Created by DEV-PC5 on 2017/02/06.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
