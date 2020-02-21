package com.lsa.design_pattern.designpattern.creational.abstractFactory.usage;

import com.lsa.design_pattern.designpattern.creational.abstractFactory.factory.BaseToppingFactory;

public class VeggiePizza extends Pizza {
    BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }


}
