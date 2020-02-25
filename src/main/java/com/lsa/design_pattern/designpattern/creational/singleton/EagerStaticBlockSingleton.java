package com.lsa.design_pattern.designpattern.creational.singleton;

public class EagerStaticBlockSingleton {

    private EagerStaticBlockSingleton() {
    }

    private static final EagerStaticBlockSingleton INSTANCE;

    static {
        try {
            INSTANCE = new EagerStaticBlockSingleton();
        } catch (Throwable t) {
            throw t;
        }
    }

    public static EagerStaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
