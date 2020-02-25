package com.lsa.design_pattern.designpattern.creational.singleton;

public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton INSTANCE;

    public static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
