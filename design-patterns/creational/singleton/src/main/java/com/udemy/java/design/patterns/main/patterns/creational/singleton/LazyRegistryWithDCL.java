package com.udemy.java.design.patterns.main.patterns.creational.singleton;

public class LazyRegistryWithDCL {

    private LazyRegistryWithDCL() {

    }

    // not caches this variable value
    private static volatile LazyRegistryWithDCL INSTANCE;

    /**
     * avoids threads conflict
     * @return LazyRegistryWithDCL
     */
    public static LazyRegistryWithDCL getInstance() {
        if (null == INSTANCE) {
            synchronized (LazyRegistryWithDCL.class) {
                if (null == INSTANCE) {
                    INSTANCE = new LazyRegistryWithDCL();
                }
            }
        }
        return INSTANCE;
    }

}
