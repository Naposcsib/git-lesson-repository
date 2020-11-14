package com.naposcsib;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy egész számot!");
        int lineCount = scanner.nextInt();

        for (int a = 0; a < lineCount; a++) {
            for (int b = lineCount / 2 - a; b > 0; b--) {

                System.out.print(" ");
            }
            for (int d = a - lineCount / 2; d > 0; d--){
                System.out.print(" ");
            }

            System.out.print("*");
            for (int c = 0; c < 2 * a && a < lineCount / 2 + 1; c++) {
                System.out.print("*");
            }
            if (a > lineCount / 2){
                for (int e = 0; e < (lineCount - a) * 2 - 2; e++){
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        }
    }

}