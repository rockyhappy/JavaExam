import java.util.*;
public class LinkedHashSetCollection {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();// this is the set of c++
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        System.out.println("An initial list of elements: " + set);
        set.add("Gaurav");
        System.out.println("After adding an element: " + set);
        set.remove("Ravi");
        System.out.println("After removing an element: " + set);
        Set<String> set2 = new LinkedHashSet<String>();
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