package com.company.transports;

import com.company.transportTest.Vehicle;

public class Car extends Vehicle {
    private String modelName;

    public Car(String brand, int wheels, String motorSound, String modelName) {
        super(brand, wheels, motorSound);
        this.modelName = modelName;
    }

    public Car(String modelName) {
        this.modelName = modelName;
    }

    public Car() {
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", modelName='" + modelName + '\'';
    }

    @Override
    public void start() {
        System.out.println("Car started working");
    }

    @Override
    public void brake() {
        System.out.println("Car braked");
    }

    @Override
    public void stop() {
        System.out.println("Car stoped working");
    }

    @Override
    public String soundOfTheVehicleMotor(String sound) {
        sound = "vnvnvnvnv";
        return sound;
    }
}
