package JavaOperators;
import java.util.Scanner;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        // Create scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Use the ternary operator to determine if the number is positive, negative, or zero
        String result = (number > 0) ? number + " is positive" :
                        (number < 0) ? number + " is negative" :
                        number + " is zero";

        // Output the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}

