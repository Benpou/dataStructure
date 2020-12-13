package ArrayProblems;

public class DuplicatedZero {

  public static void main(String[] args) {
    int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
//[9,9,9,4,8,0,0,3,7,2,0,0,0,0,9,1,0,0,1,1,0,5,6,3,1,6,0,0,2,3,4,7,0,3,9,3,6,5,8,9,1,1,3,2,0,0,7,3,3,0,5,7,0,8,1,9,6,3,0,8,8,8,8,0,0,5,0,0,0,3,7,7,7,7,5,1,0,0,8,0,0]
//[1,0,2,3,0,4,5,0]
    int countZero = 0;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        countZero++;
      }
    }
    System.out.println(" number of zero " + countZero);
    System.out.println(" Array length : " + arr.length);

    int[] x = duplicateZeros(arr);
    for (int i = 0; i < arr.length; i++) {
      System.out.print(x[i] + " , ");
    }
  }

  // Time complexity of O(N) and space complexity of O(1)
  public static int[] duplicateZeros(int[] arr) {
    int possibleDups = 0;
    int length_ = arr.length - 1;

    //pay attention to this :  left <= length_ - possibleDups
    //this wont let the loop go all the way to the end
    for (int left = 0; left <= length_ - possibleDups; left++) {
      if (arr[left] == 0) {
        if (left == length_  - possibleDups) {
          arr[length_] = 0;
          length_ -= 1;
//          break;
        }
        possibleDups++;
      }
    }
    int last = length_ - possibleDups;
    for(int i = last; i >= 0; i--) {
      if(arr[i] == 0) {
        arr[i + possibleDups] = 0;
        possibleDups--;
        arr[i + possibleDups] = 0;
      } else {
        arr[i + possibleDups] = arr[i];
      }
    }
    return arr;
  }

// Time cmplexity of O(N^2)
  public static int[] approcheone(int[] arr) {
    int arrLength = arr.length;
    int temp;

    for (int i = 0; i < arrLength; i++) {
      if (arr[i] == 0) {
        for (int j = arrLength - 1; j > i; j--) {
          arr[j] = arr[j - 1];
        }
        i++;
      }
    }
    return arr;
  }
}
