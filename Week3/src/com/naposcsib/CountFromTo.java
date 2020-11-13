package com.naposcsib;
import java.util.Scanner;
public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Írj be két egész számot a számoláshoz!");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 > number2){
            System.out.println("A második számnak nagyobbnak kellene lennie!");
        } else {
            while (number1 <= number2) {
                System.out.println(number1);
                number1++;
            }
        }

    }
}
// Készíts egy programot, ami két számot kér
// Ha a második szám nem nagyobb, mint az első, írja ki:
// "A második számnak nagyobbnak kellene lennie!"
//
// Amennyiben nagyobb,
// az első számtól kezdve el kellene számolnia egyesével a másodikig
//
// Például:
//
// első szám: 3, második szám: 6, ezt kellene printelnie:
//
// 3
// 4
// 5