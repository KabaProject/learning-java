package com.kabaproject.learningjava;

import java.util.Scanner;

public class Stomach extends Organ implements PacientOrgan{
    protected boolean isFedeed = false;

    public Stomach(String name, String condition, boolean isFedeed){
        super(name, condition);
        this.isFedeed = isFedeed;
    }

    @Override
    public void showOptions(){
        Scanner scanner = new Scanner(System.in);
        int option;

        if(this.isFedeed) {
            System.out.println("It's fedeed");
            return;
        }

        System.out.println("Need to be fed");
        System.out.println("\t1. Digest");
        option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("Digesting begin...");
                this.isFedeed = true;
                break;
            default:
                break;
        }
    }
}
