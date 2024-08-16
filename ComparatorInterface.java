import java.util.*;
public class ComparatorInterface implements Comparator<Person>{
    public static void main(String[] args) {
        
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        Collections.sort(people,new ComparatorInterface());

        for (Person person : people) {
            System.out.println(person.name + " - " + person.age);
        }
    }
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name); // Compare by name
    }
}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
