package com.udemy.java.design.patterns.main.patterns.creational.abs.factory.factories;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance.Instance;
import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.Storage;

public interface ResourceFactory {

    Storage createStorage(int capMib);

    Instance createInstance(Instance.Capacity capacity);

}
