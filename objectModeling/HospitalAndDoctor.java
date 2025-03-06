import java.util.ArrayList;

// Hospital class to manage doctors and patients
class Hospital {
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital() {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void displayConsultations() {
        System.out.println("Consultations in the hospital:");
        for (Doctor doctor : doctors) {
            doctor.consult();
        }
    }
}

// Doctor class representing a doctor
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public void consult() {
        System.out.println("Doctor " + name + " is consulting:");
        if (patients.isEmpty()) {
            System.out.println("No patients yet.");
        }
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
        System.out.println();
    }

    // Improved addPatient method: Ensures bidirectional association
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Also add this doctor to the patient’s list
        }
    }

    public String getName() {
        return name;
    }
}

// Patient class representing a hospital patient
class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Improved addDoctor method: Ensures bidirectional association
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
            doctor.addPatient(this); // Also add this patient to the doctor’s list
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + " is consulting:");
        if (doctors.isEmpty()) {
            System.out.println("No doctors assigned.");
        }
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }
}

// Main class to test hospital, doctor, and patient interactions
public class HospitalAndDoctor {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Creating Doctors
        Doctor doctor1 = new Doctor("John Doe");
        Doctor doctor2 = new Doctor("Jane Smith");

        // Creating Patients
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Establishing doctor-patient relationships
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Adding doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Display all consultations in the hospital
        hospital.displayConsultations();

        // Display doctors assigned to each patient
        patient1.showDoctors();
        patient2.showDoctors();
    }
}
