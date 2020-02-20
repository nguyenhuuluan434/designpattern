package com.lsa.design_pattern.designpattern.decorator;

public class OrchidBouquet extends FlowerBouquet {
    public OrchidBouquet() {
        super("Orchid Bouquet");
    }

    @Override
    public double cost() {
        return 2;
    }
}
