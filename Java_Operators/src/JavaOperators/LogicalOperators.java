package JavaOperators;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0 && number % 2 == 0) {
            System.out.println(number + " is positive and even");
        } else {
            System.out.println(number + " is not positive or not even");
        }
        scanner.close();
    }
}
