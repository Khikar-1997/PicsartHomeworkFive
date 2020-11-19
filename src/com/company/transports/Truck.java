package com.company.transports;

import com.company.transportTest.Vehicle;

public class Truck extends Vehicle {
    public Truck(String brand, int wheels, String motorSound) {
        super(brand, wheels, motorSound);
    }

    public Truck() {
    }

    public void carry(int tonnage) {
        System.out.println("Our truck can carry up to " + tonnage + " tons of cargo.");
    }

    @Override
    public void start() {
        System.out.println("Truck started working");
    }

    @Override
    public void brake() {
        System.out.println("Truck braked");
    }

    @Override
    public void stop() {
        System.out.println("Truck stoped working");
    }

    @Override
    public String soundOfTheVehicleMotor(String sound) {
        return super.soundOfTheVehicleMotor(sound);
    }
}