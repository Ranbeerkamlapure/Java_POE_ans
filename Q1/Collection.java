import java.util.HashMap;
import java.util.Scanner;

public class StudentMarks {
    private HashMap<String, Integer> marks = new HashMap<>();

    public void addSubject(String subject, int score) {
        marks.put(subject, score);
    }

    public Integer searchScore(String subject) {
        return marks.get(subject);
    }

    public void displayAll() {
        for (String subject : marks.keySet()) {
            System.out.println(subject + ": " + marks.get(subject));
        }
    }

    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        sm.addSubject("Math", 85);
        sm.addSubject("Physics", 90);
        sm.addSubject("Chemistry", 78);

        System.out.println("Score in Physics: " + sm.searchScore("Physics"));
        sm.displayAll();
    }
}
