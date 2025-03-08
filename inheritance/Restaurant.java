// Restaurant Management System with Hybrid Inheritance
// Description: Model a restaurant system where Person is the superclass and Chef and Waiter are subclasses. Both Chef and Waiter should implement a Worker interface that requires a performDuties() method.
// Tasks:
// Define a superclass Person with attributes like name and id.
// Create an interface Worker with a method performDuties().
// Define subclasses Chef and Waiter that inherit from Person and implement the Worker interface, each providing a unique implementation of performDuties().
// Goal: Practice hybrid inheritance by combining inheritance and interfaces, giving multiple behaviors to the same objects.


// Base class representing a person with a name and an ID
class Person {
    String name; // Name of the person
    int id; // Unique ID for the person

    // Constructor to initialize person details
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface representing worker duties
interface Worker {
    void performDuties(); // Method to be implemented by worker roles
}

// Chef class extending Person and implementing Worker interface
class Chef extends Person implements Worker {
    String speciality; // Speciality of the chef (e.g., Italian cuisine)

    // Constructor to initialize chef details
    public Chef(String name, int id, String speciality) {
        super(name, id); // Calling parent class constructor
        this.speciality = speciality;
    }

    // Implementing performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("Chef " + name + " is cooking " + speciality);
    }
}

// Waiter class extending Person and implementing Worker interface
class Waiter extends Person implements Worker {
    int tablesServed; // Number of tables served by the waiter

    // Constructor to initialize waiter details
    public Waiter(String name, int id, int tablesServed) {
        super(name, id); // Calling parent class constructor
        this.tablesServed = tablesServed;
    }

    // Implementing performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println("Waiter " + name + " served " + tablesServed + " tables");
    }
}

// Main class to execute the program
public class Restaurant {
    public static void main(String[] args) {
        // Creating a Chef and a Waiter object
        Chef chef1 = new Chef("John", 101, "Italian cuisine");
        Waiter waiter1 = new Waiter("Alice", 201, 10);

        // Performing assigned duties
        chef1.performDuties();
        waiter1.performDuties();
    }
}
