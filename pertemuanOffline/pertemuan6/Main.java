package pertemuanOffline.pertemuan6;

import pertemuanOffline.pertemuan6.models.Person;
import pertemuanOffline.pertemuan6.base.Student;

/**
 * Main application demonstrating Getters and Setters in a modular structure.
 */
public class Main {
    public static void main(String[] args) {
        printHeader();

        // 1. Working with the base Person class
        Person person = new Person("John Doe", "123 Maple St", "SSN-8877");
        person.displayInfo();
        
        // Update name using Setter
        person.setName("Johnathan Doe");
        System.out.println("Updated Name via Getter: " + person.getName());

        System.out.println();

        // 2. Working with the Student subclass
        Student student = new Student("Alice Smith", "456 Oak Ave", "SSN-1122", "STU-001");
        student.displayDetails();

        // Update Student ID using Setter
        student.setStudentId("STU-2024-NEW");
        System.out.println("Updated Student ID via Getter: " + student.getStudentId());

        System.out.println("\nSummary: Getters and Setters applied to modular Person/Student.");
    }

    private static void printHeader() {
        System.out.println("========================================");
        System.out.println("   MODULAR GETTERS & SETTERS DEMO       ");
        System.out.println("========================================");
    }
}
