import java.util.Scanner;
import java.util.HashSet;

public class UniqueWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph of text:");
        String paragraph = scanner.nextLine();
        scanner.close();

        String[] words = paragraph.toLowerCase().split("[^a-zA-Z]+");

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            if (!word.trim().isEmpty()) {
                uniqueWords.add(word);
            }
        }
        
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}