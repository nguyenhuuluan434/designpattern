package com.lsa.design_pattern.designpattern.decorator;

public abstract class FlowerBouquetDecorator extends FlowerBouquet {

    protected FlowerBouquet flowerBouquet;

    public FlowerBouquetDecorator(FlowerBouquet flowerBouquet) {
        super("");
        this.flowerBouquet = flowerBouquet;
    }

    protected FlowerBouquet getFlowerBouquet() {
        return this.flowerBouquet;
    }

    public abstract String getDescription();
}
