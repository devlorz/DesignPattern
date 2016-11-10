package com.leeway.FactoryPattern;

import com.leeway.FactoryPattern.Pizza;

/**
 * Created by Lee Lorz on 11/10/2016.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
