/*
  Write a program that takes the size of the array as input from the user. 
  Then, prompt the user to enter elements of the array. Calculate and display the 
  sum of all elements in the array.
 */
import java.util.Scanner;
public class ArraySumCalculator {

	public static void main(String[] args) {
		 //input from the user
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initialize an array to store user-entered elements
        int[] arr = new int[size];

        // Prompt the user to enter elements of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Close the Scanner as we don't need it anymore
        scanner.close();

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        // Display the entered array elements
        System.out.print("The array elements are: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Display the sum of all elements in the array
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}

	
