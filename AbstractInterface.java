package abstraction;

interface Shape {
    void draw();  
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class AbstractInterface {
    public static void main(String[] args) {
        Shape s1 = new Circle();    
        Shape s2 = new Rectangle(); 

        s1.draw(); 
        s2.draw(); 
    }
}
