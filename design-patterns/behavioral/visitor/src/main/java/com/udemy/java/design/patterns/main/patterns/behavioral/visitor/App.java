package com.udemy.java.design.patterns.main.patterns.behavioral.visitor;

public class App {


  public static void main(String... args) {

    var emp = new Employee("Douglas");
    var ceo = new CEO("Zuuroopa");

    emp.accept(ceo);

  }


}
