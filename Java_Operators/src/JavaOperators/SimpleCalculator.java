package JavaOperators;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Input: Second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input: Operator
        System.out.print("Enter an operator (+, -, *, /, %, ^): ");
        char operator = scanner.next().charAt(0);

        double result;

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                result = num1 % num2;
                System.out.printf("%.2f %% %.2f = %.2f\n", num1, num2, result);
                break;
            case '^':
                result = Math.pow(num1, num2);
                System.out.printf("%.2f ^ %.2f = %.2f\n", num1, num2, result);
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }

        // Close the scanner
        scanner.close();
    }
}
