package com.kabaproject.learningjava;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        // Strings

        String name = "Mario";

        boolean[] isEqual = new boolean[2];
        isEqual[0] = name.equals("Mario"); // Boolean - Checks if it's equals to other string
        isEqual[1] = name.equalsIgnoreCase("mario"); // Boolean - Checks if it's equals to other string ignoring the case
        System.out.println(name + " == Mario? " + isEqual[0]);
        System.out.println(name + " == mario? (IG) " + isEqual[1]);

        int len = name.length(); // Integer - Return the number of letters
        System.out.println(name + " has " + len + " letters");

        char someChar = name.charAt(3); // Char - Return the letter of the [index] position
        int index = name.indexOf(someChar); // Int - Return the index of the 1st matched char
        System.out.println(name + " has a letter " + someChar + " in the position " + (index + 1));

        boolean is_empty = "".isEmpty();
        System.out.println("The string \"\" is empty? " + (is_empty ? "Yeah" : "Not"));
    }
}
