package com.lsa.design_pattern.designpattern.creational.prototype;

import lombok.*;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class Shape {
    private String color;
    private String type;

    public Shape(Shape target) {
        if (Objects.nonNull(target)) {
            this.color = target.getColor();
            this.type = target.getType();
        }
    }

    public abstract Shape clone();
    public abstract String toString();
}
