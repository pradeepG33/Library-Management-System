
public class Borrower {
    // Search for a book by title and borrow it
    public void searchBookByTitle(Library library, String title) {
        for (Book book : library.getBooks()) {  // Using getBooks() from Library
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (book.isAvailable()) {
                    System.out.println("Book found: " + title);
                    book.borrowBook(); // Borrow the book if found
                } else {
                    System.out.println("Book is not available right now.");
                }
                return; // Exit after finding the book
            }
        }
        System.out.println("Book not found.");
    }

    // Return a borrowed book
    public void returnBook(Library library, int bookID) {
        for (Book book : library.getBooks()) {  // Using getBooks() from Library
            if (book.getBookID() == bookID) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }
}

