package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class FisrtUniqeChar {

    public static void main(String[] args) {

        String s = "HellHo";
        System.out.println(firstUniqChar(s));
    }


    public static int firstUniqChar(String s) {

        Map<Character, Integer> count = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
