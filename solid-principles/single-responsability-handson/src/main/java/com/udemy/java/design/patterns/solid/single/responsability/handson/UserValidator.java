package com.udemy.java.design.patterns.solid.single.responsability.handson;

public class UserValidator {

    public boolean validateUser(User user) {
        return isValidUserPojo(user);
    }

    private boolean isValidUserPojo(User user) {
        return true;
    }

    private boolean isPresent(String value) {
        return true;
    }

    private boolean isValidAlphaNumber(String value) {
        return true;
    }
}
