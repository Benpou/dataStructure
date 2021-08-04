package ArrayProblems;

public class RichestMan {

    public static void main(String[] args) {

        String s = "hello world";

        System.out.println(countLastWord(s));

    }

    public static int countLastWord(String s) {
        if (s.length() == 0) return 0;
        int count = 0;

        int sLen = s.length();
        for (int i = sLen; i > 0; i--) {
            if ( s.charAt(i) != ' ') {
                count +=1;
            }
        }
        return count;
    }
}
