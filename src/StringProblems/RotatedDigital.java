package StringProblems;

import java.util.HashMap;
import java.util.HashSet;

public class RotatedDigital {
  public static void main(String[] args) {
    System.out.println(rotatedDigits(27));
  }

  public static int rotatedDigits(int N) {
    int result = 0;
    for (int i = 1; i < N; i++) {
      int j = i;
      boolean contain347 = false;
      boolean contain2569 = false;

      while (j != 0) {
        int mod = j % 10;
        if ( mod == 2 || mod == 5 || mod == 6 || mod == 9) {
          contain2569 = true;
        }
        if ( mod == 3 || mod == 4 || mod == 7) {
          contain347 = true;
        }
        j = j / 10;
      }
      if ( !contain347 && contain2569 ) {
        result++;
      }
    }
    return result;

  }
}
