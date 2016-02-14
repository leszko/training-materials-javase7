package com.luxoft.java7se.exercise7.task1;

import org.apache.commons.lang.math.NumberUtils;

import java.util.Arrays;

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
        if (!NumberUtils.isNumber(args[0])) {
            throw new IllegalArgumentException("First argument is not numeric");
        }
        if (!asList("+", "-", "/", "*").contains(args[1])) {
            throw new IllegalArgumentException("Second argument is not +, -, / or *");
        }
        if (!NumberUtils.isNumber(args[2])) {
            throw new IllegalArgumentException("Third argument is not numeric");
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
