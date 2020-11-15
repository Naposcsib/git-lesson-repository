package com.naposcsib;

public class AppendA {
    public static void main(String[] args) {
        String[] animals = new String [3];
        animals[0] = "koal";
        animals[1] = "pand";
        animals[2] = "zebr";

        for (int i = 0; i < animals.length; i++){
            animals[i] += "a";

        System.out.println(animals[i]);
        }
    }
}
