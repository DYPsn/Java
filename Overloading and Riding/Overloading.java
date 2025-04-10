public class Overloading {

    // Method with one int parameter
    public void show(int a) {
        System.out.println("Integer value: " + a);
    }

    // Method with one double parameter
    public void show(double a) {
        System.out.println("Double value: " + a);
    }

    // Method with two parameters
    public void show(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.show(10);        // Calls method with int
        obj.show(5.5);       // Calls method with double
        obj.show(5, 7);      // Calls method with two ints
    }
}
