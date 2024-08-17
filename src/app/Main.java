package app;

public class Main {
    public static void main(String[] args) {
        // Create an Employee object with specified full name, position, email, phone number, and age
        Employee employee = new Employee("John Doe", "Developer", "john.doe@example.com", "+123456789", 30);

        // Print the employee's information to the console
        System.out.println("Employee Information:");
        System.out.println("Full Name: " + employee.getFullName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone Number: " + employee.getPhoneNumber());
        System.out.println("Age: " + employee.getAge());

        // Create a Car object
        Car car = new Car();

        // Start the car, which will invoke the private methods to start its subsystems
        System.out.println("\nStarting the car:");
        car.start();
    }
}