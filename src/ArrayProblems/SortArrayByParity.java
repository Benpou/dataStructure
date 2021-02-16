package ArrayProblems;

public class SortArrayByParity {

  public static void main(String[] args) {
    int[] arr = {17, 17, 4, 5, 6, 7, 7};

    int[] y = sortArrayByParity(arr);
    for (int i = 0; i < y.length; i++) {

      System.out.println(y[i]);

    }  }

  public static int[] sortArrayByParity(int[] A) {

    int[] arr = new int[A.length];

    int x = A.length;
    int j = 0;
    for (int i = 0; i < A.length; i++) {

      if (A[i] % 2 == 0) {
        arr[j] = A[i];
        j++;
      } else {
        arr[x - 1] = A[i];
        x--;
      }
    }
    return arr;

  }
}
