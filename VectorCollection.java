import java.util.*;
import java.lang.*;
import java.io.*;
public class VectorCollection {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.addElement("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        v.remove("Amit");
        System.out.println("After removing Amit");
        for (String obj : v)
            System.out.println(obj);

        Vector<String> v2 = new Vector<String>();
        v2.add(0,"Ashish");
        v2.add(0,"Garima");
        v.removeAll(v2);
        System.out.println("After removing v2 from v");
        for (String obj : v)
            System.out.println(obj);
     
        Vector v3 = new Vector();
        v3.add(1);
        v3.add("Ayush");
        Object n = v3.get(1);
        System.out.println(n);
    }
}
