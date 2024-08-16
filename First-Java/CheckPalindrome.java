import java.util.Locale;
import java.util.Scanner;

public class CheckPalindrome {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a word to check if it is a Palindrome: ");
        String word = sc.next().toLowerCase();
        StringBuilder reversed_word = new StringBuilder();

        for (int i = word.length() - 1 ; i >= 0; i--) {
            reversed_word.append(word.charAt(i));
        }
        String final_string = reversed_word.toString();
//        System.out.println(final_string);
        if (word.equals(final_string)) {
            System.out.println("The word " + word + " is a Palindrome!");
        }
        else {
            System.out.println("The word " + word + " is not a Palindrome!");
        }
    }
}
