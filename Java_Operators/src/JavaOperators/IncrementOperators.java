package JavaOperators;

import java.util.Scanner;

public class IncrementOperators {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the initial value of x: ");
        int x = scanner.nextInt();

        // Display initial value and results of pre-increment and post-increment
        System.out.println("Initial value of x = " + x);
        System.out.println("Pre-increment: " + (++x)); // Increment first, then print
        System.out.println("Post-increment: " + (x++)); // Print first, then increment
        System.out.println("Final value of x = " + x);

        // Close the scanner
        scanner.close();
    }
}

