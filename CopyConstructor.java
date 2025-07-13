package constructors;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class CopyConstructor{
    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 20);
        Student s2 = new Student(s1);          

        System.out.println("Original Student:");
        s1.display();

        System.out.println("\nCopied Student:");
        s2.display();
    }
}
