package ArrayProblems;

public class RemoveDuplicationSortedArray {

  public static void main(String[] args) {

    int[] arr = {17, 17, 4, 5, 6, 7, 7};

    int x = removeDuplicat(arr);
    for (int i = 0; i < x; i++) {

      System.out.println(arr[i]);

    }
  }
    public static int removeDuplicat(int[] arr) {
      if (arr.length == 0) return 0;

      int i = 0;

      for (int j =1; j < arr.length; j++) {
        if (arr[j] != arr[i] ) {
          i++;
          arr[i] = arr[j];
        }
      }
      return i + 1;
    }
}

