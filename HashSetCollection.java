import java.util.*;
public class HashSetCollection {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();// this is the unordered set of c++
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: " + set);
        set.add("Gaurav");
        System.out.println("After adding an element: " + set);
        set.remove("Ravi");
        System.out.println("After removing an element: " + set);
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Ajay");
        set2.add("Gaurav");
        set.addAll(set2);
        System.out.println("Updated List: " + set);
        set.removeAll(set2);
        System.out.println("After invoking removeAll() method: " + set);
        set.removeIf(str -> str.contains("Vijay"));
        System.out.println("After invoking removeIf() method: " + set);
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }
}
