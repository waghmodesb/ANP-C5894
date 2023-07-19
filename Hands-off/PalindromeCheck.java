package operators;
/*
  Write a Java program that prompts the user to enter a three-digit number. 
  The program should check if the number is a palindrome, which means it reads the same forwards and backwards.
 */
import java.util.Scanner;
public class PalindromeCheck {

	public static void main(String[] args) 
	{
		//input from the user
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a three-digit number
	        System.out.print("Enter a three-digit number: ");
	        int number = scanner.nextInt();

	        // Extract the individual digits from the number
	        int originalNumber = number;
	        int digit1 = number % 10;
	        number /= 10;
	        int digit2 = number % 10;
	        number /= 10;
	        int digit3 = number;

	        // Check if the number is a palindrome
	        if (digit1 == digit3) {
	            System.out.println(originalNumber + " is a palindrome.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome.");
	        }
	    }
	}