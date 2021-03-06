package com.lsa.design_pattern.designpattern.structural.decorator;

public class RoseBouquet extends FlowerBouquet {
    public RoseBouquet() {
        super("Rose Bouquet");
    }

    @Override
    public double cost() {
        return 1;
    }
}
