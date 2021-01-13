package StringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidPrantesis {

  public static void main(String[] args) {

    String s = "[(([()))]";
    System.out.print(isValid(s));
  }

  public static boolean isValid(String s) {

    HashMap<Character, Character> mapping = new HashMap<Character, Character>();
    mapping.put(')', '(');
    mapping.put('}', '{');
    mapping.put(']', '[');
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < s.length(); i++ ) {
      char c = s.charAt(i);
      if (mapping.containsKey(c)) {
        char topElement = stack.empty() ? '#' : stack.pop();

        if (topElement != mapping.get(c)) {
          return false;
        }

      } else {
        stack.push(c);
      }
    }

    return stack.isEmpty();
  }
}
