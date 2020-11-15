package com.naposcsib;

public class LengthComparsion {
    public static void main(String[] args) {

        int[] firstArrayOfNumbers = new int[3];
        firstArrayOfNumbers[0] = 1;
        firstArrayOfNumbers[1] = 2;
        firstArrayOfNumbers[2] = 3;

        int[] secondArrayOfNumbers = new int[2];
        secondArrayOfNumbers[0] = 4;
        secondArrayOfNumbers[1] = 5;
        if (secondArrayOfNumbers.length > firstArrayOfNumbers.length) {
            System.out.println("A secondArrayOfNumbers hosszabb");
        } else {
            System.out.println("A firstArrayOfNumbers hosszabb");
        }


    }
}