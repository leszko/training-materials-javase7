package com.luxoft.java7se.exercise7.task1;

import static java.util.Arrays.asList;

public class Calc {
    public static void main(String[] args) {
        validate(args);

        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[2]);
        String operator = args[1];

        System.out.println(perform(a, b, operator));
    }

    private static void validate(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("3 arguments should be given");
        }
        if (!asList("+", "-", "/", "*").contains(args[1])) {
            throw new IllegalArgumentException("Second argument is not +, -, / or *");
        }
    }


    private static Double perform(Double a, Double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
            default:
                throw new RuntimeException("Unknown error");
        }
    }
}
