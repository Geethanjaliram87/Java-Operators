package JavaOperators;
import java.util.Scanner;

public class LoanQualification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Get user input for income
        System.out.print("Enter your income: ");
        double income = scanner.nextDouble();

        // Check loan qualification conditions
        if (age >= 18 && age <= 65 && income > 30000) {
            System.out.println("Qualifies for loan");
        } else {
            System.out.println("Does not qualify for loan");
        }

        // Close the scanner
        scanner.close();
    }
}
