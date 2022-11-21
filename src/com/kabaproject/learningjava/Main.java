package com.kabaproject.learningjava;

public class Main {
    public static void main(String[] args){
        // OOP Challenge
        Pacient tom = new Pacient("Tom", 26);
        boolean hasQuit = false;

        tom.getInfo();

        do{
            if (tom.selectOrgan() == 6){
                hasQuit = true;
            }
        }while(!hasQuit);
    }
}
