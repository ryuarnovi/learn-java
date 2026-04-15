package pertemuanOffline.pertemuan6.base;

import pertemuanOffline.pertemuan6.models.Person;

/**
 * Subclass to demonstrate protected access across packages.
 */
public class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public Student(String name, String address, String ssn, String studentId) {
        super(name, address, ssn);
        this.studentId = studentId;
    }

    public void displayDetails() {
        System.out.println("=== Student Details ===");
        System.out.println("ID      : " + studentId);
        // name is now private in Person, so we must use the getter
        System.out.println("Name    : " + getName());
        // address is protected in Person; accessible here because Student extends Person
        System.out.println("Address : " + address);
        // socialSecurityNumber is private; must use getter
        System.out.println("SSN     : " + getSsn());
    }
}
