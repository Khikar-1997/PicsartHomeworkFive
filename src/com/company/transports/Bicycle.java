package com.company.transports;

import com.company.transportTest.Vehicle;

public class Bicycle extends Vehicle {
    public int gear;
    public int speed;

    public Bicycle(String brand, int wheels, String motorSound, int gear, int speed) {
        super(brand, wheels, motorSound);
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public Bicycle() {
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return (super.toString() + ", No of gears are " + gear
                + "\n"
                + "speed of bicycle is " + speed);
    }

    @Override
    public void start() {
        System.out.println("Bicycle started working");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle braked");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stoped working");
    }

    @Override
    public String soundOfTheVehicleMotor(String sound) {
        sound = "cvcvccvcvcv";
        return sound;
    }
} 