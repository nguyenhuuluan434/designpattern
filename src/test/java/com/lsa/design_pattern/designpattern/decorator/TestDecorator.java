package com.lsa.design_pattern.designpattern.decorator;

import org.junit.jupiter.api.Test;

public class TestDecorator {

    @Test
    public void TestDecorator(){
        RoseBouquet roseBouquet = new RoseBouquet();
        System.out.println(roseBouquet.getDescription()
                + " $ " + roseBouquet.cost());

        FlowerBouquet roseWithDecorator = new RoseBouquet();
        roseWithDecorator = new GlitterDecorator(roseWithDecorator);
        roseWithDecorator = new PapperWrapperDecorator(roseWithDecorator);

        System.out.println(roseWithDecorator.getDescription()
                + " $ " + roseWithDecorator.cost());
    }
}
