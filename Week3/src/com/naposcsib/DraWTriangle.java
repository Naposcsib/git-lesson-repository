package com.naposcsib;
import java.util.Scanner;
public class DraWTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy egész számot!");
        int lineCount = scanner.nextInt();
        int a = 1;
        while (a <= lineCount){
            System.out.println("*");
            a++;
        }
    }
}
// Hozz létre egy egész szám típusú, lineCount nevű változót.
// Írj egy programot, ami egy számot kér a standard input-ból és
// elmenti azt a lineCount változóban.
// Rajzoljon egy ilyen háromszöget:
//
// *
// **
// ***
// ****
//
// A háromszögnek annyi sora legyen, mint amennyi a lineCount értéke.
