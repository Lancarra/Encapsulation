package app;

public class Employee {

    // Private fields to store the employee's full name, position, email, phone number, and age
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;

    // Constructor to initialize the Employee object with the provided values
    public Employee(String fullName, String position, String email, String phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    // Getter for the age field
    public int getAge() {
        return age;
    }

    // Setter for the age field
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for the phone number field
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Setter for the phone number field
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter for the email field
    public String getEmail() {
        return email;
    }

    // Setter for the email field
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for the position field
    public String getPosition() {
        return position;
    }

    // Setter for the position field
    public void setPosition(String position) {
        this.position = position;
    }

    // Getter for the full name field
    public String getFullName() {
        return fullName;
    }

    // Setter for the full name field
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
