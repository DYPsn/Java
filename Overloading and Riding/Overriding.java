class Animal {
    // Method in the parent class
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // Parent class object
        myAnimal.sound();               // Calls parent class method

        Dog myDog = new Dog();          // Child class object
        myDog.sound();                  // Calls overridden method in child class

        Animal obj = new Dog();         // Polymorphism
        obj.sound();                    // Still calls Dog's overridden method
    }
}
