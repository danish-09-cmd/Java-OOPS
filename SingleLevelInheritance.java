package inheritance;
class Vehicle {
    String type;
    
    public Vehicle(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println(type + " is starting...");
    }
}


class Car extends Vehicle {  
    String model;
    
    public Car(String type, String model) {
        super(type);  
        this.model = model;
    }
    
    public void drive() {
        System.out.println(model + " is driving");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Boat");
        vehicle.start();  
        
        Car myCar = new Car("Automobile", "Toyota Camry");
        
        myCar.start();            
        myCar.drive();    
    }
}