package JavaOperators;

import java.util.Scanner;

public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the initial value of x: ");
        int x = scanner.nextInt();

        // Perform compound assignments and display results
        System.out.println("Initial value of x = " + x);
        
        x += 5;
        System.out.println("x += 5 -> " + x);

        x *= 2;
        System.out.println("x *= 2 -> " + x);

        x %= 7;
        System.out.println("x %= 7 -> " + x);

        x -= 3;
        System.out.println("x -= 3 -> " + x);

        x /= 2;
        System.out.println("x /= 2 -> " + x);

        // Close the scanner
        scanner.close();
    }
}

