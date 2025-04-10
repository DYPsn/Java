import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // 1. Using ArrayList (List)
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate allowed in List

        System.out.println("ArrayList (List):");
        for (String name : names) {
            System.out.println(name);
        }

        // 2. Using HashSet (Set)
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate will be ignored in Set

        System.out.println("\nHashSet (Set):");
        for (int number : numbers) {
            System.out.println(number);
        }

        // 3. Using HashMap (Map - key-value pairs)
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Alice", 85);
        marks.put("Bob", 90);
        marks.put("Charlie", 75);
        marks.put("Alice", 95); // Overwrites the previous value for Alice

        System.out.println("\nHashMap (Map):");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
