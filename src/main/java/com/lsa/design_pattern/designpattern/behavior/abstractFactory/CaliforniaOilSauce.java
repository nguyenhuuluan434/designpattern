package com.lsa.design_pattern.designpattern.behavior.abstractFactory;

public class CaliforniaOilSauce extends Sauce {

    public CaliforniaOilSauce() {
        this.prepareSauce();
    }

    @Override
    protected void prepareSauce() {
        System.out.println("Preparing california Oil sauce ...");
    }
}
