package RecursionPractice;

import java.util.ArrayList;

public class PascalRecursion {

  public static void main(String[] args) {
    int n = 3;
    ArrayList<Integer> arr = getRow(n);


    for (int i = 0 ; i < arr.size(); i++) {
      if (i==arr.size() - 1) {
        System.out.println(arr.get(i));
      } else {
        System.out.println(arr.get(i) + ",  ");
      }
    }
  }

  public static ArrayList<Integer> getRow(int rowIndex) {
    ArrayList<Integer> currow = new ArrayList<Integer>();

    currow.add(1);

    if (rowIndex == 0) return currow;

    ArrayList<Integer> prev = getRow(rowIndex -1);

    for (int i = 1; i < prev.size(); i++) {
      int curr = prev.get(i-1) + prev.get(i);
      currow.add(curr);
    }
    currow.add(1);
    return currow;
  }

}
