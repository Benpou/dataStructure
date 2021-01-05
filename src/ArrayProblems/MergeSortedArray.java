package ArrayProblems;

public class MergeSortedArray {

  // Time complexity: O(n+m)
  // space : O(n1 + n2)
  public static void main(String[] args) {

    int[] arr1 = {1, 10, 0 ,0,0};
    int[] arr2= {2,5,6};
    int n = 2;
    int m = 3;
    int[] arr3 = new int[n + m];

    //solution1(arr1,n, arr2,m, arr3);
    
    solution2(arr1, n, arr2, m);

    System.out.print("Array after merging:");

//    for(int i=0; i < arr3.length; i++) {
//      System.out.print(arr3[i] + " ");
//    }
    for(int i=0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }

  }


  public static void solution2(int[] nums1, int m, int[] nums2, int n){

    int runner1 = m - 1;
    int runner2 = n - 1;
    int resultRunner = m + n - 1;

    /*
     * Filling from the right, because if we would
     * do that from the left, we would need to shift
     * elements in the nums1.
     */
    while (runner1 >= 0 && runner2 >= 0) {
      if (nums1[runner1] > nums2[runner2]) {
        nums1[resultRunner] = nums1[runner1];

        runner1--;
      } else {
        nums1[resultRunner] = nums2[runner2];

        runner2--;
      }

      resultRunner--;
    }

    /*
     * We only concerned about nums2 now, because
     * if there are some unprocessed elements in nums1,
     * they are already at their correct places.
     */
    while (runner2 >= 0) {
      nums1[resultRunner] = nums2[runner2];

      runner2--;
      resultRunner--;
    }
  }


  public static void solution1(int[] nums1, int n, int[] nums2, int m, int[] arr3) {
    int i = 0, j=0, k = 0;

    while ( i < m && j < n) {
      if(nums1[i] < nums2[j]) {
        arr3[k] = nums1[i];
        k++;
        i++;
      } else {
        arr3[k++] = nums2[j++];
      }
    }
    while (i < m && nums1[i] != 0) {
      arr3[k++] = nums1[i++];
    }

    while ( j < n && nums2[j] != 0) {
      arr3[k++] = nums2[j++];
    }

  }
}
