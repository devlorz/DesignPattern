package com.leeway.FactoryPattern;

import com.leeway.FactoryPattern.Ingredients.Cheeses.Cheese;
import com.leeway.FactoryPattern.Ingredients.Clam.Clams;
import com.leeway.FactoryPattern.Ingredients.Doughs.Dough;
import com.leeway.FactoryPattern.Ingredients.Pepperonis.Pepperoni;
import com.leeway.FactoryPattern.Ingredients.Sauces.Sauce;
import com.leeway.FactoryPattern.Ingredients.Veggie.Veggies;

import java.util.ArrayList;

/**
 * Created by Lee Lorz on 11/10/2016.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clam;
    Veggies veggies[];
    Pepperoni pepperoni;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
