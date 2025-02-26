// Problem 2: Book Library System

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Create a Book object
        Book book1 = new Book(123456789, "Java Programming", "John Doe");

        // Modify author name using public setter method
        book1.setAuthor("Jane Smith");

        // Create an EBook object and display details
        EBook eBook1 = new EBook(987654321, "Python Programming", "Alice Johnson");
        eBook1.displayEBookDetails();
    }
}

class Book {
    public int ISBN;  // public field
    protected String title;  // protected field
    private String author;    // private field

    // Constructor
    public Book(int ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter and Setter methods for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {

    // Constructor
    public EBook(int ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display EBook details
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("Author: " + getAuthor()); // Using public method to access private author
    }
}





// Design a Book class with:
// ISBN (public).
// title (protected).
// author (private).
// Write methods to:
// Set and get the author name.
// Create a subclass EBook to access ISBN and title and demonstrate access modifiers.
