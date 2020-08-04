package HashTable;

import java.util.HashMap;

public class TestGetOrDefault {
  public static void main(String[] args) {

    HashMap<String, Integer> map = new HashMap<>();
    map.put("1", 0);
    map.put("2", 1);
    map.put("3", 2);
    map.put("4", 3);


    System.out.print("HashMap " + map.toString());

    int k = map.getOrDefault("4", 500) + 1;

    System.out.println("return value " +  k);
    System.out.println("return value " +  map.get("2"));


  }

}
