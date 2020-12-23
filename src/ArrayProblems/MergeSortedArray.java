package ArrayProblems;

public class MergeSortedArray {

  // Time complexity: O(n1+n2)
  // space : O(n1 + n2)
  public static void main(String[] args) {

    int[] arr1 = {1,2,3, 0 ,0,0};
    int[] arr2= {2,5,6};
    int n = 3;
    int m = 3;
    int[] arr3 = new int[n + m];

    solution1(arr1,n, arr2,m, arr3);

    System.out.print("Array after merging:");

    for(int i=0; i < arr3.length; i++) {
      System.out.print(arr3[i] + " ");
    }

  }


  public static void soluion2(int[] nums1, int n, int[] nums2, int m, int[] arr3){



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
