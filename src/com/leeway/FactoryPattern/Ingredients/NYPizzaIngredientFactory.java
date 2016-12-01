package com.leeway.FactoryPattern.Ingredients;

import com.leeway.FactoryPattern.Ingredients.Cheeses.Cheese;
import com.leeway.FactoryPattern.Ingredients.Cheeses.ReggianoCheese;
import com.leeway.FactoryPattern.Ingredients.Clam.Clams;
import com.leeway.FactoryPattern.Ingredients.Clam.FreshClams;
import com.leeway.FactoryPattern.Ingredients.Doughs.Dough;
import com.leeway.FactoryPattern.Ingredients.Doughs.ThinCrustDough;
import com.leeway.FactoryPattern.Ingredients.Pepperonis.Pepperoni;
import com.leeway.FactoryPattern.Ingredients.Pepperonis.SlicedPepperoni;
import com.leeway.FactoryPattern.Ingredients.Sauces.MarinaraSauce;
import com.leeway.FactoryPattern.Ingredients.Sauces.Sauce;
import com.leeway.FactoryPattern.Ingredients.Veggie.*;

/**
 * Created by Lee Lorz on 12/1/2016.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
