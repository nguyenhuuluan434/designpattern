package com.lsa.design_pattern.designpattern.creational.singleton;

public class EagerSingleton {
    private EagerSingleton() {
    }

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    public static final EagerSingleton getInstance() {
        return INSTANCE;
    }
}
