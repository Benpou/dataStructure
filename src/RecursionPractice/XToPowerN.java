package RecursionPractice;

import java.util.Scanner;

public class XToPowerN {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter n as power non-negative integer");
    int n = input.nextInt();

    System.out.println("Enter  x as base for calculation integer");
    int x = input.nextInt();


    System.out.println(xToPowerOfN(n, x));

  }


  public static int xToPowerOfN(int x, int n) {
    if (n == 0 ) {
      return 1;
    } else if ( n == 1) {
      return x;
    } else {
      return x * xToPowerOfN(x, n - 1);
    }
  }
}
