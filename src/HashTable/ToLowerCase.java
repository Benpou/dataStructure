package HashTable;

import java.util.HashMap;

public class ToLowerCase {
  public static void main(String[] args) {
    System.out.print(toLowerCase("HEdLO"));
  }

  public static String toLowerCase(String str) {
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    HashMap<Character, Character> map = new HashMap<>();
    for (int i = 0; i < 26; i++) {
      map.put(upper.charAt(i), lower.charAt(i));
    }

    StringBuilder sb = new StringBuilder();
    for (Character x : str.toCharArray()) {
      sb.append(map.containsKey(x) ? map.get(x) : x);
    }
    return sb.toString();
  }
}
