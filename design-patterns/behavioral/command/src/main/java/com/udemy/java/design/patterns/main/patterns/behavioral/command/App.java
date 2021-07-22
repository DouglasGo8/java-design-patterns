package com.udemy.java.design.patterns.main.patterns.behavioral.command;

public class App {


  public static void main(String... args) {

    var ac = new AC();
    var start = new StartACCommand(ac);
    var stop = new StopACCommand(ac);

    var startCmd = new ACAutRemote(start);
    var stopCmd = new ACAutRemote(stop);

    startCmd.buttonPressed();
    stopCmd.buttonPressed();
  }
}
