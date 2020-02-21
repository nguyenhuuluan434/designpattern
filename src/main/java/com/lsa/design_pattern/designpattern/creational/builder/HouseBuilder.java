package com.lsa.design_pattern.designpattern.creational.builder;

public interface HouseBuilder {
    HouseBuilder buildFoundation(String foundation);

    HouseBuilder buildStructure(String structure);

    HouseBuilder buildRoof(String roof);

    HouseBuilder paintHouse(boolean isPaint);

    HouseBuilder furnishHouse(Boolean isPainted);

    House build();
}
