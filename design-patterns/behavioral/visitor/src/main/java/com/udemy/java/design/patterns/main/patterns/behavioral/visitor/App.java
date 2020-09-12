package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

public class App {


    public static void main(String... args) {

        var employee = buildOrg();
        //
        var visitor = new PrintVisitor();
        //
        employee.accept(visitor);
        employee.getDirectReports().forEach(System.out::println);
    }


    private static Employee buildOrg() {
        var p1 = new Programmer("Rachel", "C++");
        var p2 = new Programmer("Andy", "Java");
        //
        var pl1 = new ProjectLead("Tina", p1, p2);
        //

        return new Manager("Chad", p1);
    }
}
