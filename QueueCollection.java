import java.util.*;
public class QueueCollection {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Ayush");
        q.add("Garvit");
        q.add("Amit");
        q.add("Ashish");
        q.add("Garima");
        System.out.println("Elements of queue-"+q);
        System.out.println("Removed element- "+q.remove());
        System.out.println("Head of queue- "+q.element());
        System.out.println("poll()- "+q.poll());
        System.out.println("peek()- "+q.peek());
        System.out.println("Elements of queue-"+q);
    }
}
