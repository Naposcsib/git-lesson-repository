package com.naposcsib;
import java.util.Scanner;
public class DraWTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int lineCount = scanner.nextInt();

        for (int a = 0; a < lineCount; a++) {

            for (int b = 0; b < a; b++) {
                System.out.print("* ");
            }

            System.out.println("*");
        }
    }
}

