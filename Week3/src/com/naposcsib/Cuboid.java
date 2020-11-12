package com.naposcsib;

public class Cuboid {
    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;

        double f = 2 * (a * b + b * c + c * a);
        double t = a * a * a;

        System.out.println("Felület: " + f);
        System.out.println("Térfogat: " + t);
        // Írj egy programot, ami egy téglatest 3 oldalát tartalmazza változókban (doubles)
        // A program írja ki a felületét és térfogatát a testnek ilyen formátumban:
        //
        // Felület: 600
        // Térfogat: 1000
    }
}