package org.example.AbstractFactoryPattern;

public class HondaFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Honda();
    }
}
