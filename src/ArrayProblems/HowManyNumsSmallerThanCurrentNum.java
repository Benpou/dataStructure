package ArrayProblems;

public class HowManyNumsSmallerThanCurrentNum {

  public static void main(String[] args) {
    int[] nums = {8,1,2,2,3,1,8};
    int printResult[] = smallerNumbersThanCurrent(nums);

    for(int i : printResult ) {
      System.out.println(i);

    }
  }
  public static int[] smallerNumbersThanCurrent(int[] nums) {
    int[] counts = new int[11];
    for(int value : nums) {
      counts[value]++;
    }

    int[] cumulativeCounts = new int[11];
    int cumulativeSum = 0;
    for (int i = 0; i <=10; i++) {
      if (counts[i] > 0) {
        cumulativeSum += counts[i];
        cumulativeCounts[i] = cumulativeSum;
      }
    }

    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = cumulativeCounts[nums[i]] - counts[nums[i]];
    }
    return result;
  }

}
