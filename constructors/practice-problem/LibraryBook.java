// Library Book System: Create a Book class with attributes title, author, price, and availability. 
// Implement a method to borrow a book.

public class LibraryBook {
    // Attributes to store book details
    String title;
    String author;
    double price;
    boolean availability;  // Indicates if the book is available for borrowing

    // Default constructor: initializes book with default values
    public LibraryBook() {
        title = "Java";  // Default title
        author = "James Gosling";  // Default author
        price = 500;  // Default price
        availability = true;  // Default availability status (available)
    }

    // Parameterized constructor: allows setting custom book details
    public LibraryBook(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;  // Set book as borrowed
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book not available for borrowing!");
        }
    }

    public static void main(String[] args) {
        // Creating book objects
        LibraryBook book1 = new LibraryBook();  // Using default constructor
        LibraryBook book2 = new LibraryBook("Python", "Guido van Rossum", 600, true);  // Using parameterized constructor

        // Borrowing books
        book1.borrowBook();  // Borrow the first book
        book2.borrowBook();  // Borrow the second book
    }
}
