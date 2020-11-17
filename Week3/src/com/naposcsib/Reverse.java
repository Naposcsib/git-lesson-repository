package com.naposcsib;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        numbers[0] = 4;
        numbers[1] = 5;
        numbers[2] = 6;
        numbers[3] = 7;

        int[] swap = new int[4];

        for (int i = 0; i < numbers.length; i++){
            swap[i] = numbers[i];
            }
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = swap[numbers.length - 1 - j];
                System.out.println(numbers[j]);
            }
        }
    }
