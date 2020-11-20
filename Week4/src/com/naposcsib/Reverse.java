package com.naposcsib;

public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";


        System.out.println(reverse(toBeReversed));
    }
public static String reverse (String text) {
        String[] characters = text.split("");
        for (int k = 0; k < characters.length; k++) {
            text = characters[characters.length - k - 1];
            System.out.print(text);
        }
            return text;
        }
}



// Készíts egy függvényt ami megfordít egy Stringet, amit
// bemeneti paraméterként kap.
// Használd a függvényt a "toBeReversed" változón ellenőrzésként.
// Elsőként próbáld megoldani a feladatot a charAt() függvénnyel, majd
// opcionálisan akárhogy.