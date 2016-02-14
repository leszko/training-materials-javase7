package com.luxoft.java7se.exercise7.task5;

public class TextModifier {
    public static void main(String[] args) {
        String input = args[0];

        System.out.println(modify(input));
    }

    private static String modify(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (Character.isDigit(c)) {
                continue;
            }
            if (c == '+' || c == '-') {
                stringBuilder.append(c);
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
