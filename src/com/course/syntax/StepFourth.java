package com.course.syntax;

import java.util.Scanner;

public class StepFourth {
    public static void task1() {
        System.out.println("Enter int number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("An error occurred. Number is negative");
        } else if (number % 3 == 0) {
            System.out.println("The number multiple to 3");
        } else if (number % 2 == 0) {
            System.out.println("The number is even");
        }
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static int divisor(int n) {
        int i = n - 1;
        for (; i >= 1; i--) {
            if (n % i == 0) {
                break;
            }
        }
        return i;
    }

    public static void getAge() {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = false;
        int age;
        while (!isCorrect) {
            System.out.println("Enter age");
            age = scanner.nextInt();
            if (age <= 0 || age > 140) {
                System.out.println("Incorrect value provided");
                continue;
            } else {
                System.out.println("Success! Valid age is saved");
                isCorrect = true;
            }
        }
    }
}
