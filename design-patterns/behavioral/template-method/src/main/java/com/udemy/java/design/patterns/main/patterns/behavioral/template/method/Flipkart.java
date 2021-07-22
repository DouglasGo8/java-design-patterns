package com.udemy.java.design.patterns.main.patterns.behavioral.template.method;

public class Flipkart extends ProcessOrder {
  @Override
  void selectProduct() {
    System.out.println("Product Selected");
  }

  @Override
  void makePayment() {
    System.out.println("Payment submitted");
  }

  @Override
  void deliver() {
    System.out.println("Order shipped");
  }
}
