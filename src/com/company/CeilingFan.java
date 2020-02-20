package com.company;

public class CeilingFan implements ElectronicDevice {

    private int speed = 0;

    @Override
    public void on() {
        System.out.println("Fan is ON");
        speed = 1;
    }

    @Override
    public void off() {
        System.out.println("Fan is OFF");
        speed = 0;
    }

    @Override
    public void volumeUp() {
        speed++;
        System.out.println("Fan speed is " + speed);
    }

    @Override
    public void volumeDown() {
        speed--;
        if(speed <= 0) {
            speed = 1;
        }

        System.out.println("Fan speed is " + speed);
    }
}

