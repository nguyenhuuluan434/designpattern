package com.lsa.design_pattern.designpattern.creational;

import com.lsa.design_pattern.designpattern.creational.builder.ConcreteHouseBuilder;
import com.lsa.design_pattern.designpattern.creational.builder.House;
import com.lsa.design_pattern.designpattern.creational.builder.HouseBuilder;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    public void testBuilder() {
        HouseBuilder builder = new ConcreteHouseBuilder();
        builder.buildFoundation("lsa").buildRoof("tone").buildStructure("2 floors").furnishHouse(false).paintHouse(true);
        House house = builder.build();
        System.out.println(house.toString());
    }
}
