public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, int year, double fileSize) {
        super(title, author, year);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return "[E-Book] Title: " + getTitle()
                + ", Author: " + getAuthor()
                + ", Year: " + getYear()
                + ", Available: " + isAvailable()
                + ", File Size: " + fileSize + "MB";
    }
}
