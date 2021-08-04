package RecursionPractice;

public class PascalImplementation {

  public static void main(String[] args) {
    for (int x = 0; x<6; x++) {
      for (int sp=6; sp-x > 1; sp--) {
        System.out.println(" ");
      }
      for (int y = 0; y <= x; y++) {
        System.out.println(pascal(x, y) + "  ");
      }
      System.out.println();
    }
  }


  public static int pascal(int row, int col) {
    if (col == 0 || col == row) {
      return 1;
    } else {
      return pascal(row - 1, col -1) + pascal(row -1 ,col);
    }
  }
}
