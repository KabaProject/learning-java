package com.kabaproject.learningjava;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        // Strings

        // Ways of Strings
        String normal = new String("Normal"); // A normal String, immutable
        System.out.format("Value -> %s\n", normal);

        char letter = normal.charAt(3); // Char - Get the letter in the 3nd position
        System.out.format("Letter at 4th pos -> %s\n", letter);

        int index = normal.indexOf('r'); // Int - Get the index of the 1st match
        System.out.format("Position of r -> %d\n", (index + 1));

        String subs = normal.substring(index); // String - Get the substring from index
        System.out.format("Substring from r -> %s\n", subs);

        String concated = normal.concat(" String"); // String - Get the join of 2 strings
        System.out.format("Concated -> %s\n", concated);

        boolean is_equal = normal.equals("Normal"); // Bool - Check if a string is equal to other
        System.out.format("Normal is equal to %1$s -> %2$s\n", "Normal", is_equal);

        StringBuffer buffer = new StringBuffer("Buffer"); // A growable and writable char seq
        buffer.insert(0, "W"); // Can insert
        buffer.append("o"); // Can append
        buffer.delete(1, 2); // Can delete

        System.out.format("\n%s\n", buffer);
    }
}
