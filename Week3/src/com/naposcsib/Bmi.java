package com.naposcsib;

public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        System.out.println("Testtömeg-index:");
        double bmi = massInKg / (heightInM * heightInM);
        System.out.println(bmi);


    }
}