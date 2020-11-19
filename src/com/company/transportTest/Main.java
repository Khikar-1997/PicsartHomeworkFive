package com.company.transportTest;

import com.company.transports.Bicycle;
import com.company.transports.Bus;
import com.company.transports.Car;
import com.company.transports.Truck;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Opel",4,"BrBrBrBr");
        System.out.println("_______________Vehicle_______________");
        System.out.println(vehicle.toString());
        System.out.println("__________________________________" + "\n");

        System.out.println("_______________CAR_______________");
        Car car = new Car("Mercedes",4,"vnvnvnvnv","E-240");
        System.out.println(car.toString());
        car.honk("Pi-b-ip");
        car.start();
        car.soundOfTheVehicleMotor(car.getMotorSound());
        car.brake();
        car.stop();
        System.out.println("__________________________________" + "\n");

        Bus bus = new Bus(true);
        if (bus.isConductor()){
            System.out.println(bus.toString());
            bus.honk("tn-tn-tng");
        } else {
            System.out.println("_______________BUS_______________");
            bus.setBrand("Mercedes");
            bus.setWheels(6);
            System.out.println(bus.toString());
            bus.honk("tu-tu-tu");
            bus.setMotorSound("ghnghnghn");
            bus.start();
            bus.soundOfTheVehicleMotor(bus.getMotorSound());
            bus.brake();
            bus.stop();
            System.out.println("__________________________________" + "\n");
        }

        Bicycle bicycle = new Bicycle(5,100);
        System.out.println("_______________Bicycle_______________");
        System.out.println(bicycle.toString());
        bicycle.honk("cing-cing");
        bicycle.setMotorSound("cvcvcvcvcvc");
        bicycle.start();
        bicycle.soundOfTheVehicleMotor(bicycle.getMotorSound());
        bicycle.brake();
        bicycle.stop();
        System.out.println("______________________________________" + "\n");

        Truck truck = new Truck();

        System.out.println("_______________TRUCK_______________");
        truck.carry(1000);
        truck.honk("t-t-t-t-t-tu");
        truck.start();
        truck.soundOfTheVehicleMotor(vehicle.getMotorSound());
        truck.brake();
        truck.stop();
        System.out.println("____________________________________");

    }
}
