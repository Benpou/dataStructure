package NumberOfGoodPairs;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
  public static void main(String[] args) {

    int[] testArr = new int[] {1,2,3,1,1,3};
    System.out.print(numIdenticalPairs(testArr));


  }

  public static  int numIdenticalPairs(int[] nums) {
    int res = 0;
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) +1);
      res += map.get(num) - 1;
    }
    return res;
  }

}

