package JavaOperators;
import java.util.Scanner;

public class OperatorPrecedenceExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter values for a, b, c, d, and e
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value for b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value for c: ");
        int c = scanner.nextInt();
        System.out.print("Enter value for d: ");
        int d = scanner.nextInt();
        System.out.print("Enter value for e: ");
        int e = scanner.nextInt();

        // Evaluate the expression according to operator precedence
        int result = a + (b * c) - (d / e);

        // Output the expression and the result
        System.out.println(a + " + (" + b + " * " + c + ") - (" + d + " / " + e + ") = " + result);
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

