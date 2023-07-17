package loop;
import java.util.Scanner;
/*
 * Temperature Conversion:
Switch case hands-on
Prompt the user to enter a temperature in Celsius.
Provide a menu to choose the conversion type: Fahrenheit, Kelvin, or Rankine.
Use a switch case statement to perform the selected conversion and display the result.
Handle invalid conversion choices appropriately.
 */

public class TemperatureConversion
{

	public static void main(String[] args)
	{
		
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user for input
	        System.out.print("Enter the temperature in Celsius: ");
	        double celsius = scanner.nextDouble();

	        // Prompt the user for conversion type
	        System.out.println("Choose the conversion type:");
	        System.out.println("1. Fahrenheit");
	        System.out.println("2. Kelvin");
	        System.out.println("3. Rankine");
	        System.out.print("Enter your choice (1-3): ");
	        int choice = scanner.nextInt();

	        // Perform the selected conversion
	        double convertedTemperature;
	        switch (choice) {
	            case 1:
	                convertedTemperature = convertToFahrenheit(celsius);
	                System.out.println("The temperature in Fahrenheit is: " + convertedTemperature + "°F");
	                break;
	            case 2:
	                convertedTemperature = convertToKelvin(celsius);
	                System.out.println("The temperature in Kelvin is: " + convertedTemperature + "K");
	                break;
	            case 3:
	                convertedTemperature = convertToRankine(celsius);
	                System.out.println("The temperature in Rankine is: " + convertedTemperature + "°R");
	                break;
	            default:
	                System.out.println("Invalid choice. Please select a conversion type between 1 and 3.");
	        }

	        scanner.close();
	    }

	    public static double convertToFahrenheit(double celsius) {
	        return (celsius * 9 / 5) + 32;
	    }

	    public static double convertToKelvin(double celsius) {
	        return celsius + 273.15;
	    }

	    public static double convertToRankine(double celsius) {
	        return (celsius + 273.15) * 9 / 5;
	    }
	}

