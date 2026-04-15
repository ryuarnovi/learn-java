package pertemuanOffline.pertemuan6.models;

/**
 * Base class to demonstrate access modifiers.
 */
public class Person {
    // We change these to private for better encapsulation when using Getters/Setters
    private String name;
    protected String address; // Kept protected for direct subclass access demo
    private String socialSecurityNumber;

    public Person(String name, String address, String ssn) {
        this.name = name;
        this.address = address;
        this.socialSecurityNumber = ssn;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getSsn() {
        return socialSecurityNumber;
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSsn(String ssn) {
        this.socialSecurityNumber = ssn;
    }

    public void displayInfo() {
        System.out.println("=== Person Information ===");
        System.out.println("Name    : " + name);
        System.out.println("Address : " + address);
        System.out.println("SSN     : [HIDDEN]");
    }
}

