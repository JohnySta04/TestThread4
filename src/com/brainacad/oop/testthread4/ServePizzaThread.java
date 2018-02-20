package com.brainacad.oop.testthread4;

public class ServePizzaThread extends Thread {
    private DiningHallObject diningHallObject;

    public ServePizzaThread(DiningHallObject diningHallObject) {
        this.diningHallObject = diningHallObject;
    }

    @Override
    public void run() {
        synchronized (diningHallObject) {
            System.out.print(Thread.currentThread().getName() + ": ");
            diningHallObject.servePizza();
        }
    }
}
