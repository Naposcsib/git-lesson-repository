package com.naposcsib;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        System.out.println(a);
        // Növeld meg az "a" változó értékét 10-zel


        int b = 100;
        b -= 7;
        System.out.println(b);
        // Csökkentsd a "b" változó értékét 7-tel


        int c = 44;
        c += c;
        System.out.println(c);
        // A c értéke legyen dupla akkora


        int d = 125;
        d /= 5;
        System.out.println(d);
        // Oszd el a d-t 5-tel


        int e = 8;
        e *= e * e;
        System.out.println(e);
        // Emeld köbre az e változó értékét


        int f1 = 123;
        int f2 = 345;
        System.out.println(f1 > f2);
        // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél

        int g1 = 350;
        int g2 = 200;
        System.out.println(g2 * 2 > g1);
        // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)

        int h = 135798745;
        System.out.println(h % 11 == 0);
        // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
        // Írasd is ki logikai (boolean) értékként

        int i1 = 10;
        int i2 = 3;
        System.out.println(i1 > i2 * i2 && i1 < i2 * i2 * i2);
        // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)

        int j = 1521;
        System.out.println(j % 3 == 0 || j % 5 ==0);
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
    }
}