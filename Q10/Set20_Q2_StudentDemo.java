import java.io.*;
import java.util.*;

class Student implements Serializable {
    String name;
    ArrayList<String> courses;
    transient String tempPassword;
}

public class Set20_Q2_StudentDemo {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.name = "Ranbeer";
        s1.courses = new ArrayList<>(Arrays.asList("IT", "ECM", "CS"));
        s1.tempPassword = "abc123";

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
        out.writeObject(s1);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
        Student s2 = (Student) in.readObject();
        in.close();

        System.out.println("Name: " + s2.name);
        System.out.println("Courses: " + s2.courses);
        System.out.println("Temp Password: " + s2.tempPassword); // should be null
    }
}
