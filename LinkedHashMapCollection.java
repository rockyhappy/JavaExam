import java.util.*;
public class LinkedHashMapCollection {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();// this is ordered map of c++
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
