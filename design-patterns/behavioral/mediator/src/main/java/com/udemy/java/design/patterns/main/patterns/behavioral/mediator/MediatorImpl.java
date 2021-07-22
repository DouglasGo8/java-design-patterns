package com.udemy.java.design.patterns.main.patterns.behavioral.mediator;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MediatorImpl implements Mediator {

  private final List<User> users;


  @Override
  public void sendMessage(String message, User user) {
    users.stream().filter(u -> u != user).forEach(u -> {
      u.receive(message);
    });
  }

  @Override
  public void registerUser(User user) {
    this.users.add(user);
  }
}
