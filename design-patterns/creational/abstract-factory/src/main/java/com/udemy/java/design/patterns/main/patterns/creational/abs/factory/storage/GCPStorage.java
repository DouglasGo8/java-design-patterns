package com.udemy.java.design.patterns.main.patterns.creational.abs.factory.storage;

public class GCPStorage implements Storage {

    public GCPStorage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib +  " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "gcpcs1";
    }

    @Override
    public String toString() {
        return "Google Cloud Storage";
    }
}
