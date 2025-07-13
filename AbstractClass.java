package abstraction;

abstract class Shape {
    abstract void draw();

    void display() {
        System.out.println("Displaying shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AbstractClass{
    public static void main(String[] args) {
        Shape s1 = new Circle();    
        Shape s2 = new Rectangle(); 

        s1.draw();   
        s2.draw();   

        s1.display();   
    }
}
