package StringFolder;

public class DefangingIpAddress {
  public static void main(String[] args) {

    System.out.print(defangIPaddr("1.1.1.1"));
  }

  public static String defangIPaddr(String address) {
    final StringBuilder defang = new StringBuilder();

    for( char c : address.toCharArray()) {
      if(c == '.') {
        defang.append("[.]");
      }else {
        defang.append(c);
      }
    }
    return defang.toString();
  }
}
