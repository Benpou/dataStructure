package ArrayProblems;

public class TwoPointerSearch {
    public static void main(String[] args) {

        int[] arr = {2, 2, 4, 9, 1, 9, 20, 12, 14};
        int val = 6;
        int arrLength = arr.length;

        int result = twoPointer(arr, val, arrLength);
        System.out.println("Result is : " + result);
    }

    public static int twoPointer(int[] theArr, int value, int theLength) {
        //define you first and last pointer
        int i = 0;
        int j = theLength - 1;

        while ( i < j) {
            if (theArr[i] + theArr[j] == value) {
               return 1;
            } else if (theArr[i] + theArr[j] > value) {
                j--;
            } else {
                i++;
            }
        }
        return 0;
    }
}
