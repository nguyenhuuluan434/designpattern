package com.lsa.design_pattern.designpattern.creational.builder;

public class ConcreteHouseBuilder implements HouseBuilder {
    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder buildFoundation(String foundation) {
        this.house.setFoundation(foundation);
        return this;
    }

    @Override
    public HouseBuilder buildStructure(String structure) {
        this.house.setStructure(structure);
        return this;
    }

    @Override
    public HouseBuilder buildRoof(String roof) {
        this.house.setRoof(roof);
        return this;
    }

    @Override
    public HouseBuilder paintHouse(boolean isPaint) {
        this.house.setPainted(isPaint);
        return this;
    }

    @Override
    public HouseBuilder furnishHouse(Boolean isPainted) {
        this.house.setPainted(isPainted);
        return this;
    }

    @Override
    public House build() {
        return this.house;
    }
}
