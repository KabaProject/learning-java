package com.kabaproject.learningjava;

public class Organ {
    protected String name, condition;

    protected Organ(String name, String condition){
        this.name = name;
        this.condition = condition;
    }

    public void showStatus(){
        System.out.println("Name: " + this.name);
        System.out.println("Medical Condition: " + this.condition);
    }
}
