package com.lsa.design_pattern.designpattern.creational.abstractFactory.usage;

public abstract class Pizza {
    public abstract void addIngredients();
    public void bakePizza(){
        System.out.println("Pizza baked at 400 for 20 minutes.");
    }
}
