package com.course.syntax;

public class StepFifth {
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
        double largest = -Double.MIN_VALUE;
        for (double n : numbers) {
            if (largest < n) {
                largest = n;
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
}
