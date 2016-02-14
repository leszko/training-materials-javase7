package com.luxoft.java7se.exercise7.task3;

public class Main {
    public static void main(String[] args) {
        int n = 50;
        iteration(n);
        fold(n);
        avgArray(n);
    }

    private static void iteration(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    private static void fold(int n) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println("The number is " + i + "-fold");
            }
        }
    }

    private static void avgArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        System.out.println(avg(array));
    }

    private static int avg(int[] array) {
        int counter = 0;
        int sum = 0;
        for (int n : array) {
            counter++;
            sum += n;
        }

        return sum / counter;
    }
}
