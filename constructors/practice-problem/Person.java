// Create a Person class with a copy constructor that clones another person's attributes.

class Person {
    // Attributes to store person's details
    String name;
    int age;

    // Default constructor: Initializes a person with default values
    public Person() {
        name = "John";  // Default name
        age = 30;  // Default age
    }

    // Parameterized constructor: Allows setting custom values
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor: Clones attributes from another Person object
    public Person(Person person) {
        this.name = person.name;  // Copy name from given person
        this.age = person.age;  // Copy age from given person
    }

    public static void main(String[] args) {
        // Creating person objects using different constructors
        Person person1 = new Person();  // Using default constructor
        Person person2 = new Person("Jane", 25);  // Using parameterized constructor
        Person person3 = new Person(person2);  // Using copy constructor to clone person2

        // Displaying details of each person
        System.out.println("Person 1: Name: " + person1.name + ", Age: " + person1.age);
        System.out.println("Person 2: Name: " + person2.name + ", Age: " + person2.age);
        System.out.println("Person 3: Name: " + person3.name + ", Age: " + person3.age);
    }
}
