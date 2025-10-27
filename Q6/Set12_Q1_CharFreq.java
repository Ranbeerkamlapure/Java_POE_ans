import java.util.HashMap;

public class Set12_Q1_CharFreq {
    public static void main(String[] args) {
        String s = "hello world";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (c != ' ') freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : freq.keySet()) {
            System.out.println(c + ": " + freq.get(c));
        }
    }
}
