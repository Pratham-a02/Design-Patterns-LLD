package org.example.AbstractFactoryPattern;

public class AbstractMain {

    public static void main(String[] args) {
        VehicleFactory factory = new ToyotaFactory();
        Vehicle vehicle = factory.createVehicle();
        vehicle.start();
        vehicle.stop();
    }
}
