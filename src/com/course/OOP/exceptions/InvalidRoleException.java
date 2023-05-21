package com.course.OOP.exceptions;

public class InvalidRoleException extends Throwable {

    static String message = "Invalid role provided";
    public InvalidRoleException() {
        super(message);
    }
}
