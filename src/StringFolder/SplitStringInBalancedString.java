package StringFolder;

// #1221
public class SplitStringInBalancedString {
  public static void main(String[] args) {

    String s = "RL";
    System.out.print(balancedStringSplit(s));
  }
  public static int balancedStringSplit(String s) {
    int count = 0;
    int balance = 0;
    for (char c : s.toCharArray()) {
      count += ((c == 'R') ? ++balance : --balance) == 0 ? 1 : 0;
    }
    return count;
  }
}
