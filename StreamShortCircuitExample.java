import java.util.Arrays;
import java.util.List;

public class StreamShortCircuitExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Paul", "George", "Ringo","Gerdo","paul","Peter");

        // Short-circuit operation: anyMatch
        boolean anyMatch = names.stream()
                                .anyMatch(name -> name.startsWith("P"));
        System.out.println("Any match: " + anyMatch); // Output: Any match: true

        // Short-circuit operation: findFirst
        String first = names.stream()
                            .filter(name -> name.startsWith("G"))
                            .findFirst()
                            .orElse("No match");
        System.out.println("First match: " + first); // Output: First match: George
    }
}
