package com.udemy.java.design.patterns.main.patterns.creational.abs.factory;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.factories.ResourceFactory;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance.Instance;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.Storage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Client {

    private final ResourceFactory factory;

    public Instance createServer(Instance.Capacity capacity, int storageMib) {
        Storage storage = factory.createStorage(storageMib);
        Instance instance = factory.createInstance(capacity);
        instance.attach(storage);
        return instance;
    }
}
