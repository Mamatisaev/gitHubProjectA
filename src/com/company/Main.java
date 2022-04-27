package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println("Sum: " + method(1, 300));
    }
    public static int method(int a, int b) {
        int i = 0;
        for (; a < b; a++) {
            if (a % 3 == 0 && a % 4 == 0 && a % 5 == 0) {
            i += a;
            }
        }
        return i;
    }
}
