public class Palindrome {
    public static void main(String[] args) {

        boolean result = isPalindrome(121);
        System.out.print(result);

    }

    public static boolean isPalindrome(int x) {
        //edge case and inital check
        int holdXValue = x;
        int result = 0;

        if (x < 0 ) return false;
        while(x != 0 ) {
            result = result * 10 + x % 10;
            x = x / 10;
        }

        return result == holdXValue;
//        if (result  == holdXValue) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
