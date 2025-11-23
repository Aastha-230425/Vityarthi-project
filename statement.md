# Project Statement: Hospital Record Manager (HRM)

# Problem Statement

- Fragmented and manual hospital record-keeping in a small clinic environment leads to errors in patient data, inefficient appointment scheduling, and delayed information retrieval (diagnosis, history, and billing). A centralized digital solution is needed to improve operational efficiency, data accuracy, and patient care quality.

# Scope of the Project

-The HRM project is a comprehensive Java console application designed for a small-to-medium-sized clinic.

The scope includes:

Core Data Management: Creation, retrieval, updating, and archiving of Patient, Staff (Doctor/Nurse), and Appointment records.

Workflow Management: Implementing logical sequences for appointment scheduling, visit recording, and reporting.

Data Persistence: All data is saved to and loaded from local files using the NIO.2 API, allowing for basic backup and restore functionality.

# Target Users

-Receptionist/Admin Staff: Primary users for patient registration and appointment scheduling.

-Doctors/Nurses: Primary users for accessing medical history and inputting new diagnosis/prescription records.

-System Administrator: Responsible for data persistence operations (import, export, and backup/restore).

# High-Level Features

-Patient CRUD: Complete management of patient personal and contact information.

-Staff Profiles: Management of Doctor and Nurse profiles, utilizing OOP Inheritance.

-Appointment Validation: Scheduling appointments with checks for time conflicts and doctor availability.

-Medical Visit Recording: Logging of consultation notes, diagnoses, and prescription details.

-Reporting: Generation of patient transcripts (full history) and aggregated billing/revenue summaries using the Java Stream API.

-Robustness: Implemented with custom exceptions for comprehensive error handling.
