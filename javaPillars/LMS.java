// Library Management System
// Description: Develop a library management system:
// Use an abstract class LibraryItem with fields like itemId, title, and author.
// Add an abstract method getLoanDuration() and a concrete method getItemDetails().
// Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
// Implement an interface Reservable with methods reserveItem() and checkAvailability().
// Apply encapsulation to secure details like the borrower’s personal data.
// Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.


import java.util.ArrayList;
import java.util.List;

// Abstract class LibraryItem
// Fields: itemId, title, and author (private for encapsulation)
// Abstract method getLoanDuration() to be implemented by subclasses
// Concrete method getItemDetails() to print item details
abstract class LibraryItem {
    private int itemId; // Item ID
    private String title; // Item Title
    private String author; // Item Author

    // Constructor to initialize item details
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Abstract method for getting loan duration, to be implemented by subclasses
    public abstract int getLoanDuration();

    // Concrete method for displaying item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId); // Print item ID
        System.out.println("Title: " + title); // Print item title
        System.out.println("Author: " + author); // Print item author
    }

    // Getter and Setter methods for encapsulation
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Book is a subclass of LibraryItem
// Implements the getLoanDuration() method based on book category
class Book extends LibraryItem {
    // Constructor to initialize book details
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Override method to get loan duration for books
    @Override
    public int getLoanDuration() {
        return 21; // 21 days for book loan duration
    }
}

// Magazine is a subclass of LibraryItem
// Implements the getLoanDuration() method based on magazine category
class Magazine extends LibraryItem {
    // Constructor to initialize magazine details
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Override method to get loan duration for magazines
    @Override
    public int getLoanDuration() {
        return 7; // 7 days for magazine loan duration
    }
}

// DVD is a subclass of LibraryItem
// Implements the getLoanDuration() method based on DVD category
class DVD extends
        LibraryItem {
    // Constructor to initialize DVD details
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Override method to get loan duration for DVDs
    @Override
    public int getLoanDuration() {
        return 14; // 14 days for DVD loan duration
    }
}   

// Interface Reservable with methods reserveItem() and checkAvailability()
interface Reservable {
    void reserveItem(); // Reserve an item
    void checkAvailability(); // Check item availability
}

// Library class to manage library items
class Library {
    private List<LibraryItem> items; // List of library items

    // Constructor to initialize library items
    public Library() {
        items = new ArrayList<>(); // Initialize list of library items
    }

    // Method to add library items to the list
    public void addItem(LibraryItem item) {
        items.add(item); // Add item to the list
    }

    // Method to display all library items
    public void displayItems() {
        for (LibraryItem item : items) {
            item.getItemDetails(); // Display item details
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days"); // Display loan duration
            System.out.println(); // Print empty line
        }
    }
}

// Main class to demonstrate Library Management System
public class LMS {
    public static void main(String[] args) {
        // Create a library object
        Library library = new Library();

        // Add library items (book, magazine, and DVD)
        library.addItem(new Book(101, "Java Programming", "John Doe")); // Add a book
        library.addItem(new Magazine(201, "National Geographic", "Jane Smith")); // Add a magazine
        library.addItem(new DVD(301, "Inception", "Christopher Nolan")); // Add a DVD

        // Display all library items
        library.displayItems();
    }
}

