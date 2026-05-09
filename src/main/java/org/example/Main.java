package org.example;

import org.example.FactoryPattern.Vehicle;
import org.example.FactoryPattern.VehicleFactory;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.start();
        vehicle1.stop();
    }
}