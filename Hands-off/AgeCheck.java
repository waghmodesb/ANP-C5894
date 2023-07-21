package operators;
/*
  Write a Java program that prompts the user to enter their age. 
  The program should check if the age is greater than or equal to 18 and print "You are an adult" if true, or 
  "You are a minor" otherwise.
 */
 import java.util.Scanner;
public class AgeCheck {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        if (age >= 18) {
	            System.out.println("You are an adult.");
	        } else {
	            System.out.println("You are a minor.");
	        }

	        scanner.close();


	}

}
