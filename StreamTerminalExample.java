import java.util.Arrays;
import java.util.*;

public class StreamTerminalExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Paul", "George", "Ringo");

        // Terminal operation: forEach
        names.stream()
             .forEach(s-> System.out.println(s));

        // Terminal operation: count
        long count = names.stream().count();
        System.out.println("Count: " + count); // Output: Count: 4
    }
}
