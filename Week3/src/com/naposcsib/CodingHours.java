package com.naposcsib;

public class CodingHours {
    public static void main(String[] args) {
        float hoursPerDay = 6; // Egy átlagos Green Fox hallgató 6 órát kódol naponta
        float halfYearWeeks = 17;// Egy félév hosszúsága 17 hét
        float hoursPerWeek = hoursPerDay * 5;
        float hoursOfProgramming = halfYearWeeks * hoursPerWeek;//

        // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
        // ha a hallgató csak hétköznap kódol
        System.out.println(hoursOfProgramming);

        // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
        // ha az átlagos heti munkaidő 52 óra
        float workingHours = 52;
        float percentOfProgramming = (hoursOfProgramming * 100) / (workingHours * halfYearWeeks) ;

        System.out.println(percentOfProgramming);
    }
}
