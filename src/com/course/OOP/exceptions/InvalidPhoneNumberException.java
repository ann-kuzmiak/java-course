package com.course.OOP.exceptions;

public class InvalidPhoneNumberException extends Throwable {
    static String message = "Phone number is invalid, it must start with +";
    public InvalidPhoneNumberException() {
        super(message);
    }
}
