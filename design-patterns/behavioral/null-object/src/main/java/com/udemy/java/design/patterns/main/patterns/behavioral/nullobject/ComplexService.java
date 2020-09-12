package com.udemy.java.design.patterns.main.patterns.behavioral.nullobject;

public class ComplexService {

    private String reportName;
    private StorageService storage;

    public ComplexService(StorageService storage) {
        this.storage = storage;
        reportName = "Complex Report";
    }

    public ComplexService(StorageService storage, String reportName) {
        this.storage = storage;
        this.reportName = reportName;
    }

    public void generateReport() {
        System.out.println("Start a complex operation");
    }
}
