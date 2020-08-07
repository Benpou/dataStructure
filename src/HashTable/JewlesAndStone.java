package HashTable;

import java.util.HashMap;

// 771
public class JewlesAndStone {

  public static void main(String[] args) {


    System.out.println( numJewelsInStones("ab", "fffffaaaAAccb"));
  }

  public static int numJewelsInStones(String J, String S) {
    HashMap<Character, Integer> map = new HashMap<>();
    int result = 0;
    int x = 0;
    for(int i = 0; i < S.length(); i++) {
      int count = map.getOrDefault(S.charAt(i), 0);
      map.put(S.charAt(i), count + 1);
    }
    for (int i = 0; i < J.length(); i++) {
      if ( map.containsKey(J.charAt(i))) {
        x = map.get(J.charAt(i));
        result = x + result;
      }
    }
    return result;
  }

}
