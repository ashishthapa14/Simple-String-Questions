import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        //count vowels and Consonants
        int vowels = 0, consonants = 0;
        String word = new Scanner(System.in).nextLine();
        for(char ch: word.toLowerCase().toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                vowels++;
            }
            else if(Character.isLetter(ch)){
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + " Consonants: " + consonants);
    }
}
