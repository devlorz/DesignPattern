package com.leeway.FactoryPattern;

/**
 * Created by Lee Lorz on 11/10/2016.
 */
public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else return null;
    }
}
