package com.naposcsib;

import  java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("írj be egy egész számot!");
        int number = scanner.nextInt();

        if (number <= 0){
            System.out.println("Nem elég");
        } else if (number == 1){
            System.out.println("Egy");
        } else if (number == 2){
            System.out.println("Kettő");
        } else {
            System.out.println("Sok");
        }

    }
}