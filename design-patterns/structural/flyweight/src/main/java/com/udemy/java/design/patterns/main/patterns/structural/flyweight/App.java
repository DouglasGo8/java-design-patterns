package com.udemy.java.design.patterns.main.patterns.structural.flyweight;

public class App {

    public static void main(String... args) {
        var msg1 = ErrorMessageFactory.getInstance().getError(ErrorMessageFactory.ErrorType.GenericSystemError);
        System.out.println(msg1.getText("4056"));
        //
        var msg2 =  ErrorMessageFactory.getInstance().getUserBannedErrorMessage("1202");
        System.out.println(msg2.getText(null));
    }
}
