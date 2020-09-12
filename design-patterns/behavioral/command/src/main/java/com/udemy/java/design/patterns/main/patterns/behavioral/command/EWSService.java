package com.udemy.java.design.patterns.main.patterns.behavioral.command;

public class EWSService {

    public void addMember(String contact, String contactGroup) {
        System.out.println("Added ".concat(contact).concat(" to ").concat(contact));
    }

    public void removeMember(String contact, String contactGroup) {
        System.out.println("Removed ".concat(contact).concat(" to ").concat(contact));
    }
}
