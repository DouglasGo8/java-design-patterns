package com.udemy.java.design.patterns.main.patterns.creational.singleton;

public class EagerRegistry {

    /**
     * private constructor
     */
    private EagerRegistry() {
        //
    }

    private static final EagerRegistry INSTANCE = new EagerRegistry();

    public static  EagerRegistry getInstance() {
        return INSTANCE;

    }
}
