import java.util.Scanner;

public class Main {

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            }
            System.out.println("Invalid number. Try again.");
            scanner.nextLine(); 
        }
    }

    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine(); 
                return value;
            }
            System.out.println("Invalid number. Try again.");
            scanner.nextLine(); 
        }
    }

    private static String readLine(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static void printMenu() {
        System.out.println("\n==== Library Menu ====");
        System.out.println("1. Add book");
        System.out.println("2. Add e-book");
        System.out.println("3. Display all books");
        System.out.println("4. Search book by title");
        System.out.println("5. Borrow book");
        System.out.println("6. Return book");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library(10);

        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt(scanner, "Choose an option (1-7): ");

            switch (choice) {
                case 1: {
                    String title = readLine(scanner, "Title: ");
                    String author = readLine(scanner, "Author: ");
                    int year = readInt(scanner, "Year: ");

                    Book book = new Book(title, author, year);
                    library.addBook(book);
                    break;
                }
                case 2: {
                    String title = readLine(scanner, "Title: ");
                    String author = readLine(scanner, "Author: ");
                    int year = readInt(scanner, "Year: ");
                    double fileSize = readDouble(scanner, "File size (MB): ");

                    Book ebook = new EBook(title, author, year, fileSize); 
                    library.addBook(ebook);
                    break;
                }
                case 3:
                    library.displayBooks();
                    break;

                case 4: {
                    String title = readLine(scanner, "Enter title to search: ");
                    Book found = library.searchByTitle(title);
                    if (found == null) {
                        System.out.println("Book not found.");
                    } else {
                        System.out.println("Found: " + found);
                    }
                    break;
                }
                case 5: {
                    String title = readLine(scanner, "Enter title to borrow: ");
                    library.borrowBook(title);
                    break;
                }
                case 6: {
                    String title = readLine(scanner, "Enter title to return: ");
                    library.returnBook(title);
                    break;
                }
                case 7:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-7.");
            }
        }

        scanner.close();
    }
}
