package org.example.FactoryPattern;

public class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck Starts");
    }

    @Override
    public void stop() {
        System.out.println("Truck Stops");
    }
}
