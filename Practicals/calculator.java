package loop;
/*
  A simple calculation example.
  It prompts the user to enter two numbers
  choose an operation to perform on those number.
 */
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) 
	{
		//input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator App!");
        System.out.println("-------------------------------");
        System.out.print("Enter the first number: ");
        
        //for 1st number
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        
        //for 2nd number
        double num2 = sc.nextDouble();

        //operations to be performed on both the numbers
        System.out.println("Available operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter the operation number: ");
        
        //input for operation
        int operation = sc.nextInt();

        //variable declaration 
        double result;
        //switch case
        switch (operation) 
        {
            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;
                
            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;
                
            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;
                
            case 4:
                if (num2 != 0) 
                {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } 
                else 
                {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
                
            default:
                System.out.println("Error: Invalid operation number.");
                break;
        }
        sc.close();
}
}
