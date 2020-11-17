package com.naposcsib;
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 17;

        for (int i = 0; i != number  ; i++ ) {
            System.out.println("Kérek egy számot!");
            int userGuess = scanner.nextInt();

            if (userGuess == number) {
                System.out.println("Eltaláltad!");
                break;
            } else if (userGuess < number) {
                System.out.println("Nagyobb..");
            } else {
                System.out.println("Kisebb..");
            }

            i = userGuess;
        }
    }
}
