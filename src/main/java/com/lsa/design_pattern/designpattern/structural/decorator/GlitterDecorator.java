package com.lsa.design_pattern.designpattern.structural.decorator;

public class GlitterDecorator extends FlowerBouquetDecorator {

    public GlitterDecorator(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return this.getFlowerBouquet().getDescription() + " Glitter";
    }

    @Override
    public double cost() {
        return this.getFlowerBouquet().cost() + 0.3;
    }
}
