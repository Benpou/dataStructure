package ArrayProblems;

public class GreatestElementInTheRight {

  public static void main(String[] args) {

    int [] arr = {17,18,4,5,6,1,7};

int [] x = replaceElements(arr);
    for( int i =0; i < arr.length; i++) {

      System.out.println( x[i]);

    }
  }

  public static int[] replaceElements(int[] arr) {
    int temp =0;
    int max = -1;
    int len = arr.length;
    for (int i = arr.length - 1; i >= 0; i--) {
       temp = arr[i];
        arr[i] = max;
        max = Math.max(max, temp);
    }
    return arr;
  }
}
