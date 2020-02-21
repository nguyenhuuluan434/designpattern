package com.lsa.design_pattern.designpattern.creational;

import com.lsa.design_pattern.designpattern.creational.prototype.Circle;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    public void testPrototype(){
        Circle red = Circle.builder().color("red").radius(10).type("circle").build();

        Circle blue = (Circle) red.clone();
        blue.setColor("blue");
        System.out.println(red.toString());
        System.out.println(blue.toString());
    }
}
