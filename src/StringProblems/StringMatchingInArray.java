package StringProblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInArray {
  public static void main(String[] args) {
    String[] a = new String[]{"helllo", "lo", "kim"};
    System.out.println(stringMatching(a));
  }

  public static List<String> stringMatching(String[] words) {

    Set<String> result = new HashSet<>();
    for( String word : words) {
      for(String word2 : words) {
        if(!word.equals(word2) && !result.contains(word2) && word.indexOf(word2) != -1) {
          result.add(word2);
        }
      }
    }
    return new ArrayList(result);
  }
}
