import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Remove a book by its ID
    public void removeBook(int bookID) {
       /* books.removeIf(book -> book.getBookID() == bookID);
        System.out.println("Book removed.");*/
        for(Book book :books)
        {
        if (book.getBookID() == bookID) {
            books.remove(book);
            System.out.println("Book removed successfully: " + book.getTitle());
            return;
        }
    }
    System.out.println("Book not found.");
}

    // Getter method to access all books
    public ArrayList<Book> getBooks() {
        return books;
    }

    // Display available books
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
