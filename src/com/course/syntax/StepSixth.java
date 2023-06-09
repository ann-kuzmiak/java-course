package com.course.syntax;

import java.util.Scanner;

public class StepSixth {
    public static void main(String[] args) {
        String s = "Test sentence task one more word";
        StepSixth.task1(s);
        StepSixth.task2(s);
        System.out.println(StepSixth.task3());
    }

    public static void task1(String s) {
        s = s.replaceAll(" ", "").toUpperCase();
        s.chars().forEach(x -> System.out.println((char) x));
    }

    public static void task2(String s) {
        if (s.contains("java")) {
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            System.out.println(sb.toString());
        } else {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                if ((i + 1) % 2 == 0) {
                    System.out.println(words[i].toUpperCase());
                } else {
                    System.out.println(words[i]);
                }
            }
        }
    }

    public static int task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = scanner.nextLine();

        System.out.println("enter a symbol");
        String symbol = scanner.nextLine();

        int counter = 0;
        for (char c : sentence.toCharArray()) {
            if (symbol.equals(String.valueOf(c))) {
                counter++;
            }
        }
        return counter;
    }
}

