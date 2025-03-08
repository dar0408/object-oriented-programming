// Hospital Patient Management
// Description: Design a system to manage patients in a hospital:
// Create an abstract class Patient with fields like patientId, name, and age.
// Add an abstract method calculateBill() and a concrete method getPatientDetails().
// Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
// Implement an interface MedicalRecord with methods addRecord() and viewRecords().
// Use encapsulation to protect sensitive patient data like diagnosis and medical history.
// Use polymorphism to handle different patient types and display their billing details dynamically.


import java.util.ArrayList;
import java.util.List;

// Abstract class Patient
// Fields: patientId, name, and age (private for encapsulation)
// Abstract method calculateBill() to be implemented by subclasses
// Concrete method getPatientDetails() to print patient details
abstract class Patient {
    private int patientId; // Patient ID
    private String name; // Patient Name
    private int age; // Patient Age

    // Constructor to initialize patient details
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method for calculating bill, to be implemented by subclasses
    public abstract double calculateBill();

    // Concrete method for displaying patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId); // Print patient ID
        System.out.println("Name: " + name); // Print patient name
        System.out.println("Age: " + age); // Print patient age
    }

    // Getter and Setter methods for encapsulation
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// InPatient is a subclass of Patient
// Implements the calculateBill() method based on daily room charges and medical fees
class InPatient extends Patient {
    private double roomCharges; // Daily room charges
    private double medicalFees; // Medical fees

    // Constructor to initialize in-patient details
    public InPatient(int patientId, String name, int age, double roomCharges, double medicalFees) {
        super(patientId, name, age);
        this.roomCharges = roomCharges;
        this.medicalFees = medicalFees;
    }

    // Calculate bill for in-patient based on room charges and medical fees
    public double calculateBill() {
        return roomCharges + medicalFees;
    }
}

// OutPatient is a subclass of Patient
// Implements the calculateBill() method based on consultation fees and medical fees
class OutPatient extends Patient {
    private double consultationFees; // Consultation fees
    private double medicalFees; // Medical fees

    // Constructor to initialize out-patient details
    public OutPatient(int patientId, String name, int age, double consultationFees, double medicalFees) {
        super(patientId, name, age);
        this.consultationFees = consultationFees;
        this.medicalFees = medicalFees;
    }

    // Calculate bill for out-patient based on consultation fees and medical fees
    public double calculateBill() {
        return consultationFees + medicalFees;
    }
}

// Interface MedicalRecord
// Methods: addRecord() and viewRecords()
interface MedicalRecord {
    void addRecord(String record); // Add medical record
    void viewRecords(); // View medical records
}

// Hospital class to manage patients
class Hospital {
    private List<Patient> patients; // List of patients

    // Constructor to initialize patient list
    public Hospital() {
        patients = new ArrayList<>();
    }

    // Method to add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to display billing details for all patients
    public void displayBillingDetails() {
        for (Patient patient : patients) {
            patient.getPatientDetails(); // Display patient details
            System.out.println("Bill Amount: $" + patient.calculateBill()); // Display bill amount
            System.out.println(); // Add a new line for separation
        }
    }
}

public class HPM {
    public static void main(String[] args) {
        // Create a hospital object
        Hospital hospital = new Hospital();

        // Add in-patient and out-patient to the hospital
        hospital.addPatient(new InPatient(101, "Alice", 30, 100, 200));
        hospital.addPatient(new OutPatient(102, "Bob", 25, 50, 150));

        // Display billing details for all patients
        hospital.displayBillingDetails();
    }
}

