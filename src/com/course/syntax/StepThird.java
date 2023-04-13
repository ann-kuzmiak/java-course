package com.course.syntax;

import java.util.Scanner;

public class StepThird {
    public static void task1() {
        System.out.println("Enter int");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input < 10) {
            System.out.println("Value is less than 10");
        } else if (input > 10) {
            System.out.println("Value is more than 10");
        } else if (input == 10) {
            System.out.println("Value is 10");
        }
    }

    public static void task2() {
        System.out.println("Enter double");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        if (input % 2 == 0) {
            System.out.println("value is even");
        } else {
            System.out.println("value is odd");
        }
    }

    public static void task3() {
        System.out.println("Enter float");
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();
        if (input % 2 == 0 && input > 10 || input == 15) {
            System.out.println("this value is divisible without remainder by 2 and larger than 10 or if value equals 15");
        } else
            System.out.println("this is false: this value is divisible without remainder by 2 and larger than 10 or if value equals 15");
    }
}
