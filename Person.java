package classes_objects;

public class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, I'm " + name + " and I'm " + age + " years old.");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Danish";
        p.age = 19;
        p.introduce();
    }
}
