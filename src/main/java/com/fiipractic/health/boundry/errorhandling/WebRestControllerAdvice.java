package com.fiipractic.health.boundry.errorhandling;

import com.fiipractic.health.boundry.exceptions.BadRequestException;
import com.fiipractic.health.boundry.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebRestControllerAdvice {

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorDto handleNotFoundException(NotFoundException ex) {
        return this.generateErrorDto(HttpStatus.NOT_FOUND, ex);
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorDto handleBadRequestException(BadRequestException ex) {
        return this.generateErrorDto(HttpStatus.BAD_REQUEST, ex);
    }

    /**
     * Default handler for exceptions that may occur in the application.
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorDto defaultHandler(Exception ex) {
        return new ErrorDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
    }

    private ErrorDto generateErrorDto(HttpStatus status, Exception ex) {
        return new ErrorDto(status.value(), ex.getMessage());
    }
}
