package com.lsa.design_pattern.designpattern.creational.abstractFactory.factory;

import com.lsa.design_pattern.designpattern.creational.abstractFactory.CaliforniaOilSauce;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.Cheese;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.GoatCheese;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
