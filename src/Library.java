public class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        this.books = new Book[10];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count >= books.length) {
            System.out.println("Library is full. Cannot add more books.");
            return;
        }
        
        for (int i = 0; i < count; i++) {
            if (books[i].equals(book)) {
                System.out.println("This book already exists in the library.");
                return;
            }
        }

        books[count] = book;
        count++;
        System.out.println("Book added successfully.");
    }

    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("---- Library Books ----");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ") " + books[i]);
        }
    }

    public Book searchByTitle(String title) {
        if (title == null) return null;

        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title.trim())) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String title) {
        Book book = searchByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed.");
            return;
        }

        book.borrowBook();
        System.out.println("You borrowed: " + book.getTitle());
    }

    public void returnBook(String title) {
        Book book = searchByTitle(title);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("This book is already available (not borrowed).");
            return;
        }

        book.returnBook();
        System.out.println("You returned: " + book.getTitle());
    }
}
