package com.luxoft.java7se.exercise4;

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        int n = 1024 * 1024;
        Thread.sleep(30000);
        MessagePrinter[] messagePrinters = new MessagePrinter[n];
        for (int i = 0; i < n; i++) {
            messagePrinters[i] = new MessagePrinter();
        }
        Thread.sleep(30000);
    }
}
