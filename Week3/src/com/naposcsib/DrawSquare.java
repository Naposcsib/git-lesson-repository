package com.naposcsib;
import java.util.Scanner;
public class DrawSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kérek egy egész számot!");
        int lineCount = scanner.nextInt();

        for (int a = 0; a < lineCount; a++) {
            if (a == 0) {
                for (int b = 0; b < lineCount; b++) {
                    System.out.print("%");
                }
                System.out.println(" ");
            } else {
                for (int c = 0; c < lineCount; c++) {
                    if (c == 0) {
                        System.out.print("%");
                    } else if (c != lineCount - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.println("%");
                    }
                }
            }
            if (a == lineCount - 1){
                for (int b = 0; b < lineCount; b++) {
                    System.out.print("%");
                }
            }

        }
    }
}