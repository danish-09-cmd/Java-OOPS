package polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();              

        Dog d = new Dog();     
        d.sound();             

        Animal a2 = new Dog(); 
        a2.sound();            
    }
}
