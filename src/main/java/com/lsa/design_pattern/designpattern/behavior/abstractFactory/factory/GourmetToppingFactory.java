package com.lsa.design_pattern.designpattern.behavior.abstractFactory.factory;

import com.lsa.design_pattern.designpattern.behavior.abstractFactory.CaliforniaOilSauce;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.Cheese;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.GoatCheese;
import com.lsa.design_pattern.designpattern.behavior.abstractFactory.Sauce;

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
