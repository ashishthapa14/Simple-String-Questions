import java.util.Scanner;

public class Question3 {

    // Count the occurrences of a specific character in a string
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string:");
            String text = scanner.nextLine();

            System.out.println("Enter the character to count:");
            char characterToCount = scanner.next().charAt(0);

            long count = text.chars().filter(ch -> ch == characterToCount).count();

            System.out.println("The character '" + characterToCount + "' appears " + count + " times.");
        }
    }
}