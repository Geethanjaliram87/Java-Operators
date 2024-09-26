package JavaOperators;
import java.util.Scanner;

class ComplexNumber {
    private double real; // Real part
    private double imaginary; // Imaginary part

    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Method to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to display the complex number
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

public class ComplexNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: First complex number
        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);

        // Input: Second complex number
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        // Perform arithmetic operations
        ComplexNumber sum = complex1.add(complex2);
        ComplexNumber difference = complex1.subtract(complex2);
        ComplexNumber product = complex1.multiply(complex2);

        // Output: Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        // Close the scanner
        scanner.close();
    }
}

