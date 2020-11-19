package com.naposcsib;

public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        System.out.println(url.replace("bots", "odds").replaceFirst("/", ":/") + "/");
    }
}
