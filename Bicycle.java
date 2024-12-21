package com.three19;

public class Bicycle extends Vehicle implements TwoWheeled { // Bicycle class implementing Vehicle and TwoWheeled interfaces
    public Bicycle(String name) { // Constructor to initialize Bicycle object with a name
        super(name);
    }

    @Override
    public void move() { // Implementation of move method for Bicycle
        System.out.println(getName() + " is pedaling.");
    }

    @Override
    public void balance() { // Implementation of balance method for Bicycle
        System.out.println(getName() + " is balancing on two wheels.");
    }
}
