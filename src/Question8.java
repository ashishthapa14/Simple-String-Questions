import java.util.Scanner;

public class Question8 {

    // Check if a string contains only digits
    public static void main(String[] args) {
        System.out.println("Enter a string to check if it contains only digits:");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            // Using regular expression to check for digits
            if (input != null && input.matches("\\d+")) {
                System.out.println("The string contains only digits.");
            } else {
                System.out.println("The string contains non-digit characters.");
            }
        }
    }
}