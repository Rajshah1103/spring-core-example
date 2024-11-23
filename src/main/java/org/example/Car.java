package org.example;

public class Car {
    // target object
    PetrolEngine engine;


    public Car(PetrolEngine engine) {
        this.engine = engine;
    }

    public void setEngine(PetrolEngine engine) {
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
