package com.lsa.design_pattern.designpattern.behavior.abstractFactory.factory;

import com.lsa.design_pattern.designpattern.behavior.abstractFactory.usage.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
