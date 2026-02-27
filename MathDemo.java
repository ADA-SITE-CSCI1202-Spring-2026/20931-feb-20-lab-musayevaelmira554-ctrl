public class MathDemo {

    // Method to return the minimum of two integers
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // Method to return the maximum of two integers
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Main method to test the class
    public static void main(String[] args) {

        int number1 = 10;
        int number2 = 25;

        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);

        System.out.println("Minimum: " + min(number1, number2));
        System.out.println("Maximum: " + max(number1, number2));
    }
}
