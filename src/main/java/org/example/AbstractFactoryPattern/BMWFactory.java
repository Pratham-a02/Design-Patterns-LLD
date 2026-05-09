package org.example.AbstractFactoryPattern;

public class BMWFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new BMW();
    }
}
