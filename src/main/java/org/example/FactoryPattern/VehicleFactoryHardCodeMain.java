package org.example.FactoryPattern;

import java.util.Scanner;

public class VehicleFactoryHardCodeMain {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String vehicleType = scn.next();
        Vehicle vehicle;

        if(vehicleType.equalsIgnoreCase("Car")){
            vehicle = new Car();
        }
        else if(vehicleType.equalsIgnoreCase("Truck")){
            vehicle = new Truck();
        }
        else{
            vehicle = new Bike();
        }

        vehicle.stop();
        vehicle.start();
    }


}
