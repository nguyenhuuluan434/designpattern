package com.lsa.design_pattern.designpattern.creational.prototype;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(Rectangle target) {
        super(target);
        if (Objects.nonNull(target)) {
            this.height = target.getHeight();
            this.width = target.getWidth();
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Builder
    public Rectangle(String color, String type, int width, int height) {
        super(color, type);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + super.getColor() +
                ", type=" + super.getType() +
                '}';
    }
}
