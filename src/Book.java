import java.util.Objects;

public class Book {

    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.year = other.year;
        this.isAvailable = other.isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    public void returnBook() {
        isAvailable = true;
    }
    
    @Override
    public String toString() {
        return "Title: " + title
                + ", Author: " + author
                + ", Year: " + year
                + ", Available: " + isAvailable;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Book)) return false;

        Book other = (Book) obj;
        return year == other.year
                && Objects.equals(title, other.title)
                && Objects.equals(author, other.author);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }
}
