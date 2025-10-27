import java.util.*;

public class Set20_Q1_TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> users = new TreeMap<>();
        users.put("Chris", 30);
        users.put("Alice", 25);
        users.put("Bob", 42);
        users.put("Zara", 28);
        users.put("David", 35);

        for (String name : users.keySet()) {
            System.out.println(name + ": " + users.get(name));
        }
    }
}
