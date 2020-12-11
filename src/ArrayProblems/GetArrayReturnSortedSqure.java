package ArrayProblems;

public class GetArrayReturnSortedSqure {

    public static void main (String[] args) {
        int[] nums = {2, 3, 2, 2, 4, 2,2,1000, 100, 20, 0};
        int[] sortSqr = sortedSquares(nums);

        for(int item : sortSqr) {
            System.out.println(item);
        }


    }
    public static int[] sortedSquares(int[] nums) {
        int[] sqrArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sqrArr[i] = nums[i] * nums[i];
        }
        int[] finalArr = new int[nums.length];
        int tempMax = 0;
        int x = 1;

        for (int i = 1; i < sqrArr.length; i++) {
            for(int j = 0; j < sqrArr.length; j++) {
                if( sqrArr[j] > sqrArr[i]) {
                    tempMax = sqrArr[i];
                    sqrArr[i] = sqrArr[j];
                    sqrArr[j] = tempMax;
                }
            }
        }
        return sqrArr;
    }
}
