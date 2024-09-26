package JavaOperators;
import java.util.Scanner;

public class ComplexExpressionEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Decimal number (double)
        System.out.print("Enter a decimal number (double): ");
        double a = scanner.nextDouble();

        // Input: Integer number
        System.out.print("Enter an integer number: ");
        int b = scanner.nextInt();

        // Evaluate the complex expression
        int result = (int)(a / b) + (int)(a % b) * b;

        // Output the result
        System.out.println("(int) (a / b) + (int) (a % b) * b = " + result);

        // Close the scanner
        scanner.close();
    }
}

