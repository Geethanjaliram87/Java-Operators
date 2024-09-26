package JavaOperators;
import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Perform bitwise operations
        int andResult = num1 & num2;
        int orResult = num1 | num2;
        int xorResult = num1 ^ num2;

        // Display the results in binary format
        System.out.println("First number (binary): " + Integer.toBinaryString(num1));
        System.out.println("Second number (binary): " + Integer.toBinaryString(num2));
        
        System.out.println("AND result: " + Integer.toBinaryString(andResult));
        System.out.println("OR result: " + Integer.toBinaryString(orResult));
        System.out.println("XOR result: " + Integer.toBinaryString(xorResult));

        // Close the scanner
        scanner.close();
    }
}
