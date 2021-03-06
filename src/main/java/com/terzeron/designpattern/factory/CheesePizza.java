package com.terzeron.designpattern.factory;

/**
 * Created by terzeron on 2016. 1. 11..
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
