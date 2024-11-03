public class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Initially, the book is available
    }

    // Getter methods
    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Borrow and Return methods
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You've borrowed the book: " + title);
        } else {
            System.out.println("Sorry, this book is already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("You've returned the book: " + title);
    }
}
