package javaEducation;

// class for Vehicles
abstract class Vehicle {
    abstract void move();
}

// class for only vehicles with engines
abstract class VehicleWithEngine extends Vehicle {
    public void startEngine() {
        System.out.println("Starting engine");
    }
}

class Car extends VehicleWithEngine {
    @Override
    public void move() {
        startEngine();
    }
}

class Bycicle extends Vehicle {
    @Override
    public void move() {
        System.out.println("We're pedaling");
    }
}

public class liskovExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        Bycicle newBike = new Bycicle();
        newBike.move();
    }
    
}
