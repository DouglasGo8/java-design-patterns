package com.udemy.java.design.patterns.main.patterns.behavioral.command;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ACAutRemote {

  final ICommandAC command;

  void buttonPressed() {
    this.command.execute();
  }
}
