package com.naposcsib;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be 5 egész számot!");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int osszeg = number1 + number2 + number3 + number4 + number5;
        double atlag = osszeg / 5.;
        System.out.print("Összeg: ");
        System.out.print(osszeg);
        System.out.print(",");
        System.out.print("Átlag: ");
        System.out.println(atlag);

    }
}
