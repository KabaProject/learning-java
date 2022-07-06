package com.kabaproject.learningjava;

import com.kabaproject.learningjava.Dog;

public class Main {
    public static void main(String[] args){
        // Basic OOP
        Dog bones = new Dog("Bones", "pitbull", 5, "grey");
        Dog merry = new Dog("Merry", "white");
        Dog cookie = new Dog("Cookie");

        merry.setAge(5);
        merry.setBreed("puddle");

        cookie.setColor("brown");
        cookie.setBreed("san bernardo");
        cookie.setAge(6);

        System.out.println(bones);
        System.out.println(merry);
        System.out.println(cookie);
    }
}
