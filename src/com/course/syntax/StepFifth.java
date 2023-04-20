package com.course.syntax;

public class StepFifth {
    public static void main(String[] args) {
        System.out.println("Step Fourth");
        double[] numbers = new double[]{27.5, 16.3, 16.2, 2.1415, 35.0};
        int[] ar1 = new int[]{7, 2, 2, 0, -1};
        int[] ar2 = new int[]{90, 91, -7, 4};
        System.out.println("average is " + StepFifth.getAverage(numbers));
        System.out.println("biggest is " + StepFifth.getBiggest(numbers));
        System.out.println("sorted array ");
        printAr(StepFifth.sortArray(numbers));
        System.out.println("merged array ");
        printAr(StepFifth.mergeArrays(ar1, ar2));
    }

    public static double getAverage(double[] numbers) {
        double sum = 0;
        for (double n : numbers) {
            sum += n;
        }
        return sum / numbers.length;
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int totalLength = array1.length + array2.length;
        int[] result = new int[totalLength];
        for (int i = 0; i < totalLength; i++) {
            if (i < array1.length) {
                result[i] = array1[i];
            } else {
                result[i] = array2[i - array1.length];
            }
        }
        return result;
    }

    public static double getBiggest(double[] numbers) {
        double largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static double[] sortArray(double[] ar) {
        double temp;
        for (int i = 1; i < ar.length; i++) {
            for (int j = i; j < ar.length; j++) {
                if (ar[i - 1] > ar[j]) {
                    temp = ar[i - 1];
                    ar[i - 1] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        return ar;
    }

    public static void printAr(double[] ar) {
        for (double el : ar) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

    public static void printAr(int[] ar) {
        for (int el : ar) {
            System.out.print(el + " ");
        }
        System.out.println("");
    }

}
