package com.kabaproject.learningjava;

public class Dog {

    // Instance Variables
    private String name, breed, color;
    private int age;

    // Constructor Declaration
    public Dog(String name, String breed, int age, String color){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getBreed(){
        return this.breed;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return String.format(
                "%s is my dog, it's a %d years old %s %s",
                this.getName(), this.getAge(), this.getColor(), this.getBreed()
        );
    }
}
