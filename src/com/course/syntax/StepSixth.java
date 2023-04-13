package com.course.syntax;

import java.util.Scanner;

public class StepSixth {
    public static void main(String[] args) {
        String s = "Test java sentence task 1";
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
                if (i % 2 == 0) {
                    System.out.println(words[i].replace(words[i].substring(0, 1), words[i].substring(0, 1).toUpperCase()));
                } else System.out.println(words[i]);
            }
        }
    }

    public static int task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sentence");
        String sentence = scanner.nextLine();
        System.out.println("enter a symbol");
        char symbol = scanner.next().charAt(0);

        int counter = 0;
        for (char c : sentence.toCharArray()) {
            if (c == symbol)
                counter++;
        }
        return counter;
    }
}

