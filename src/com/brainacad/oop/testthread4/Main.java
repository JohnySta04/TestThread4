package com.brainacad.oop.testthread4;

public class Main {
    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.17.6");
        System.out.println("------------------------------------------");

        DiningHallObject diningHallObject = new DiningHallObject();
        for (int i = 0; i < 10; i++)
            diningHallObject.makePizza();

        for (int i = 0; i < 20; i++) {
            new ServePizzaThread(diningHallObject).start();
        }

        System.out.println("******************************************");

    }
}
