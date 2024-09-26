	package JavaOperators;
	import java.util.Scanner;
	
	public class BitwiseFlagging {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	
	        // Get user input for the initial flag settings
	        System.out.print("Enter an 8-bit number (as an integer): ");
	        int flags = scanner.nextInt();
	
	        System.out.println("Initial flags: " + String.format("%08d", Integer.parseInt(Integer.toBinaryString(flags))));
	
	        // Toggle a specific bit (1 for vibration in this case, bit 1)
	        int bitToToggle = 1; // Bit position to toggle (0 for sound, 1 for vibration, etc.)
	        
	        // Toggle the bit using XOR operator
	        flags ^= (1 << bitToToggle); // Toggle the vibration flag
	
	        // Output the new flags
	        System.out.println("After toggling bit " + bitToToggle + ": " + String.format("%08d", Integer.parseInt(Integer.toBinaryString(flags))));
	
	        // Close the scanner
	        scanner.close();
	    }
	}
