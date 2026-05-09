package org.example.AbstractFactoryPattern;

public class Fortuner implements Vehicle{
    @Override
    public void start() {
        System.out.println("Fortuner starts");
    }

    @Override
    public void stop() {
        System.out.println("Fortuner stops");
    }
}
