package constructors;

class Car {
    String brand;
    int year;

    Car() {
        System.out.println("Default constructor called");
        brand = "Safari";
        year = 2018;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class DefaultConstructor{
    public static void main(String[] args) {
        Car c1 = new Car();  
        c1.showDetails();
    }
}
