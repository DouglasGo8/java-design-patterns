package com.udemy.java.design.patterns.main.patterns.behavioral.template.method;

public abstract class ProcessOrder {

  abstract void selectProduct();
  abstract void makePayment();
  abstract void deliver();

  final void doShop() {
    this.selectProduct();;
    this.makePayment();
    this.deliver();
  }
}
