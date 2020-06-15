package PracticeArray;

import java.util.Scanner;

public class LottoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] isCovered = new boolean[99];
        //Read each number
        int number = input.nextInt();
        while (number !=0) {
            isCovered[number - 1 ] = true;
            number = input.nextInt();
        }
        boolean allCovered = true;
        for (int i=0; i< isCovered.length; i++) {
            if(!isCovered[i]) {
                allCovered = false;
                break;
            }
        }

        if (allCovered) {
            System.out.println("ticket cover all number");
        }  else {
            System.out.println("ticket busted");
        }

    }
}
