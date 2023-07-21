package operators;
/*
  Write a Java program that takes an integer as user input and checks if it is a positive number.
 */
import java.util.Scanner;
public class PositiveNumberCheker {

	public static void main(String[] args) {
		// Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");

        // Read the user input as an integer
        int number = scanner.nextInt();

        // Close the Scanner to free up resources
        scanner.close();

        // Check if the number is positive
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero, which is neither positive nor negative.");
        } else {
            System.out.println("The number " + number + " is not positive.");
        }
    }
}

	
