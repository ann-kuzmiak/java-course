package com.course.OOP.exceptions;

public class InvalidCardTypeException extends Throwable {
    static String message = "Invalid card type provided";

    public InvalidCardTypeException() {
        super(message);
    }
}
