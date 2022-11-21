package com.kabaproject.learningjava;

public class Main {
    public static void main(String[] args){
        // Concurrency
        Thread threadOne = new Thread(threadBehavior());
        Thread threadTwo = new Thread(threadBehavior());

        threadOne.start();
        threadTwo.start();
    }

    public static Runnable threadBehavior (){
        return new Runnable(){
            @Override
            public void run(){
                for(int x = 1; x <= 10; x++){
                    System.out.println("Lap number: " + x);
                    try{
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        };
    }
}


