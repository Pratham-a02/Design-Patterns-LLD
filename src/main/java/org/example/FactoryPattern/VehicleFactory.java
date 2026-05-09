package org.example.FactoryPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Car")){
            return new Car();
        }
        else if(vehicleType.equalsIgnoreCase("Bike")){
            return new Bike();
        }
        else if(vehicleType.equalsIgnoreCase("Truck")){
            return new Truck();
        }
        else{
            throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
