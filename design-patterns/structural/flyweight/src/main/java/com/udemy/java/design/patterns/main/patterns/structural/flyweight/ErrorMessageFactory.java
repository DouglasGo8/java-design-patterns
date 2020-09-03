package com.udemy.java.design.patterns.main.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ErrorMessageFactory {

    public enum ErrorType {GenericSystemError, PageNotFoundError, ServerError}

    private final Map<ErrorType, SystemErrorMessage> errorMessages = new HashMap<>();

    private static final ErrorMessageFactory FACTORY = new ErrorMessageFactory();

    public static ErrorMessageFactory getInstance() {
        return FACTORY;
    }

    private ErrorMessageFactory() {
        errorMessages.put(ErrorType.GenericSystemError,
                new SystemErrorMessage("http://google.com/q=",
                        "A generic error of type $errorCode occurred. Please refer to:\n"));
        //
        errorMessages.put(ErrorType.PageNotFoundError,
                new SystemErrorMessage("http://google.com/q=",
                        "Page not found. An error of type $errorCode occurred. Please refer to:\n"));


    }

    public SystemErrorMessage getError(ErrorType type) {
        return errorMessages.get(type);
    }

    public UserBannedErrorMessage getUserBannedErrorMessage(String caseId) {
        return new UserBannedErrorMessage(caseId);
    }
}
