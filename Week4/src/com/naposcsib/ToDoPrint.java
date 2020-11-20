package com.naposcsib;

public class ToDoPrint {
        public static void main(String... args){
            String todoText = " - Buy milk\n";
            todoText = "My todo:\n" + todoText + " - Download games\n" + "\t - Diablo\n";

            System.out.println(todoText);
        }
}

