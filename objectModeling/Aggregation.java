// Problem 1: Library and Books (Aggregation)
import java.util.ArrayList;

public class Aggregation {

    public static void main(String[] args) {
        // Create Library objects
        Library library1 = new Library("Library 1");
        Library library2 = new Library("Library 2");

        // Create Book objects
        Book book1 = new Book("Book 1", "Author 1");
        Book book2 = new Book("Book 2", "Author 2");
        Book book3 = new Book("Book 3", "Author 3");

        // Add books to the respective libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
        library2.displayBooks();
    }
}

// Library class that contains multiple Book objects (Aggregation relationship)
class Library {
    private String name; // Library name
    private ArrayList<Book> books; // List of books in the library

    // Constructor to initialize library with a name
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>(); // Initialize the books list
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Books in " + name + ":");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
        System.out.println();
    }
}

// Book class representing a book with title and author
class Book {
    private String title; // Book title
    private String author; // Book author

    // Constructor to initialize book with title and author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter method to retrieve book title
    public String getTitle() {
        return title;
    }

    // Getter method to retrieve book author
    public String getAuthor() {
        return author;
    }
}





// Description: Create a Library class that contains multiple Book objects. Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
// Tasks:
// Define a Library class with an ArrayList of Book objects.
// Define a Book class with attributes such as title and author.
// Demonstrate the aggregation relationship by creating books and adding them to different libraries.
// Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.
