package org.example.AbstractFactoryPattern;

public class ToyotaFactory implements VehicleFactory{

    public Vehicle createVehicle(String type) {
        if(type.equalsIgnoreCase("Fortuner")){
            return new Fortuner();
        }
        else if(type.equalsIgnoreCase("Vellfire")){
            return new Vellfire();
        }

        return null;
    }

    @Override
    public Vehicle createVehicle() {
        return null;
    }
}
