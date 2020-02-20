package com.lsa.design_pattern.designpattern.behavior.abstractFactory.factory;

import com.lsa.design_pattern.designpattern.behavior.abstractFactory.Cheese;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.MozzarellaCheese;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.Sauce;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.TomatoSauce;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.factory.BaseToppingFactory;

public class SicilianToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
