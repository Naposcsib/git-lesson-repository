package com.naposcsib;
import  java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A lányok száma");
        int number1 = scanner.nextInt();
        System.out.println("A fiúk száma");
        int number2 = scanner.nextInt();

        if (number1 + number2 >= 20) {
            if (number1 == number2) {
                System.out.println("Ez a buli kitűnő");
            } else {
                System.out.println("Ez a buli egész jó");
            }
        } else {
            System.out.println("Átlagos buli...");
        }
        if (number1 == 0) {
            System.out.println("Virsli party");
        }
    }
}
