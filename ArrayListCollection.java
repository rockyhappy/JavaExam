import java.lang.reflect.Array;
import java.util.*;

class ArrayListCollection {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add("Ravi");// Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        // Traversing list through Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        list.remove("Ravi");
        System.out.println("After removing Ravi");
        // Traversing list through for-each loop
        for (String obj : list)
            System.out.println(obj);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Ravi");
        list2.add("Vijay");
        list2.add("Kiran");
        list.removeAll(list2);
        System.out.println("After removing list2 from list");
        for (String obj : list)
            System.out.println(obj);
        
        list.add(1,"rachit");
        list.set(1, "For");
        list.set(1,list2.get(2));
        System.out.println("After adding rachit at index 1");
        for (String obj : list)
            System.out.println(obj);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        Integer n = list3.get(0);
        System.out.println(n);
    }
}