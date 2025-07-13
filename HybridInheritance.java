package inheritance;

interface GPS {
    void showLocation();
}

interface MusicSystem {
    void playMusic();
}

class Vehicle2 {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car2 extends Vehicle2 implements GPS, MusicSystem {
    void drive() {
        System.out.println("Car is driving.");
    }

    public void showLocation() {
        System.out.println("Showing car's location on GPS.");
    }

    public void playMusic() {
        System.out.println("Playing music in car.");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.start();          
        myCar.drive();          
        myCar.showLocation();   
        myCar.playMusic();      
    }
}
