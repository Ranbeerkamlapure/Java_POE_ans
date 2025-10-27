import java.io.*;

public class Set10_Q1_ReadFile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("sample.txt"));
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("File resources are being closed.");
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {}
        }
    }
}
