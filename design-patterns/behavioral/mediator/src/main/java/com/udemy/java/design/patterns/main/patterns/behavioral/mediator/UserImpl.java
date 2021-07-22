package com.udemy.java.design.patterns.main.patterns.behavioral.mediator;

public class UserImpl extends User {

  public UserImpl(Mediator med, String name) {
    super(med, name);
  }

  @Override
  void send(String message) {
    mediator.sendMessage(message, this);
  }

  @Override
  void receive(String message) {
    System.out.println("Receive message is : " + message);
  }
}
