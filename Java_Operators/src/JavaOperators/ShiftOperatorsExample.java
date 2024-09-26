package JavaOperators;
import java.util.Scanner;

public class ShiftOperatorsExample {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Perform left shift and right shift operations
        int leftShiftBy1 = number << 1; // Left shift by 1
        int leftShiftBy2 = number << 2; // Left shift by 2
        int rightShiftBy1 = number >> 1; // Right shift by 1
        int rightShiftBy2 = number >> 2; // Right shift by 2

        // Output the results
        System.out.println("Left shift by 1 = " + leftShiftBy1);
        System.out.println("Left shift by 2 = " + leftShiftBy2);
        System.out.println("Right shift by 1 = " + rightShiftBy1);
        System.out.println("Right shift by 2 = " + rightShiftBy2);

        // Close the scanner
        scanner.close();
    }
}

