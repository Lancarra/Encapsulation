package app;

public class Car {

    // Public method to start the car, which triggers several internal systems
    public void start() {
        startElectricity();  // Start the electricity system
        startCommand();      // Start the command system
        startFuelSystem();   // Start the fuel system
        System.out.println("Car has started.");
    }

    // Private method to start the electricity system of the car
    private void startElectricity() {
        System.out.println("Electricity system started.");
    }

    // Private method to start the command system of the car
    private void startCommand() {
        System.out.println("Command system started.");
    }

    // Private method to start the fuel system of the car
    private void startFuelSystem() {
        System.out.println("Fuel system started.");
    }
}
