// Animal Hierarchy
// Description: Create a hierarchy where Animal is the superclass, and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
// Tasks:
// Define a superclass Animal with attributes name and age, and a method makeSound().
// Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
// Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
// Superclass representing an Animal
class Animal {
    String name; // Attribute to store the animal's name
    int age; // Attribute to store the animal's age

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden by subclasses to define specific sounds
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Subclass representing a Dog, inheriting from Animal
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // Calling the superclass constructor
    }

    // Overriding the makeSound() method to provide a Dog-specific implementation
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass representing a Cat, inheriting from Animal
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age); // Calling the superclass constructor
    }

    // Overriding the makeSound() method to provide a Cat-specific implementation
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Subclass representing a Bird, inheriting from Animal
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age); // Calling the superclass constructor
    }

    // Overriding the makeSound() method to provide a Bird-specific implementation
    @Override
    public void makeSound() {
        System.out.println("Chirp");
    }
}

// Main class to test the Animal hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating instances of each subclass and storing them in Animal references
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Whiskers", 2);
        Animal bird = new Bird("Tweety", 1);

        // Calling the makeSound() method to demonstrate polymorphism
        dog.makeSound(); // Outputs "Bark"
        cat.makeSound(); // Outputs "Meow"
        bird.makeSound(); // Outputs "Chirp"
    }
}
