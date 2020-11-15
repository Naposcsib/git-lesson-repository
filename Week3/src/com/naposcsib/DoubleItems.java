package com.naposcsib;

import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = new int[5];
        numList[0] = 3;
        numList[1] = 4;
        numList[2] = 5;
        numList[3] = 6;
        numList[4] = 7;

        for (int i = 0; i < numList.length; i++){
            numList[i] += numList[i];
        }
        System.out.println(Arrays.toString(numList));

    }
}