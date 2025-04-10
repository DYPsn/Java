public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            // Trying to access an index that doesn't exist
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Index out of range.");
        }

        System.out.println("Program continues after handling the exception.");
    }
}
