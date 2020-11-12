package com.naposcsib;

public class CodingHours {
    public static void main(String[] args) {
        float hoursPerDay = 6;
        float halfYearWeeks = 17;
        float hoursPerWeek = hoursPerDay * 5;
        float hoursOfProgramming = halfYearWeeks * hoursPerWeek;//

        System.out.println(hoursOfProgramming);

        float workingHours = 52;
        float percentOfProgramming = (hoursOfProgramming * 100) / (workingHours * halfYearWeeks) ;

        System.out.println(percentOfProgramming);
    }
}
