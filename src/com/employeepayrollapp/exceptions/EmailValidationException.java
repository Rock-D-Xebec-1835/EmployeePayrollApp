package com.employeepayrollapp.exceptions;

public class EmailValidationException extends ValidationException {

    public EmailValidationException(String message) {
        super(message);
    }
}