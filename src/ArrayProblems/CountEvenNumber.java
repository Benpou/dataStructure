package ArrayProblems;

public class CountEvenNumber {

    public static void main(String[] args) {
        int[] nums = {11, 121, 101, 3333};
        int printResult = findNumbers(nums);

        System.out.println(printResult);
    }
    public static int findNumbers(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            int number = nums[i];
            int count = 0;

            while (number / 10 != 0) {
                count = count +1;
                number = number / 10;
            }
            if (count % 2 != 0) {
                result = result +1;
            }
        }
        return result;
    }

}
