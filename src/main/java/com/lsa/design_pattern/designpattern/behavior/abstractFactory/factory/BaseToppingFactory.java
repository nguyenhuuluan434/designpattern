package com.lsa.design_pattern.designpattern.behavior.abstractFactory.factory;

import com.lsa.design_pattern.designpattern.behavior.abstractFactory.Cheese;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
