package com.udemy.java.design.patterns.main.patterns.behavioral.mediator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class User {

  protected final Mediator mediator;
  protected final String name;


  abstract void send(String message);
  abstract void receive(String message);


}
