package com.naposcsib;

public class Cuboid {
    public static void main(String[] args) {

        double a = 1;
        double b = 2;
        double c = 3;

        double f = 2 * (a * b + b * c + c * a);
        double t = a * b * c;

        System.out.println("Felület: " + f);
        System.out.println("Térfogat: " + t);

    }
}