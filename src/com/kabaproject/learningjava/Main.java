package com.kabaproject.learningjava;

public class Main {
    public static void main(String[] args){
        // Singleton
        Database db = Database.getInstance("music");
        db = Database.getInstance("papa");

        System.out.println(db.getName());
    }
}


