package inheritance;

class Vehicle1 {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car1 extends Vehicle1 {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike extends Vehicle1 {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}

class Truck extends Vehicle1 {
    void loadGoods() {
        System.out.println("Truck is loading goods.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Car1 car = new Car1();
        Bike bike = new Bike();
        Truck truck = new Truck();

        car.start(); 
        car.drive();

        bike.start(); 
        bike.ride();

        truck.start(); 
        truck.loadGoods();
    }
}
