package com.fiipractic.health.boundry.exceptions;

public class NotFoundException extends HealthGenericException {
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
