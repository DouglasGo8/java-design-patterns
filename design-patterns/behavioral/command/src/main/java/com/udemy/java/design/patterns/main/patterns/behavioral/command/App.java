package com.udemy.java.design.patterns.main.patterns.behavioral.command;

import lombok.SneakyThrows;

import java.util.concurrent.TimeUnit;

public class App {

    @SneakyThrows
    public static void main(String... args) {

        var ews = new EWSService();
        var cmd1 = new AddMemberCommand("spam", "a@mail.com", ews);
        //
        var task = MailTaskRunner.getInstance();
        task.addCommand(cmd1);

        var cmd2 = new AddMemberCommand("spam", "b@mail.com", ews);
        task.addCommand(cmd2);

        TimeUnit.SECONDS.sleep(3);

        task.shutdown();
    }
}
