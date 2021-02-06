package ArrayProblems;

public class SearchLinear {
  public static void main(String[] args) {

    int[] arr = {3,7,6,4,3,0,1,0};


    System.out.println(solution(arr));

  }

  // check if arr is mountain arr
  public static boolean solution(int[] arr) {

    int lastAccendNumberPosition = 0;
    boolean resultAccesnding = false;
    boolean resultDecending = false;

   for (int i = 1; i < arr.length; i++) {
     if (arr[i] > arr[i -1]) {
       lastAccendNumberPosition++;
       resultAccesnding = true;
     } else if(arr[i] == arr[i -1]){
       resultAccesnding = false;
       break;
     }
   }

    for (int i = arr.length -1; i > lastAccendNumberPosition; i--) {
      if (arr[i] < arr[i -1]) {
        resultDecending = true;
      } else if(arr[i] == arr[i -1] || arr[i] > arr[i -1]) {
        resultDecending = false;
        break;
      }
    }

    if (resultAccesnding && resultDecending) {
      return true;
    } else {
      return false;
    }


  }


//  public static boolean solution(int[] arr) {
//    if(arr.length == 0 || arr.length == 1) return false;
//
//    for (int i =0 ; i < arr.length; i++) {
//      for (int j = i + 1; j < arr.length; j++) {
//        if(arr[i] == arr[j] * 2 || arr[j] == arr[i] ) {
//          return true;
//        }
//      }
//    }
//    return false;
//  }
}
