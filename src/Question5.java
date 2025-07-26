import java.util.Scanner;

public class Question5
{
    //Remove duplicate from String;
    public static void main(String[] args) {
        String word = new Scanner(System.in).nextLine();

        String resultString = word.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(resultString);

    }
}
