package org.example.AbstractFactoryPattern;

import java.util.LinkedList;

public class AbstractMain {

    public static void main(String[] args) {
        VehicleFactory factory = new ToyotaFactory();
        Vehicle vehicle = factory.createVehicle();
        vehicle.start();
        vehicle.stop();
    }
}
