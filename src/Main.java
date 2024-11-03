import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create the library
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book(2, "1984", "George Orwell"));
        library.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

        // Create a borrower (user)
        Borrower borrower = new Borrower();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean exit = false;

        // Simple menu for user interaction
        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. View available books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Add a book (Admin)");
            System.out.println("5. Remove a book (Admin)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Display available books
                    System.out.println("\nAvailable Books:");
                    library.displayAvailableBooks();
                    break;
                case 2:
                    // Borrow a book
                    System.out.print("Enter the title of the book to borrow: ");
                    String titleToBorrow = scanner.nextLine();
                    borrower.searchBookByTitle(library, titleToBorrow);
                    break;
                case 3:
                    // Return a book
                    System.out.print("Enter the book ID to return: ");
                    int bookIDToReturn = scanner.nextInt();
                    borrower.returnBook(library, bookIDToReturn);
                    break;
                case 4:
                    // Add a book (Admin role)
                    System.out.print("Enter book ID: ");
                    int newBookID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter book title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String newAuthor = scanner.nextLine();
                    library.addBook(new Book(newBookID, newTitle, newAuthor));
                    break;
                case 5:
                    // Remove a book (Admin role)
                    System.out.print("Enter the book ID to remove: ");
                    int bookIDToRemove = scanner.nextInt();
                    library.removeBook(bookIDToRemove);
                    break;
                case 6:
                    // Exit the program
                    exit = true;
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
