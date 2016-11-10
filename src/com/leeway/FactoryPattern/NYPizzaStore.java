package com.leeway.FactoryPattern;

/**
 * Created by Lee Lorz on 11/10/2016.
 */
public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleChessePizza();
        } else return null;
    }
}
