import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question4 {

    // Find duplicate characters in a string
    public static void main(String[] args) {
        System.out.println("Enter a string to find duplicate characters:");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();

            Map<Character, Integer> charCounts = new HashMap<>();
            for (char c : input.toCharArray()) {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }

            System.out.println("Duplicate characters:");
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                if (entry.getValue() > 1) {
                    System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times.");
                }
            }
        }
    }
}