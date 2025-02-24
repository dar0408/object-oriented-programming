// Program to Handle Book Details
// Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.

// Class representing a Book with title, author, and price attributes
class Book {
    String title;  // Variable to store the book title
    String author; // Variable to store the author's name
    double price;  // Variable to store the book price

    // Constructor to initialize book details
    Book(String title, String author, double price) {
        this.title = title;   // Assigning parameter value to instance variable
        this.author = author; // Assigning parameter value to instance variable
        this.price = price;   // Assigning parameter value to instance variable
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title);   // Printing book title
        System.out.println("Author: " + author); // Printing book author
        System.out.println("Price: " + price);   // Printing book price
    }
}

// Main class to demonstrate the Book class functionality
public class BookDetail {
    public static void main(String[] args) {
        // Creating book objects with title, author, and price
        Book b1 = new Book("Java Programming", "James Gosling", 500);
        Book b2 = new Book("Python Programming", "Guido van Rossum", 600);

        // Displaying details of the books
        b1.display();
        b2.display();
    }
}
