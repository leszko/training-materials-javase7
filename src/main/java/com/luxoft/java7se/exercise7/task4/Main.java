package com.luxoft.java7se.exercise7.task4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = createArray();

        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(3, 0);
        counter.put(7, 0);
        counter.put(9, 0);

        for (int n : array) {
            counter.put(n, counter.get(n) + 1);
        }

        System.out.println("number of 3: " + counter.get(3));
        System.out.println("number of 7: " + counter.get(7));
        System.out.println("number of 9: " + counter.get(9));
    }

    private static int[] createArray() {
        return new int[]{3, 3, 7, 9, 7, 3, 3, 3, 7, 7};
    }
}
