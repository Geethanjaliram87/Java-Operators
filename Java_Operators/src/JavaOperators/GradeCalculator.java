package JavaOperators;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Percentage score
        System.out.print("Enter the percentage score (0-100): ");
        int score = scanner.nextInt();

        // Using ternary operator to determine the grade
        String grade = (score >= 90 && score <= 100) ? "A" :
                       (score >= 80 && score < 90) ? "B" :
                       (score >= 70 && score < 80) ? "C" :
                       (score >= 60 && score < 70) ? "D" :
                       (score >= 0 && score < 60) ? "F" :
                       "Invalid score";

        // Output: Display the grade
        System.out.println("Grade = " + grade);

        // Close the scanner
        scanner.close();
    }
}

