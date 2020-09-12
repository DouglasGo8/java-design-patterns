package com.udemy.java.design.patterns.main.patterns.behavioral.nullobject;

public class App {

    public static void main(String... args) {
        var complexSvc = new ComplexService(new StorageService(), "XPTO");

        complexSvc.generateReport();
    }
}
