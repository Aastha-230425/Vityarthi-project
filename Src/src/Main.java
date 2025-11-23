import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalSystem hs = new HospitalSystem();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. View Patients");
            System.out.println("5. View Doctors");
            System.out.println("6. View Appointments");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1": hs.addPatient(sc); break;
                case "2": hs.addDoctor(sc); break;
                case "3": hs.bookAppointment(sc); break;
                case "4": hs.viewPatients(); break;
                case "5": hs.viewDoctors(); break;
                case "6": hs.viewAppointments(); break;
                case "7": 
                    System.out.println("Goodbye!");
                    sc.close();
                    return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
