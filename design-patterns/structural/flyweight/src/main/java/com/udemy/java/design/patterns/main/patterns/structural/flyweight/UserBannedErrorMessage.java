package com.udemy.java.design.patterns.main.patterns.structural.flyweight;

import lombok.RequiredArgsConstructor;

import java.time.Duration;

public class UserBannedErrorMessage implements ErrorMessage {

    private final String msg;
    private final String caseId;

    public UserBannedErrorMessage(String caseId) {
        this.caseId = caseId;
        final String remarks = "You violated terms of bla bla bla";
        final Duration banDuration = Duration.ofDays(2);
        this.msg = "You're WELCOME to HELL " + caseId + "\n" + remarks + " to " + banDuration.toHours() + " hours";
    }

    @Override
    public String getText(String code) {
        return msg;
    }

    public String getCaseNo() {
        return this.caseId;
    }
}
