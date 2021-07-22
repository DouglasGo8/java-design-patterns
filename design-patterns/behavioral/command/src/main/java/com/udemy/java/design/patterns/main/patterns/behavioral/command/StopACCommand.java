package com.udemy.java.design.patterns.main.patterns.behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StopACCommand implements ICommandAC {

  final AC ac;

  @Override
  public void execute() {
    System.out.println("Turning on the AC");
    ac.turnOff();
  }
}
