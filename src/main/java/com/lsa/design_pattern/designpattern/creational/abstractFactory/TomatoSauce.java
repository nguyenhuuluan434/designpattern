package com.lsa.design_pattern.designpattern.creational.abstractFactory;

public class TomatoSauce extends Sauce {
    public TomatoSauce() {
        this.prepareSauce();
    }

    @Override
    protected void prepareSauce() {
        System.out.println("Preparing tomato sauce ...");
    }
}
