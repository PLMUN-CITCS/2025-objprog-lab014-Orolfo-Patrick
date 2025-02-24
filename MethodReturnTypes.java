public class MethodReturnTypes {
    public static void main(String[] args) {
        // Call the void method to display a welcome message
        displayWelcomeMessage();

        // Declare variables
        int value1 = 20;
        int value2 = 30;

        // Call the method that returns a value
        double result = calculateAverage(value1, value2);

        // Print the result
        System.out.println("The average is: " + result);
    }

    // Void method that prints a welcome message
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method that returns the average of two numbers
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }
}
