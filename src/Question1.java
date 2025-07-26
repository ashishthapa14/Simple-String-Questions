import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        System.out.println("Enter a string to reverse:");
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println("Reversed string: " + reversed);
        }
    }
}