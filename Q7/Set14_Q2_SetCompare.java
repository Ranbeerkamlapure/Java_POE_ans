import java.util.*;

public class Set14_Q2_SetCompare {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();

        int[] nums = {10, 50, 20, 5, 20, 10};
        for (int n : nums) {
            hs.add(n);
            ts.add(n);
        }

        System.out.println("HashSet (unordered):");
        for (int n : hs) System.out.println(n);

        System.out.println("TreeSet (sorted):");
        for (int n : ts) System.out.println(n);
    }
}
