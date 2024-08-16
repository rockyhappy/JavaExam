import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Paul", "George", "Ringo", "John");

        // Intermediate operations: filter, distinct, and sorted
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith(name.substring(0, 1)))
                                   .distinct()
                                   .sorted()
                                   .collect(Collectors.toList());

        System.out.println(result); // Output: [John]

        // Intermediate operations: map
        List<String> upperCaseNames = names.stream()
                                           .map(name -> name.toUpperCase())
                                           .collect(Collectors.toList());
        System.out.println(upperCaseNames); // Output: [JOHN, PAUL, GEORGE, RINGO, JOHN]
    }
}
