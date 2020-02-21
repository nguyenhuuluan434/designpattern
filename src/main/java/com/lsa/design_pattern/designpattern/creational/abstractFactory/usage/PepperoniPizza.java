package com.lsa.design_pattern.designpattern.creational.abstractFactory.usage;

import com.lsa.design_pattern.designpattern.creational.abstractFactory.factory.BaseToppingFactory;

public class PepperoniPizza extends Pizza {
    private BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for pepperoni pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
