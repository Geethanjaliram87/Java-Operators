package JavaOperators;
import java.util.Scanner;

public class GameSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Player's health, shield status, and lives
        System.out.print("Enter player's health (0 or greater): ");
        int health = scanner.nextInt();

        System.out.print("Does the player have a shield? (true/false): ");
        boolean shield = scanner.nextBoolean();

        System.out.print("Enter number of lives left (0 or greater): ");
        int lives = scanner.nextInt();

        // Determine if the player is alive
        boolean isAlive = health > 0 || shield || lives > 0;

        // Output: Player's status
        if (isAlive) {
            System.out.println("Player is alive.");
        } else {
            System.out.println("Player is dead.");
        }

        // Close the scanner
        scanner.close();
    }
}
