package com.three19;

public class Main { // Define a class named Main
    public static void main(String[] args) { // Main method to start the program
        // Creating a Bicycle object
        Vehicle myBike = new Bicycle("Speedster");

        // Creating a Driver object
        Driver driver = new Driver("ABC");

        // The driver operates the bicycle
        driver.drive(myBike); // Call the drive method of Driver class with myBike as argument
    }
}