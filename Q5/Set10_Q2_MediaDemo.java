class Media {
    void displayDetails() {}
}

class Book extends Media {
    String title = "1984";
    String author = "George Orwell";

    void displayDetails() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

class Movie extends Media {
    String title = "Inception";
    String director = "Christopher Nolan";

    void displayDetails() {
        System.out.println("Movie: " + title + ", Director: " + director);
    }
}

public class Set10_Q2_MediaDemo {
    public static void main(String[] args) {
        Media m1 = new Book();
        Media m2 = new Movie();

        m1.displayDetails();
        m2.displayDetails();
    }
}
