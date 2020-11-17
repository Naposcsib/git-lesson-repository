package com.naposcsib;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérek egy számot!");
        int userNumber = scanner.nextInt();
        System.out.println("A számok összege 1-től " + userNumber + "-ig");
        System.out.println(sum(userNumber));
    }
    static int sum (int number){
        int a = 0;

        for (int i = 0; i <= number; i++){
            a += i;
        }

        return a;
    }
}
