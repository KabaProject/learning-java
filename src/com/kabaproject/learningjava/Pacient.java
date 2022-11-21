package com.kabaproject.learningjava;

import java.util.Scanner;

final public class Pacient {
    private String name;
    private int age;

    private Eye leftEye, rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Pacient(String name, int age){
        this.name = name;
        this.age = age;

        this.leftEye = new Eye("Left eye", "Short Sighted", "Blue");
        this.rightEye = new Eye("Right eye", "Short Sighted", "Blue");
        this.heart = new Heart("Heart", "Normal", 105);
        this.stomach = new Stomach("Stomach", "PUD", false);
        this.skin = new Skin("Skin", "Burned");
    }

    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public int selectOrgan(){
        Scanner scanner = new Scanner(System.in);
        int option;

        System.out.print(
                "Choose an Organ:" +
                "\n\t1. Left Eye" +
                "\n\t2. Right Eye" +
                "\n\t3. Heart" +
                "\n\t4. Stomach" +
                "\n\t5. Skin" +
                "\n\t6. Quit\n"
        );
        option = scanner.nextInt();

        switch (option){
            case 1:
                this.leftEye.showStatus();
                this.leftEye.showOptions();
                break;
            case 2:
                this.rightEye.showStatus();
                this.rightEye.showOptions();
                break;
            case 3:
                this.heart.showStatus();
                this.heart.showOptions();
                break;
            case 4:
                this.stomach.showStatus();
                this.stomach.showOptions();
                break;
            case 5:
                this.skin.showStatus();
                this.skin.showOptions();
                break;
            case 6:
                System.out.println("You quit");
                break;
        }

        return option;
    }
}
