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
// Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot