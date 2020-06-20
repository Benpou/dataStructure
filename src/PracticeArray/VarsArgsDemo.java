package PracticeArray;

public class VarsArgsDemo {
    public static void main(String[] args) {
        printMax(34, 2, 5, 6, 1, 90);
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.print("Empty array");
            return;
        }
        double result = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            result = Math.max(result, numbers[i]);
        }

        System.out.println("The max value is -> " + result);
    }
}
