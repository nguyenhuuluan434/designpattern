package com.lsa.design_pattern.designpattern.creational.abstractFactory.usage;

import com.lsa.design_pattern.designpattern.creational.abstractFactory.factory.BaseToppingFactory;

public class CheesePizza extends Pizza {
    BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for cheese pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
