package com.naposcsib;
import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Írd be a neved!");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        System.out.println("Hello," + userInput + "!");
    }
}