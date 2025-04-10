class Vehicle {
    String brand = "BMW";

    void start() {
        System.out.println(brand + " is starting...");
    }
}

public class Car {
    private String model = "Sedan";

    // Inner class extending another class (Vehicle)
    class Engine extends Vehicle {
        void showDetails() {
            System.out.println("Car model: " + model);
            start(); // Inherited method
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();
        engine.showDetails();
    }
}
