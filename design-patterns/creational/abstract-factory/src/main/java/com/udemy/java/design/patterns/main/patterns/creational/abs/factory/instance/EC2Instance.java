package com.udemy.java.design.patterns.main.patterns.creational.abs.factory.instance;

import com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage.Storage;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EC2Instance implements Instance {

    private final Capacity capacity;

    @Override
    public void stop() {
        System.out.println("EC2Instance stopped");
    }

    @Override
    public void start() {
        System.out.println("EC2Instance started");
    }

    @Override
    public void attach(Storage storage) {
        System.out.println("Attached " + storage + " to EC2Instance");
    }

    @Override
    public String toString() {
        return "EC2Instance";
    }
}
