package org.example.AbstractFactoryPattern;

public class Vellfire implements Vehicle{
    @Override
    public void start() {
        System.out.println("Vellfire starts");
    }

    @Override
    public void stop() {
        System.out.println("Vellfire stops");
    }
}
