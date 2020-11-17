package com.naposcsib;
import java.util.Scanner;
public class DiagonalMatrix {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Írj be egy számot!");
     int userInput = scanner.nextInt();
     int[][] matrix = new int[userInput][userInput];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < userInput; j++){
                if (i == j){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

                System.out.println(" ");

        }
    }
}