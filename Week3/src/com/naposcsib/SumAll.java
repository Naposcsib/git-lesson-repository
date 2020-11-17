package com.naposcsib;

public class SumAll {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 3;
        numbers[1] = 4;
        numbers[2] = 5;
        numbers[3] = 6;
        numbers[4] = 7;

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            if (i == numbers.length -1) {

                System.out.println("A tömb elemeinek összege: " + sum);
            }
        }
    }
}
