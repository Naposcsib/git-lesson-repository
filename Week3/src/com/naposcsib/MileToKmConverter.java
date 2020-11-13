package com.naposcsib;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {

        System.out.println("Írd be a mérföldet!");

        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextInt();

        System.out.println(1.61 * userInput + " kilométer");


    }
}
