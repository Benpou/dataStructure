package TwoSumDemo;

import java.util.HashMap;
import java.util.Map;

public class TryTwoSum {
    public static void main(String[] args) {

        int[] data = new int[]{2, 2, 5, 4};
        int[] result = twoSum(data, 4);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            myMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (myMap.containsKey(complement)) {
                int[] result = new int[]{i, myMap.get(complement)};
                return result;
            }
        }
        throw new IllegalArgumentException("no result");
    }
}
