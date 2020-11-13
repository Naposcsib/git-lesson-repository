package com.naposcsib;
import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A farmer tyúkjainak száma?");
        int number1 = scanner.nextInt();
        System.out.println("A farmer sertéseinek száma?");
        int number2 = scanner.nextInt();

        System.out.println("Az állatok lábainak száma összesen: ");
        System.out.println(number1 * 2 + number2 * 4);

    }
}
