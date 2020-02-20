package com.lsa.design_pattern.designpattern.structural.decorator;

import com.lsa.design_pattern.designpattern.structural.decorator.withLombok.RemovalDelegate;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDecoratorWithDelegate {

    @Test
    public void TestDelegateWithDelegate() {
        List<Integer> input = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        RemovalDelegate decoratorDelegate = new RemovalDelegate(input);
        decoratorDelegate.remove(2);
        decoratorDelegate.remove((Object) 2);
        decoratorDelegate.add(100);
    }
}
