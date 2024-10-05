package org.example;

public class Car {
    // target object
    IEngine engine;

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }

    void drive () {
        int start = engine.start();
        if (start > 0) {
            System.out.println("Car started");
        } else {
            System.out.println("Car not started");
        }
    }
}
