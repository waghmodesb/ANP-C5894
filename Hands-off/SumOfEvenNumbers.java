package loop;
/*
  Write a program that prompts the user to enter a series of integers.
  The program should calculate the sum of all the even numbers entered, skipping any negative numbers
   Use the continue statement to skip negative numbers.
 */
import java.util.Scanner;
public class SumOfEvenNumbers {

	public static void main(String[] args) {
		//input from the user
        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter a series of integers (enter a negative number to quit):");

        while (true) {
            int number = input.nextInt();

            if (number < 0) {
                break;
            }

            if (number % 2 != 0) {
                // Skip odd numbers
                continue;
            }
         // Add even numbers to the sum
            sum += number;
        }

        System.out.println("Sum of even numbers: " + sum);

        input.close();
    }
}


	
