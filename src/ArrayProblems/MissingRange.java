package ArrayProblems;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingRange {

  public static void main(String[] args) {

    int[] nums = {1,4, 10};
    int lower= -4;
    int upper = 20;
    Solution s1 = new Solution();
    System.out.println(s1.findMissingRanges(nums, lower, upper));
  }
}

class Solution {
  public Object findMissingRanges(int[] nums, int lower, int upper) {

    int n = nums.length;
    List<String> missingRanges = new ArrayList<String>();

    if (n == 0) {
      return Collections.singletonList(formatRange(lower, upper));
    }

    // edge case 1: if missing range is at the begining
    if (nums[0] > lower)  {
      missingRanges.add(formatRange(lower, nums[0]-1));
    }

    // missing range
    for (int i = 1; i < n; i++) {
      if (nums[i] - nums[i -1] > 1) {
        missingRanges.add(formatRange(nums[i - 1] + 1, nums[i] -1 ));
      }
    }

    //edge case 2: if missing range is at the end
    if (nums[n - 1] < upper) {
      missingRanges.add(formatRange(nums[n -1] + 1, upper));
    }



    return missingRanges;
  }

  //format range in request format
  String formatRange (int lower, int upper) {
    if (lower == upper) {
      return String.valueOf(lower);
    } else {
      return lower + "->" + upper;
    }
  }
}