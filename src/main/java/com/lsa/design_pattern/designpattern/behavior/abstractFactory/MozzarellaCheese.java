package com.lsa.design_pattern.designpattern.behavior.abstractFactory;

public class MozzarellaCheese extends Cheese {
    public MozzarellaCheese() {
        this.prepareCheese();
    }

    @Override
    protected void prepareCheese() {
        System.out.println("Preparing mozzarella cheese ...");
    }
}
