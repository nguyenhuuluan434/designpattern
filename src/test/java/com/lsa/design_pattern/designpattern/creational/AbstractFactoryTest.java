package com.lsa.design_pattern.designpattern.creational;

import com.lsa.design_pattern.designpattern.creational.abstractFactory.factory.BasePizzaFactory;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.factory.GourmetPizzaFactory;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.factory.SicilianPizzaFactory;
import com.lsa.design_pattern.designpattern.creational.abstractFactory.usage.Pizza;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    public void testAbstractFactoryCreateGourmetPizza() {
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }

    @Test
    public void testAbstractFactoryCreateSicilianPizza() throws Exception {
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperoniPizza = pizzaFactory.createPizza("pepperoni");
    }
}
