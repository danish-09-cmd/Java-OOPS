package classes_objects;

public class Car {
    String model;
    int year;

    void start() {
        System.out.println(model + " is starting.");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.model = "Honda Civic";
        c.year = 2020;
        c.start();
    }
}
