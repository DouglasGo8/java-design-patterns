package com.udemy.java.design.patterns.main.patterns.behavioral.nullobject;

public class NullStorageService extends StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Null object");
    }
}
