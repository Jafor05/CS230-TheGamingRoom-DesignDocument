package com.three19;

public class Driver { // Define a class named Driver
    private String name; // Private field to hold the name of the driver

    public Driver(String name) { // Constructor to initialize the driver's name
        this.name = name;
    }

    public void drive(Vehicle vehicle) { // Method for the driver to operate a vehicle
        System.out.println(name + " is driving the vehicle.");
        vehicle.move(); // Call move method of the vehicle
        if (vehicle instanceof TwoWheeled) { // Check if the vehicle implements TwoWheeled interface
            ((TwoWheeled) vehicle).balance(); // If so, call balance method
        }
    }
}
