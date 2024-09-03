package basics;

import java.util.Scanner; // Import Scanner class

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter the binary number: ");
        String binaryStr = scanner.nextLine(); // Read the binary number as a string

        int ans = 0;
        int power = 1;
        // Iterate over each digit of the binary number string
        for (int i = binaryStr.length() - 1; i >= 0; i--) {
            int digit = binaryStr.charAt(i) - '0'; // Convert char to int
            ans += digit * power; // Calculate decimal equivalent
            power *= 2; // Increment the power of 2
        }
        System.out.println("Decimal equivalent: " + ans);

        scanner.close(); // Close the Scanner object
    }
}
