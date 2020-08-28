package com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.Storage;

public interface Instance {

    enum Capacity {micro, small, large}

    void stop();
    void start();
    void attach(Storage storage);

}
