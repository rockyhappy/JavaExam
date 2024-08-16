import java.util.*;
public class TreeSetCollection {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        set.remove("Ravi");
        System.out.println("After removing Ravi");
        for (String obj : set)
            System.out.println(obj);
    }
}
