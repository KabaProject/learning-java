package com.kabaproject.learningjava;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        // Switches

        String month = "January";
        String message = "This month is";

        switch(month){
            case "January":
                message += " " + month;
                break;
            default:
                break;
        }

        System.out.println(message);
    }
}
