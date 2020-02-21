package com.lsa.design_pattern.designpattern.creational.factoryMethod;

public class VeggiePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Preparing ingredients for veggie pizza.");
    }
}
