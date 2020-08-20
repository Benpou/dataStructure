package RecursionPractice;

import java.util.Scanner;

public class TowToPwerOfN {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a non-negative integer");
    int n = input.nextInt();

    System.out.println(twoToPowerOfN(n));

  }

  public static int twoToPowerOfN(int n) {
    if (n == 0 ) {
      return 1;
    } else if ( n == 1) {
      return 2;
    } else {
      return 2 * twoToPowerOfN(n - 1);
    }
  }
}
