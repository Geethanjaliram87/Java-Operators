package JavaOperators;
import java.util.Scanner;

public class CompoundAssignmentArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        // Input: Array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Input: Operator and value
        System.out.print("Enter an operator (+=, -=, *=, /=, %=): ");
        String operator = scanner.next();
        System.out.print("Enter a value: ");
        int value = scanner.nextInt();

        // Apply the compound assignment operator
        for (int i = 0; i < size; i++) {
            switch (operator) {
                case "+=":
                    numbers[i] += value;
                    break;
                case "-=":
                    numbers[i] -= value;
                    break;
                case "*=":
                    numbers[i] *= value;
                    break;
                case "/=":
                    // Avoid division by zero
                    if (value != 0) {
                        numbers[i] /= value;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case "%=":
                    // Avoid division by zero
                    if (value != 0) {
                        numbers[i] %= value;
                    } else {
                        System.out.println("Modulo by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +=, -=, *=, /=, or %=");
                    return; // Exit if the operator is invalid
            }
        }

        // Output: Modified array
        System.out.print("Modified array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}

