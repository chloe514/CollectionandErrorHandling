import java.util.*; // Importing the necessary classes

// Defining the main class named Integers
public class Integers {

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Defining a List of integers with duplicates
        List<Integer> integers = Arrays.asList(10, 20, 20, 30, 40, 40, 50, 60, 60, 70);

        // Use a Set to remove duplicates
        Set<Integer> uniqueIntegers = new HashSet<>();

        // Variables to store the sum and average of integers
        int sum = 0;
        double average = 0.0;

        try {
            // Add all elements from the list to the set (removes duplicates)
            uniqueIntegers.addAll(integers);

            // Check if the set is empty after removing duplicates
            if (uniqueIntegers.isEmpty()) {
                throw new IllegalArgumentException("The list of integers is empty after removing duplicates.");
            }

            // Calculate the sum of unique integers
            for (int num : uniqueIntegers) {
                sum += num;
            }

            // Calculate the average of unique integers
            if (uniqueIntegers.size() > 0) {
                average = (double) sum / uniqueIntegers.size(); // Cast to double for floating-point division
            } else {
                throw new ArithmeticException("Cannot divide by zero to calculate the average.");
            }

            // Print the list of unique integers
            System.out.println("List of integers without duplicates: " + uniqueIntegers);

            // Print the sum of unique integers
            System.out.println("Sum: " + sum);

            // Print the average of unique integers
            System.out.println("Average: " + average);

        } catch (IllegalArgumentException | ArithmeticException e) {
            // Handle specific exceptions
            System.err.println("An error occurred: " + e.getMessage());
        } catch (Exception e) {
            // Handle any other unexpected exceptions
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Finally block - always executes regardless of exceptions
            System.out.println("Operation completed.");
        }
    }
}
