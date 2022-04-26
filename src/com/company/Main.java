package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println(method(1, 300));
    }
    public static int method(int beginning, int ending) {
        int counter = 0;
        for (; beginning < ending; beginning++) {
            if (beginning % 3 == 0 && beginning % 4 == 0 && beginning % 5 == 0) {
                counter += beginning;
            }
        }
        return counter;
    }
}
