package com.kabaproject.learningjava;

import com.kabaproject.learningjava.Organ;

import java.util.Scanner;

public class Eye extends Organ implements PacientOrgan{
    protected String color;

    public Eye(String name, String condition, String color){
        super(name, condition); // Init Organ
        this.color = color;
    }

    public void showOptions(){
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("\t1. Close the eye");
        option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println(String.format("%s closed", this.name));
                break;
            default:
                break;
        }
    }
}
