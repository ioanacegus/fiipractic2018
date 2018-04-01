package com.fiipractic.health.boundry.exceptions;

public class BadRequestException extends HealthGenericException{
    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
