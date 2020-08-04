package StringFolder;

public class ShuffleString {
  public static void main(String[] args) {
    int[] arr =new int[] {0,2,1};
    System.out.print(restoreString("Hel", arr));
  }

  public static String restoreString(String s, int[] indices) {
    char[] tempArr =new char[s.length()];

    for(int i =0; i < s.length(); i++) {
      tempArr[indices[i]] = s.charAt(i);
    }
    String xx = new String(tempArr);
    return xx;
  }
}
