import java.util.*;
public class TreeMapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>();// this always stores the values in the sorted order
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, null);
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        map.put(100,"golang");
        System.out.println("After updating the value of key 100");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
