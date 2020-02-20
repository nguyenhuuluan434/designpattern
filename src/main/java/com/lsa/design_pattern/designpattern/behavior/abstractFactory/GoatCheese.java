package com.lsa.design_pattern.designpattern.behavior.abstractFactory;

public class GoatCheese extends Cheese {

    public GoatCheese() {
        this.prepareCheese();
    }

    @Override
    protected void prepareCheese() {
        System.out.println("Preparing goat cheese....");
    }
}
