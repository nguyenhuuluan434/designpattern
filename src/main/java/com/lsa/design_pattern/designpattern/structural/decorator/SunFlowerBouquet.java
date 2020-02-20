package com.lsa.design_pattern.designpattern.structural.decorator;

public class SunFlowerBouquet extends FlowerBouquet {
    public SunFlowerBouquet() {
        super("Sun Flower bouquet");
    }

    @Override
    public double cost() {
        return 1.3;
    }
}
