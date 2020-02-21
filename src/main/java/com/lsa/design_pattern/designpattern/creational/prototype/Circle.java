package com.lsa.design_pattern.designpattern.creational.prototype;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {

    private int radius;

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Builder
    public Circle(String color, String type, int radius) {
        super(color, type);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "color=" + super.getColor() +
                "type=" + super.getType() +
                '}';
    }
}
