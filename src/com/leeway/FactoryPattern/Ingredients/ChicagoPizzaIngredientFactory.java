package com.leeway.FactoryPattern.Ingredients;

import com.leeway.FactoryPattern.Ingredients.Cheeses.Cheese;
import com.leeway.FactoryPattern.Ingredients.Cheeses.MozzarellaCheese;
import com.leeway.FactoryPattern.Ingredients.Clam.Clams;
import com.leeway.FactoryPattern.Ingredients.Clam.FrozenClams;
import com.leeway.FactoryPattern.Ingredients.Doughs.Dough;
import com.leeway.FactoryPattern.Ingredients.Doughs.ThickCrustDough;
import com.leeway.FactoryPattern.Ingredients.Pepperonis.Pepperoni;
import com.leeway.FactoryPattern.Ingredients.Pepperonis.SlicedPepperoni;
import com.leeway.FactoryPattern.Ingredients.Sauces.PlumTomatoSauce;
import com.leeway.FactoryPattern.Ingredients.Sauces.Sauce;
import com.leeway.FactoryPattern.Ingredients.Veggie.BlackOlives;
import com.leeway.FactoryPattern.Ingredients.Veggie.Eggplant;
import com.leeway.FactoryPattern.Ingredients.Veggie.Spinach;
import com.leeway.FactoryPattern.Ingredients.Veggie.Veggies;

/**
 * Created by Lee Lorz on 12/2/2016.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
