// Hotel Booking System: Create a HotelBooking class with attributes guestName, roomType, and nights.
// Use default, parameterized, and copy constructors to initialize bookings.

public class HotelBooking {
    // Attributes to store booking details
    String guestName;
    String roomType;
    int nights;

    // Default constructor: initializes booking with default values
    public HotelBooking() {
        guestName = "John";  // Default guest name
        roomType = "Single";  // Default room type
        nights = 1;  // Default number of nights
    }

    // Parameterized constructor: allows setting custom booking details
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor: creates a new object with the same details as an existing one
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public static void main(String[] args) {
        // Creating bookings using different constructors
        HotelBooking booking1 = new HotelBooking();  // Using default constructor
        HotelBooking booking2 = new HotelBooking("Jane", "Double", 3);  // Using parameterized constructor
        HotelBooking booking3 = new HotelBooking(booking2);  // Creating a copy of booking2

        // Displaying booking details
        System.out.println("Booking 1: Guest Name: " + booking1.guestName + 
                           ", Room Type: " + booking1.roomType + 
                           ", Nights: " + booking1.nights);

        System.out.println("Booking 2: Guest Name: " + booking2.guestName + 
                           ", Room Type: " + booking2.roomType + 
                           ", Nights: " + booking2.nights);

        System.out.println("Booking 3: Guest Name: " + booking3.guestName + 
                           ", Room Type: " + booking3.roomType + 
                           ", Nights: " + booking3.nights);
    }
}
