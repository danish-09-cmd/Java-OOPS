package inheritance;

class ElectronicDevice {
    void turnOn() {
        System.out.println("Electronic device is turning on.");
    }
}

class Computer extends ElectronicDevice {
    void runProgram() {
        System.out.println("Computer is running a program.");
    }
}

class Laptop extends Computer {
    void carryAround() {
        System.out.println("Laptop is easy to carry around.");
    }
}

public class MultiLevelInhheritance {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop();

        myLaptop.turnOn();    
        myLaptop.runProgram();
        myLaptop.carryAround(); 
    }
}

