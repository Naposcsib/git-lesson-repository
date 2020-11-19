package com.naposcsib;

public class TakesLonger {
    public static void main(String... args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String always = " always takes longer than ";
        String it = quote.substring(0, quote.indexOf("It")+2);
        String you = quote.substring(quote.indexOf("you"));

        quote = it + always + you;

        System.out.println(quote);
    }
}