package PracticeArray;

public class VarsArgsDemo {
//    public static void main(String[] args) {
//        printMax(34, 2, 5, 6, 1, 90);
//    }

    public double printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.print("Empty array");
            return -1;
        }
        double result = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            result = Math.max(result, numbers[i]);
        }

        //System.out.println("The max value is -> " + result);
        return result;
    }
}
