package com.naposcsib;
import java.util.Scanner;

public class MultiplicationTable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Írj be egy egész számot!");
        int number = scanner.nextInt();

        for (int a = 1; a <= 10; a++){
            System.out.println(a + " * " + number + " = " + number * a);
        }

    }
}
