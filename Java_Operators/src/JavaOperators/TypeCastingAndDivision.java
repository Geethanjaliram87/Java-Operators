package JavaOperators;
import java.util.Scanner;

public class TypeCastingAndDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int denominator = scanner.nextInt();

        // Perform integer division
        int intResult = numerator / denominator;
        
        // Perform floating-point division using type casting
        double floatResult = (double) numerator / denominator;

        // Output the results
        System.out.println("Integer division = " + intResult);
        System.out.println("Floating-point division = " + floatResult);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
