package loop;
/*
  Write a program that prints the Fibonacci series up to a specified limit entered by the user.
 However, skip printing numbers that are divisible by 3. Use the continue statement to skip such numbers.
 */
import java.util.Scanner;

public class FibonaccisSeries {

	public static void main(String[] args) {
		//input from the user
		  Scanner input = new Scanner(System.in);

	        System.out.print("Enter the limit: ");
	        int limit = input.nextInt();
	     // First number in the Fibonacci series
	        int num1 = 0; 
	     // Second number in the Fibonacci series
	        int num2 = 1; 
	     // Variable to store the current Fibonacci number
	        int fibonacci = 0;

	        System.out.print("Fibonacci series up to " + limit + ": ");

	        while (fibonacci <= limit) {
	            if (fibonacci % 3 == 0) {
	                // Skip numbers divisible by 3
	                fibonacci = num1 + num2; // Calculate the next Fibonacci number
	                num1 = num2; // Update the first number
	                num2 = fibonacci; // Update the second number
	                continue; // Skip printing the current Fibonacci number
	            }

	            System.out.print(fibonacci + " "); // Print the current Fibonacci number

	            fibonacci = num1 + num2; // Calculate the next Fibonacci number
	            num1 = num2; // Update the first number
	            num2 = fibonacci; // Update the second number
	        }

	        input.close();
	    }
	}

	
