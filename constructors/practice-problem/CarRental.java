// Car Rental System: Create a CarRental class with attributes customerName, carModel, and rentalDays.
// Add constructors to initialize the rental details and calculate total cost.

public class CarRental {
    // Attributes of the CarRental class
    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default constructor: initializes rental details with default values
    public CarRental() {
        customerName = "John";
        carModel = "Toyota";
        rentalDays = 1;
        totalCost = 0;  // Default total cost set to 0
    }

    // Parameterized constructor: allows setting custom rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = 0;  // Total cost will be calculated later
    }

    // Copy constructor: creates a new object with the same details as an existing one
    public CarRental(CarRental rental) {
        this.customerName = rental.customerName;
        this.carModel = rental.carModel;
        this.rentalDays = rental.rentalDays;
        this.totalCost = rental.totalCost;
    }

    // Method to calculate the total cost based on car model and rental days
    public void calculateCost() {
        if (carModel.equals("Toyota")) {
            totalCost = rentalDays * 100;  // Toyota rental rate: $100 per day
        } else if (carModel.equals("BMW")) {
            totalCost = rentalDays * 200;  // BMW rental rate: $200 per day
        } else if (carModel.equals("Audi")) {
            totalCost = rentalDays * 300;  // Audi rental rate: $300 per day
        }
    }

    public static void main(String[] args) {
        // Creating car rental objects
        CarRental rental1 = new CarRental();  // Using default constructor
        CarRental rental2 = new CarRental("Jane", "BMW", 3);  // Using parameterized constructor
        CarRental rental3 = new CarRental(rental2);  // Creating a copy of rental2

        // Calculating rental costs
        rental1.calculateCost();
        rental2.calculateCost();
        rental3.calculateCost();

        // Displaying rental details
        System.out.println("Rental 1: Customer Name: " + rental1.customerName + 
                           ", Car Model: " + rental1.carModel + 
                           ", Rental Days: " + rental1.rentalDays + 
                           ", Total Cost: " + rental1.totalCost);

        System.out.println("Rental 2: Customer Name: " + rental2.customerName + 
                           ", Car Model: " + rental2.carModel + 
                           ", Rental Days: " + rental2.rentalDays + 
                           ", Total Cost: " + rental2.totalCost);

        System.out.println("Rental 3: Customer Name: " + rental3.customerName + 
                           ", Car Model: " + rental3.carModel + 
                           ", Rental Days: " + rental3.rentalDays + 
                           ", Total Cost: " + rental3.totalCost);
    }
}
