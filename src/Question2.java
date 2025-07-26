import java.util.Scanner;

public class Question2 {

    // Check if a string is a palindrome
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it's a palindrome:");
        try (Scanner scanner = new Scanner(System.in)) {
            String original = scanner.nextLine();

            // Clean the string by removing non-alphanumeric characters and converting to lower case
            String cleaned = original.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            String reversed = new StringBuilder(cleaned).reverse().toString();

            if (cleaned.equals(reversed)) {
                System.out.println("\"" + original + "\" is a palindrome.");
            } else {
                System.out.println("\"" + original + "\" is not a palindrome.");
            }
        }
    }
}