/*Write a Java program to take an 15  array of integers as input from the 
 user and sort it in ascending order using any suitable sorting algorithm. 
 Display the sorted array.
*/
import java.util.Scanner;
public class SortingArray {

	public static void main(String[] args) {
		//input from the user
        Scanner scanner = new Scanner(System.in);
        
        int size = 15; // Size of the array
        int[] array = new int[size];
        
        // Input 15 integers from the user
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Close the scanner to free resources
        scanner.close();
        
        // Print the unsorted array
        System.out.println("Unsorted Array:");
        printArray(array);
        
        // Sorting the array using Bubble Sort
        bubbleSort(array);
        
        // Print the sorted array
        System.out.println("Sorted Array:");
        printArray(array);
    }
    
    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Repeat the process for all elements in the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Compare adjacent elements and swap if necessary
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

	
