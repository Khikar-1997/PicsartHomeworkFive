package com.company.transportTest;

import com.company.transports.VehicleActions;

public class Vehicle implements VehicleActions {
    private String brand = "Hyundai";
    private int wheels = 4;
    private String motorSound;

    public Vehicle(String brand, int wheels, String motorSound) {
        this.brand = brand;
        this.wheels = wheels;
        this.motorSound = motorSound;
    }

    public Vehicle() {
    }

    public void honk(String honk) {
        System.out.println("Honk: " + honk);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMotorSound() {
        return motorSound;
    }

    public void setMotorSound(String motorSound) {
        this.motorSound = motorSound;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", wheels=" + wheels;
    }

    @Override
    public void start() {
        System.out.println("Vehicle started working");
    }

    @Override
    public void brake() {
        System.out.println("Vehicle braked");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle stoped working");
    }

    @Override
    public String soundOfTheVehicleMotor(String sound) {
        return sound;
    }
}
