// Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.

public class BookDetail {
    // Attributes of the Book class
    String title;
    String author;
    double price;

    // Default constructor: initializes book details with default values
    public BookDetail() {
        title = "Java";
        author = "James Gosling";
        price = 500;
    }

    // Parameterized constructor: allows setting custom values for book details
    public BookDetail(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        // Creating a book object using the default constructor
        BookDetail book1 = new BookDetail();

        // Creating a book object using the parameterized constructor
        BookDetail book2 = new BookDetail("Python", "Guido van Rossum", 600);

        // Printing details of both books
        System.out.println("Book 1: Title: " + book1.title + ", Author: " + book1.author + ", Price: " + book1.price);
        System.out.println("Book 2: Title: " + book2.title + ", Author: " + book2.author + ", Price: " + book2.price);
    }
}
