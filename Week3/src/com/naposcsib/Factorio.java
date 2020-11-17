package com.naposcsib;

import java.util.Scanner;
import java.util.Scanner;
public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot!");
        int userNumber = scanner.nextInt();
        System.out.println(userNumber + " faktoriálisa:");
        System.out.println(factorio(userNumber));

    }
public static int factorio (int number) {

        int a = 1;
        for (int i = 1; i <= number; i++) {
            a *= i;
        }
        return a;
}
}
