package org.example.AbstractFactoryPattern;

public class BMW implements Vehicle {
    @Override
    public void start() {
        System.out.println("BMW Starts");
    }

    @Override
    public void stop() {
        System.out.println("BMW Stops");
    }
}
