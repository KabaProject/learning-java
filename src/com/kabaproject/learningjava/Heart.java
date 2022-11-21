package com.kabaproject.learningjava;

import java.util.Scanner;

public class Heart extends Organ implements PacientOrgan{
    protected int rate;

    public Heart(String name, String condition, int rate){
        super(name, condition);
        this.rate = rate;
    }

    public void showOptions(){
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.println("\t1. Change the heat rate");
        option = scanner.nextInt();

        switch (option){
            case 1:
                changeHeartRate();
                break;
            default:
                break;
        }
    }

    public void changeHeartRate(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the new heart rate: ");
        this.rate = scanner.nextInt();

        System.out.println("Heart rate changed to: " + this.rate);
    }
}
