// Library Management with Books and Authors
// Description: Model a Book system where Book is the superclass, and Author is a subclass.
// Tasks:
// Define a superclass Book with attributes like title and publicationYear.
// Define a subclass Author with additional attributes like name and bio.
// Create a method displayInfo() to show details of the book and its author.
// Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.


// Class representing a Book with a title and publication year
class Book {
    String title; // Title of the book
    int publicationYear; // Year the book was published

    // Constructor to initialize book details
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Class representing an Author, which extends the Book class
class Author extends Book {
    String name; // Name of the author
    String bio; // Short biography of the author

    // Constructor to initialize author details along with book information
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Calling parent class constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding the displayInfo method to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Displaying book details
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

// Main class to execute the program
public class LibraryManagement {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("Java Programming", 2020);
        Book book2 = new Book("Python Basics", 2019);

        // Creating author objects with associated books
        Author author1 = new Author("Java Programming", 2020, "John Doe", "Experienced Java developer");
        Author author2 = new Author("Python Basics", 2019, "Jane Smith", "Python enthusiast");

        // Storing books and authors in arrays for easy iteration
        Book[] books = {book1, book2};
        Author[] authors = {author1, author2};

        // Looping through arrays to display details
        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo(); // Display book info
            authors[i].displayInfo(); // Display author info
            System.out.println("--------------------------------"); // Separator for readability
        }
    }
}
