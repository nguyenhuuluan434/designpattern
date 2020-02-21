package com.lsa.design_pattern.designpattern.creational.abstractFactory.factory;

import com.lsa.design_pattern.designpattern.creational.abstractFactory.usage.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
