import java.util.*;
public class StackCollection {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("Ayush");
        st.push("Garvit");
        st.push("Amit");
        st.push("Ashish");
        st.push(1);
        st.push("Garima");
        st.pop();
        Iterator itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        st.pop();
        System.out.println("After removing top element");
        Iterator itr2 = st.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        System.out.println("Top element is: " + st.peek());
    }
}
