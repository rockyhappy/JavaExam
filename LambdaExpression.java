import java.util.*;
public class LambdaExpression {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Rick");
        list.add("Negan");
        list.add("Daryl");
        list.add("Glenn");
        list.add("Carl");
        list.add("Michonne");
        list.add("Maggie");
        // lambda expression to iterate and print list
        list.forEach(names -> System.out.println(names));
        for (String names : list) {
            names = names + "!";
        }
        System.out.println(list);
    }

}
