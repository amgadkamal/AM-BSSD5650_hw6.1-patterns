package com.company;

public class Jaccuzi {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;
    public Jaccuzi (){
        speed = OFF;
    }


    public void high() {
        speed = HIGH;
        System.out.println("Jacuzzi High speed, speed is " + speed);
    }
    public void medium() {
        speed = MEDIUM;
        System.out.println("Jacuzzi medium speed, speed is " + speed);

    }

    public void low() {
        speed = LOW;
        System.out.println("Jacuzzi low speed, speed is " + speed);
    }

    public void off() {
        speed = OFF;
        System.out.println("Jacuzzi is off, speed is " + speed);
    }

    public int getSpeed() {
        return speed;
    }
}

