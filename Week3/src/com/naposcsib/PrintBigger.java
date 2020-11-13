package com.naposcsib;
import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek két számot!");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        if (number1>number2){
            System.out.println("A nagyobb szám:" + number1);
        } else {
            System.out.println("A nagyobb szám: " + number2);
        }

        // Írj egy programot, ami két számot kér a standard input-ból
        // és kiírja a nagyobbat
    }
}