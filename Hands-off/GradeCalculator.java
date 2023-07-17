package loop;
import java.util.Scanner;
/*
 * Prompt the user to enter a numerical grade (0-100).
Use a switch case statement to determine the corresponding letter grade based on the following scale:
90-100: A
80-89: B
70-79: C
60-69: D
0-59: F
Display the letter grade to the user.
Handle input validation to ensure the grade is within the valid range.
 */
public class GradeCalculator 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter your numerical grade (0-100): ");
        int grade = scanner.nextInt();

        // Validate the input
        while (!validateGrade(grade)) {
            System.out.println("Invalid grade. Please enter a number between 0 and 100.");
            System.out.print("Enter your numerical grade (0-100): ");
            grade = scanner.nextInt();
        }

        // Calculate and display the letter grade
        String letterGrade = calculateGrade(grade);
        System.out.println("Your letter grade is: " + letterGrade);

        scanner.close();
    }

    public static String calculateGrade(int score) {
        String letterGrade;
        switch (score / 10) {
            case 10:
            case 9:
                letterGrade = "A";
                break;
            case 8:
                letterGrade = "B";
                break;
            case 7:
                letterGrade = "C";
                break;
            case 6:
                letterGrade = "D";
                break;
            default:
                letterGrade = "F";
                break;
        }
        return letterGrade;
    }

    public static boolean validateGrade(int score) {
        return score >= 0 && score <= 100;
    }
}
        	
       
