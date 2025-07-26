import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Question7 {

    // Find the first non-repeated character in a string
    public static void main(String[] args) {
        System.out.println("Enter a string to find the first non-repeated character:");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            // Use LinkedHashMap to maintain insertion order of characters
            Map<Character, Integer> charCounts = new LinkedHashMap<>();
            for (char c : input.toCharArray()) {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }

            Character firstNonRepeated = null;
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                if (entry.getValue() == 1) {
                    firstNonRepeated = entry.getKey();
                    break;
                }
            }

            if (firstNonRepeated != null) {
                System.out.println("The first non-repeated character is: '" + firstNonRepeated + "'");
            } else {
                System.out.println("No non-repeated characters found in the string.");
            }
        }
    }
}