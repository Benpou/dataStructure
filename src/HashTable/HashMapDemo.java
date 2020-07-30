package HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();

        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        for(Map.Entry<String, Integer> em : hm.entrySet()) {
            System.out.println("key = " +  em.getKey() + " &  value " + em.getValue());
        }
    }
}
