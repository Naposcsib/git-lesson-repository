package com.naposcsib;

import java.util.Arrays;

public class SwapElements {
    public static void main(String[] args) {
        String[] orders = new String[3];
        orders[0] = "first";
        orders[1] = "second";
        orders[2] = "third";

        System.out.println(Arrays.toString(orders));

        String swap = orders[0];
        orders[0] = orders[2];
        orders[2] = swap;

        System.out.println(Arrays.toString(orders));
    }
}