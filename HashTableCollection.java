import java.util.*;
public class HashTableCollection {
    public static void main(String[] args) {
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
        hm.put(100, "Amit");
        hm.put(null, "Ravi");
        hm.put(101, "Vijay");
        hm.put(103, "Rahul");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

class Student {
    int roll;
    String name;
    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    voi
}