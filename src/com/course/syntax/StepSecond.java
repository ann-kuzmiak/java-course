package com.course.syntax;

public class StepSecond {
    private double b;
    private double c;
    private double a;

    public StepSecond(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double countSquare() {
        double result;
        double p = (a + b + c) / 2;
        result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result;
    }

    public static void task2() {
        int a = 4;
        System.out.println("a = " + a);
        System.out.println("a++ = " + a++);
        System.out.println("++a = " + ++a);
        System.out.println("a-- = " + a--);
        System.out.println("--a = " + --a);
    }
}
