package JavaOperators;
import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter value for a : ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b : ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c : ");
        int c = scanner.nextInt();
        System.out.print("Enter value for d : ");
        int d = scanner.nextInt();
        System.out.print("Enter value for e : ");
        int e = scanner.nextInt();

        // Evaluate expression without parentheses
        int resultWithoutParentheses = a + b * c - d / e + b * c;

        // Evaluate expression with parentheses
        int resultWithParentheses = a + (b * c) - ((d / e) + b) * c;

        // Output the results
        System.out.println("Expression without parentheses: " + a + " + " + b + " * " + c + " - " + d + " / " + e + " + " + b + " * " + c + " = " + resultWithoutParentheses);
        System.out.println("Expression with parentheses: " + a + " + (" + b + " * " + c + ") - ((" + d + " / " + e + ") + " + b + ") * " + c + " = " + resultWithParentheses);

        // Close the scanner
        scanner.close();
    }
}
