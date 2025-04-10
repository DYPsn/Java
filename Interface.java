// Interface definition
interface Animal {
    void sound(); // abstract method
}

// Class implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Another class implementing the interface
class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class Interface{
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Output: Dog barks
        a2.sound(); // Output: Cat meows
    }
}
