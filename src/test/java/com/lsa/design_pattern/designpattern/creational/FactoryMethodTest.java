package com.lsa.design_pattern.designpattern.creational;

import com.lsa.design_pattern.designpattern.creational.factoryMethod.BasePizzaFactory;
import com.lsa.design_pattern.designpattern.creational.factoryMethod.Pizza;
import com.lsa.design_pattern.designpattern.creational.factoryMethod.PizzaFactory;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    public void testCreatePizza() {
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
    }
}
