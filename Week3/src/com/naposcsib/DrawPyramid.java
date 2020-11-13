package com.naposcsib;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int lineCount = scanner.nextInt();

       for (int a = 1; a < lineCount * 2; a +=2){
           for (int b = 1; b < a; b++) {
               for (int c = lineCount / 2; c < 1 ; c -= 2){
                   System.out.print("  ");
               }
               System.out.print("*");

           }
           System.out.println("*");
       }


    }
}
// Írj egy programot, ami egy számot kér a standard input-ból és egy
// ilyen piramist rajzol:
//
//
//    *
//   ***
//  *****
// *******
//
// A piramisnak annyi sora legyen,
// mint amennyi az inputból kiolvasott szám értéke