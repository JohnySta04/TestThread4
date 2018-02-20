package com.brainacad.oop.testthread4;

public class DiningHallObject {

    private int pizzaNum;
    private int studentID = 1;

    public int getPizzaNum() {
        return this.pizzaNum;
    }

    public void setPizzaNum(int pizzaNum) {
        this.pizzaNum = pizzaNum;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void makePizza() {
        this.pizzaNum++;
    }

    public void servePizza() {
        String result;
        if (this.pizzaNum > 0) {
            result = "Served ";
            this.pizzaNum--;
        } else result = "Starved ";
        System.out.println(result + this.studentID);
        this.studentID++;
    }
}
