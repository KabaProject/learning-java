package com.kabaproject.learningjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // User Input
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        short age = scanner.nextShort();

        System.out.println("Your name is " + name + " and you're " + age);
    }
}
