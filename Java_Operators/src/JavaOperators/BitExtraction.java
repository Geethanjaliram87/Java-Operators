package JavaOperators;
import java.util.Scanner;

public class BitExtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a 32-bit integer (decimal): ");
        int number = scanner.nextInt(); // Read the integer input in decimal

        // Define the mask to extract bits 8 to 15
        int mask = 0xFF; // 0xFF is 11111111 in binary
        int shift = 8; // Shift by 8 bits to the right

        // Extract bits 8 to 15 using shifting and masking
        int extractedBits = (number >> shift) & mask;

        // Output the result in hexadecimal format
        System.out.printf("Extracted bits (8-15) = 0x%02X\n", extractedBits);

        // Close the scanner
        scanner.close();
    }
}

