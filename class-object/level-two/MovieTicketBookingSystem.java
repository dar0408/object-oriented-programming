// Program to Model a Movie Ticket Booking System
// Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
// Book a ticket (assign seat and update price).
// Display ticket details.
// Explanation: The MovieTicket class organizes ticket information with attributes. The methods handle booking logic and display ticket details.






class MovieTicket {
    String movieName;  // Name of the movie
    String seatNumber;    // Seat number
    double price;      // Price of the ticket

    // Constructor to initialize ticket details
    MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket with seat number and price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to display ticket details
    public void display() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

// Main class to run the program
public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        // Creating MovieTicket objects with initial details
        MovieTicket ticket1 = new MovieTicket("Inception", "s101", 250);

        // Displaying initial ticket details
        System.out.println("Initial Ticket Details:");
        ticket1.display();

        // Booking a new ticket
        System.out.println("After Booking a Ticket:");
        ticket1.bookTicket("A32", 200);
        ticket1.display();
    }
}
