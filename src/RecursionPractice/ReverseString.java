//package RecursionPractice;
//
//public class ReverseString {
//
//  public static void main(String[] args) {
//
//    char[] s = {'h','e','l','l','o'};
//
//  }
//
//  public static void helper(char[] s, int left, int right) {
//    if (left >= right) return;
//
//    char temp = s[left];
//    s[left++] = s[right];
//    s[right--] = temp;
//    helper(s, left, right);
//  }
//
//  public static void reverseString(char[] s) {
//    helper(s, 0, s.length -1);
//  }
//
//}
//
//  public void helper(char[] s, int left, int right) {
//    if (left >= right) return;
//
//    char temp = s[left];
//    s[left++] = s[right];
//    s[right--] = temp;
//    helper(s, left, right);
//  }
//
//  public void reverseString(char[] s) {
//    helper(s, 0, s.length - 1);
//  }