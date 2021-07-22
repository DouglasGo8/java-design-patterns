package com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.Storage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GCPInstance implements Instance {

    private final Capacity capacity;

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped.");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started.");
    }

    @Override
    public void attach(Storage storage) {
        System.out.println("Compute engine instance stopped");
    }
}
