package StringFolder;

public class ParantesisBalanceNumber {

  public static void main(String[] args) {

    System.out.print(isParantesisBalance("(((()))))"));

  }

  public static boolean isParantesisBalance(String prantesis ) {
    int balance = 0;
    boolean count = false;
    for (char c : prantesis.toCharArray()) {
      count = ((c == '(') ? ++balance : --balance) == 0 ? true : false;
    }
    if(count) {
      return true;
    } else {
      return false;
    }
  }
}
