package com.course.additionalSyntax;

public class Parent {
    protected static double testFieldStatic;
    protected double testField;

    static {
        testFieldStatic = 3.14;
        System.out.println("Static init block in parent");
    }
    {
        testField = 4.19;
        System.out.println("Init block in parent");
    }

}
