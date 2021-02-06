package ArrayProblems;

public class Deletion {

  public static void main(String[] args) {

    int[] nums = {1,2,2,4, 5};

    int result = solution(nums, 2);

    //System.out.println("Index " + result + "contains: " + result);
//
    for (int i = 0; i< result; i++) {

      System.out.println("Index " + i + "contains: " + nums[i]);
    }

  }

  // Remove duplicated number and return array in-place

  public static int solution(int[] nums, int val) {
    if (nums.length == 0) return 0;
    int i = 0;

    for (int j = 1; j < nums.length; j++) {
      if (nums[j] != nums[i]) {
        i++;
        nums[i] = nums[j];
      }
    }
    return i + 1;


  }




  // solution 2: swap the val with the last element since the order does not matter

//  public static int solution(int[] nums, int val) {
//    int i = 0;
//    int n = nums.length;
//
//    while (i < n) {
//      if(nums[i] == val) {
//        nums[i] = nums[i - 1];
//        n--;
//      } else {
//        i++;
//      }
//    }
//    return n;
//  }



// solution move all numbers
//  public static int solution(int[] nums, int val) {
//    int i = 0;
//    for (int j = 0; j < nums.length; j++) {
//      if (nums[j] != val) {
//        nums[i] = nums[j];
//        i++;
//      }
//    }
//    return i;
//  }

}
