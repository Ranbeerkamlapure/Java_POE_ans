import java.util.TreeSet;

public class Set6_Q2_EmpNames {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Ravi");
        names.add("Anita");
        names.add("Zoya");
        names.add("Ravi");
        names.add("Karan");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
