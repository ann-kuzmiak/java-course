package com.course.additionalSyntax;

public class Child extends Parent{
    protected static double testFieldStatic;
    protected double testField;

    static {
        testFieldStatic = 3.14;
        System.out.println("Static init block in child");
    }
    {
        testField = 4.19;
        System.out.println("Init block in child");
    }
}
