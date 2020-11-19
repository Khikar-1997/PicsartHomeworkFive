package com.company.transports;

import com.company.transportTest.Vehicle;

public class Bus extends Vehicle {
    private boolean conductor;

    public Bus(String brand, int wheels, String motorSound, boolean conductor) {
        super(brand, wheels, motorSound);
        this.conductor = conductor;
    }

    public Bus(boolean conductor) {
        this.conductor = conductor;
    }

    public Bus() {
    }

    public boolean isConductor() {
        return conductor;
    }

    public void setConductor(boolean conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", conductor=" + conductor;
    }

    @Override
    public void start() {
        System.out.println("Bus started working");
    }

    @Override
    public void brake() {
        System.out.println("Bus braked");
    }

    @Override
    public void stop() {
        System.out.println("Bus stoped working");
    }

    @Override
    public String soundOfTheVehicleMotor(String sound) {
        sound = "ghnghnghnghn";
        return sound;
    }
}
