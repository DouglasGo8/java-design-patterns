package com.udemy.java.design.patterns.main.patterns.creational.abs.factory.google;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.factories.ResourceFactory;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance.GoogleComputeEngineInstance;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance.Instance;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.GoogleCloudStorage;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.Storage;

public class GoogleResourceFactory implements ResourceFactory {

    @Override
    public Storage createStorage(int capMib) {
        return new GoogleCloudStorage(capMib);
    }

    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new GoogleComputeEngineInstance(capacity);
    }
}
