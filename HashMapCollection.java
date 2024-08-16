import java.util.*;
public class HashMapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();// this is unordered map of c++
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
