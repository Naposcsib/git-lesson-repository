package com.naposcsib;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Írj be egy egész számot!");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("páros");}
        if (number % 2 == 1){
                System.out.println("páratlan");
            }
        }

    }

