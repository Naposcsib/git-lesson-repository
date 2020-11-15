package com.naposcsib;

import java.util.Arrays;

public class PrintAll {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 6;
        numbers[3] = 7;

        System.out.println("A tömb elemei: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("A tömb: ");
        System.out.println(Arrays.toString(numbers));
    }
}