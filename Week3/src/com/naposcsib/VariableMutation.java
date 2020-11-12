package com.naposcsib;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a += 10;
        // Növeld meg az "a" változó értékét 10-zel

        System.out.println(a);

        int b = 100;
        b -= 100;
        // Csökkentsd a "b" változó értékeét 7-tel

        System.out.println(b);

        int c = 44;
        c += c;
        // A c értéke legyen dupla akkora

        System.out.println(c);

        int d = 125;
        d /= 5;
        // Oszd el a d-t 5-tel

        System.out.println(d);

        int e = 8;
        e *= e * e;
        // Emeld köbre az e változó értékét

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean f = f1 > f2;

        System.out.println(f);
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