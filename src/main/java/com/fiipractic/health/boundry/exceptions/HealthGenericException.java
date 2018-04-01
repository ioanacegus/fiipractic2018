package com.fiipractic.health.boundry.exceptions;

public class HealthGenericException extends Exception{

    public HealthGenericException(String message) {
        super(message);
    }

    public HealthGenericException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
