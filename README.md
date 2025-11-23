# Vityarthi-project
An academic project (OOP course) for managing a small clinic's records. Features patient and staff management, appointment scheduling with validation, custom exception handling, and data persistenceHospital Record Manager (HRM) - Java Console Application

# Overview

The Hospital Record Manager (HRM) is a comprehensive Java console application designed to centralize and streamline the management of patients, staff, appointments, and medical records for a small medical facility or clinic. It is built to showcase advanced Object-Oriented Programming (OOP) principles and modern Java features, including the Stream API, NIO.2 File I/O, and Design Patterns.

# Features

-Core Modules (Functional)

-Patient Management: Add, search, update, and archive patient profiles.

-Staff Management: Register and manage profiles for Doctors and Nurses (using Inheritance).

-Appointment Scheduling: Schedule appointments, check doctor availability, and handle conflict validation.

-Record Keeping: Log new visit records, diagnoses, and prescriptions.

--Reporting: Generate reports on patient history and basic revenue statistics.

# Technical Features (Non-Functional)

-Reliability: Uses custom exceptions for robust error handling.

-Data Persistence: Data is stored using File I/O (CSV/DAT), allowing for data import/export and backup/restore.

-Modularity: Clean, decoupled design using interfaces and abstract classes.

#Technologies/Tools Used

-Language: Java (JDK 17 LTS recommended)

-Core Concepts: Object-Oriented Programming (OOP), Data Structures (Lists, Maps), Recursion.

-Advanced Java: Java Stream API, NIO.2 File I/O, Date/Time API, Lambdas.

-Design Patterns: Singleton (for core manager class), Builder (for complex objects).

-Version Control: Git.

#Steps to Install & Run the Project

Clone the Repository:

git clone [https://github.com/Aastha-230425/Vityarthi-project.git](
cd Hospital-Record-Manager


Setup Java: Ensure you have Java Development Kit (JDK) 8 or later installed and configured (Java 17 is preferred).

Setup IDE: Open the project folder in your preferred Java IDE (Eclipse, IntelliJ, VS Code).

Run: Compile and run the Main.java class.

Instructions for Testing

Unit Testing: (Placeholder: Detailed unit tests will be provided in the test/ directory using JUnit for core business logic).

Validation Testing: Run the application and intentionally input invalid data (e.g., non-existent patient ID, conflicting appointment times, non-numeric age) to verify that the custom exceptions are correctly handled and the application remains stable.

Assertion Check: Run the main class with the -ea flag enabled to check internal assumptions: java -ea Main.

Screenshots (Conceptual)
