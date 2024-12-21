package com.three19;

public abstract class Vehicle { // Define an abstract class named Vehicle
    private String name; // Private field to hold the name of the vehicle

    public Vehicle(String name) { // Constructor to initialize the name of the vehicle
        this.name = name;
    }

    public String getName() { // Method to retrieve the name of the vehicle
        return name;
    }

    public abstract void move(); // Abstract method to define movement behavior
}

