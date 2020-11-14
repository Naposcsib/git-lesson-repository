package com.naposcsib;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int lineCount = scanner.nextInt();


       for (int a = 0; a < lineCount; a++){

               for (int b = lineCount - a; b > 0; b--) {

                   System.out.print(" ");

               }

            System.out.print("*");
               for (int c = 2; c < 2 * a + 2; c++){
                   System.out.print("*");


               }
               System.out.println(" ");
       }


    }
}
