package com.lsa.design_pattern.designpattern.structural.decorator;

public class PapperWrapperDecorator extends FlowerBouquetDecorator {
    public PapperWrapperDecorator(FlowerBouquet flowerBouquet) {
        super(flowerBouquet);
    }

    @Override
    public String getDescription() {
        return this.getFlowerBouquet().getDescription() + " Paper ";
    }

    @Override
    public double cost() {
        return this.getFlowerBouquet().cost() + 0.34;
    }
}
