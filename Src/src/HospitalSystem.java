import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospitalSystem {
    private List<Patient> patients;
    private List<Doctor> doctors;
    private List<Appointment> appointments;

    public HospitalSystem() {
        patients = new ArrayList<>();
        doctors = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public void addPatient(Scanner sc) {
        System.out.print("Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        String age = sc.nextLine();
        System.out.print("Problem: ");
        String problem = sc.nextLine();
        Patient p = new Patient(name, Integer.parseInt(age), problem);
        patients.add(p);
        System.out.println("Patient added: " + p.getName());
    }

    public void addDoctor(Scanner sc) {
        System.out.print("Doctor Name: ");
        String name = sc.nextLine();
        System.out.print("Department: ");
        String dept = sc.nextLine();
        Doctor d = new Doctor(name, dept);
        doctors.add(d);
        System.out.println("Doctor added: " + d.getName());
    }

    public void bookAppointment(Scanner sc) {
        System.out.print("Patient Name: ");
        String pname = sc.nextLine();
        System.out.print("Doctor Name: ");
        String dname = sc.nextLine();
        System.out.print("Date (YYYY-MM-DD): ");
        String date = sc.nextLine();

        Patient patient = findPatientByName(pname);
        Doctor doctor = findDoctorByName(dname);
        if (patient == null) {
            System.out.println("Patient not found. Please add patient first.");
            return;
        }
        if (doctor == null) {
            System.out.println("Doctor not found. Please add doctor first.");
            return;
        }

        Appointment ap = new Appointment(patient, doctor, date);
        appointments.add(ap);
        System.out.println("Appointment booked: " + ap);
    }

    private Patient findPatientByName(String name) {
        for (Patient p : patients) {
            if (p.getName().equalsIgnoreCase(name)) return p;
        }
        return null;
    }

    private Doctor findDoctorByName(String name) {
        for (Doctor d : doctors) {
            if (d.getName().equalsIgnoreCase(name)) return d;
        }
        return null;
    }

    public void viewPatients() {
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    public void viewDoctors() {
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(d);
        }
    }

    public void viewAppointments() {
        System.out.println("Appointments:");
        for (Appointment a : appointments) {
            System.out.println(a);
        }
    }
}
