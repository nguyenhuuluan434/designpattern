package com.lsa.design_pattern.designpattern.creational.abstractFactory.factory;

import com.lsa.design_pattern.designpattern.creational.abstractFactory.Cheese;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.MozzarellaCheese;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.Sauce;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.TomatoSauce;

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
