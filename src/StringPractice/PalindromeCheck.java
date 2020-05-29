package StringPractice;
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt to enter string
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        if(isPalindrome(s)) {
            System.out.println( s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() -1;

        while (low < high) {
            if(s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
