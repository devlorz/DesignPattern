package com.leeway.FactoryPattern.Ingredients;

import com.leeway.FactoryPattern.Ingredients.Cheeses.Cheese;
import com.leeway.FactoryPattern.Ingredients.Clam.Clams;
import com.leeway.FactoryPattern.Ingredients.Doughs.Dough;
import com.leeway.FactoryPattern.Ingredients.Pepperonis.Pepperoni;
import com.leeway.FactoryPattern.Ingredients.Sauces.Sauce;
import com.leeway.FactoryPattern.Ingredients.Veggie.Veggies;

/**
 * Created by Lee Lorz on 12/1/2016.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();

}
