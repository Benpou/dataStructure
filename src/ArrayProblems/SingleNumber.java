package ArrayProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber {

  public static void main(String[] args) {
    int[] nums = {1,1,2,3,2};

    System.out.println(solution(nums));

  }
   public static int solution(int[] nums) {
     List<Integer> no_duplicate_list = new ArrayList<>();

     for(int i : nums) {

       if(!no_duplicate_list.contains(i)) {
         no_duplicate_list.add(i);
       } else {
         no_duplicate_list.remove(new Integer(i));
       }
     }
     return no_duplicate_list.get(0);
   }

   public static int hashtableSolution(int[] nums) {
     HashMap<Integer, Integer> hash_table = new HashMap<>();

     for (int i : nums) {
       hash_table.put(i, hash_table.getOrDefault(i,0) + 1);
     }

     for (int i : nums) {
       if (hash_table.get(i) == 1) {
         return i;
       }
     }
    return 0;
   }
}
