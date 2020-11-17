package com.naposcsib;

public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";

        System.out.println(appendFunc(typo));
    }

    public static String appendFunc(String text){
        return text + "a";
    }
}