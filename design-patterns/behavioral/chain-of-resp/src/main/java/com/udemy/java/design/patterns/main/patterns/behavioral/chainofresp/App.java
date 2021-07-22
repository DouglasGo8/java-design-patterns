package com.udemy.java.design.patterns.main.patterns.behavioral.chainofresp;

public class App {

  public static void main(String... args) {


    var interest = 15_933L;
    var loan = new Loan(interest);

    var m = new Manager();
    var d = new Director();
    var p = new President();

    // Chain of Resp
    m.setNext(d);
    d.setNext(p);

    //
    m.approveLoan(loan);

  }
}
