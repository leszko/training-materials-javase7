package com.luxoft.java7se.exercise7.task6;

public class Main {
    public static void main(String[] args) {
        String input = createSampleInput();
        System.out.println();
        System.out.println("First solution:");
        System.out.println(removeComments(input));
        System.out.println();
        System.out.println("Second solution:");
        System.out.println(removeCommentsSmart(input));

    }

    private static String removeComments(String input) {
        StringBuilder result = new StringBuilder();
        State state = State.NO_COMMENT;
        for (int i = 0; i < input.length(); i++) {
            if (state == State.NO_COMMENT) {
                if (input.charAt(i) == '/' && i + 1 < input.length() && input.charAt(i + 1) == '*') {
                    state = State.BLOCK_COMMENT;
                    i++;
                } else if (input.charAt(i) == '/' && i + 1 < input.length() && input.charAt(i + 1) == '/') {
                    state = State.LINE_COMMENT;
                    i++;
                } else {
                    result.append(input.charAt(i));
                }
            } else if (state == State.BLOCK_COMMENT) {
                if (input.charAt(i) == '*' && i + 1 < input.length() && input.charAt(i + 1) == '/') {
                    state = State.NO_COMMENT;
                    i++;
                }
            } else if (state == State.LINE_COMMENT) {
                if (input.charAt(i) == '\n') {
                    state = State.NO_COMMENT;
                    result.append(input.charAt(i));
                }
            }
        }
        return result.toString();
    }

    private static String removeCommentsSmart(String input) {
        String result = input.replaceAll("//.*?\n", "");
        return result.replaceAll("/\\*(.|\n)*?\\*/", "");
    }

    private static String createSampleInput() {
        return "/* It's a comment, remove */ something // another comment\n" +
                "// another comment\n" +
                "/** multi line\n" +
                "comment, all should be\n" +
                "removed */ I should be visible // another comment\n" +
                "something visible\n";
    }

    private static enum State {
        BLOCK_COMMENT, LINE_COMMENT, NO_COMMENT;
    }
}
