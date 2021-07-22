package com.udemy.java.design.patterns.main.patterns.behavioral.mediator;

public interface Mediator {
  void sendMessage(String message, User user);
  void registerUser(User user);
}
