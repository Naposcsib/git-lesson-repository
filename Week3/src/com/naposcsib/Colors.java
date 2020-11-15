package com.naposcsib;

import java.util.Arrays;

public class Colors {
    public static void main(String[] args) {
        String[][] colors = new String[3][];

        String[] greenHues = new String[5];
            greenHues[0] = "lime";
            greenHues[1] = "forest green";
            greenHues[2] = "olive";
            greenHues[3] = "pale green";
            greenHues[4] = "spring green";
        String[] redHues = new String[3];
            redHues[0] = "orange red";
            redHues[1] = "red";
            redHues[2] = "tomato";
        String[] pinkHues = new String[4];
            pinkHues[0] = "orchid";
            pinkHues[1] = "violet";
            pinkHues[2] = "pink";
            pinkHues[3] = "hotpink";

        colors[0] = greenHues;
        colors[1] = redHues;
        colors[2] = pinkHues;

        System.out.println(Arrays.toString(colors[0]));
        System.out.println(Arrays.toString(colors[1]));
        System.out.println(Arrays.toString(colors[2]));
    }
}