package com.leeway.DecoratorPattern;

/**
 * Created by DEV-PC5 on 2017/02/06.
 */
public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + "$" + beverage.cost());

        Beverage beverage2 = new DarkRoast();

    }
}
