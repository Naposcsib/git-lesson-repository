package com.naposcsib;
import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írj be egy karaktert!");
        String chessCube = scanner.next();
        System.out.print(" ");

        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (j % 2 == 0) {
                    System.out.print(chessCube);
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println(" ");
            if (i % 2 == 0){
                System.out.print(" ");
            }
        }
    }
}
// Írj egy programot, ami egy ilyen "sakktáblát" rajzol ki:
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//