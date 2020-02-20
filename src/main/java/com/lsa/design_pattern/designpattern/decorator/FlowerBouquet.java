package com.lsa.design_pattern.designpattern.decorator;

public abstract class FlowerBouquet {

    protected String description;

    public String getDescription() {
        return this.description;
    }

    public FlowerBouquet(String description) {
        this.description = description;
    }

    public abstract double cost();
}
