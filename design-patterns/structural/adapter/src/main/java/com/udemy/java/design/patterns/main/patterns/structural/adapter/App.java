package com.udemy.java.design.patterns.main.patterns.structural.adapter;

public class App {

    public static void main(String... args) {

        var adapter = new EmployeeClassAdapter();
        populateEmployeeData(adapter);

        var businessCard = new BusinessCardDesigner();
        var card =  businessCard.designCard(adapter);
        System.out.println(card);
        //
        var employee = new Employee();
        populateEmployeeData(employee);
        var objectAdapter = new EmployeeObjectAdapter(employee);
        card = businessCard.designCard(objectAdapter);
        System.out.println(card);


    }

    private static void populateEmployeeData(Employee employee) {
        employee.setFullName("Elliot Alderson");
        employee.setJobTitle("Security Engineer");
        employee.setOfficeLocation("Allsafe Cybersecurity, New York City, New York");
    }
}
