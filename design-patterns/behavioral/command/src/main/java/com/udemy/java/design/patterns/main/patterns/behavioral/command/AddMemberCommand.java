package com.udemy.java.design.patterns.main.patterns.behavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddMemberCommand implements Command {
    //
    private final String listName;
    private final String emailAddress;
    //
    private final EWSService service;
    //
    @Override
    public void execute() {
        service.addMember(this.emailAddress, this.listName);
    }

}
