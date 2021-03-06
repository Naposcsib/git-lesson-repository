package com.naposcsib;
import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hány szám átlagát szeretnéd kiszámítani?");
        int numberOfNumbers = scanner.nextInt();
        System.out.println("Írj be " + numberOfNumbers + " egész számot!");

        float collector = 0;

        for (int i = 1; i <= numberOfNumbers; i++) {
            System.out.println("Szám " + i + " :");
            float number = scanner.nextFloat();
            collector += number;

            System.out.print("Összeg: ");
            System.out.println(collector + " ");

            if (i == numberOfNumbers) {
                System.out.print("Átlag: ");
                System.out.println(collector / numberOfNumbers);
            }

        }
    }
}