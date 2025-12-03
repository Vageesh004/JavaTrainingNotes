package com.project2.CoreJavaProj;

/**
 * Hello world!
 */
import java.util.*;

public class Main {

    private static List<Property> properties = new ArrayList<>();
    private static List<Vehicle> vehicles = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            displayWelcomeScreen();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    propertyUI();
                    break;

                case 2:
                    vehicleUI();
                    break;

                case 3:
                    displayRecordsUI();
                    break;

                case 4:
                    System.out.println("\nThank you for using the Tax Management Application.");
                    System.out.println("Closing application...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    // ---------------------------------------------------------
    // WELCOME SCREEN
    // ---------------------------------------------------------
    private static void displayWelcomeScreen() {
        System.out.println("\n=======================================");
        System.out.println("      TAX MANAGEMENT APPLICATION");
        System.out.println("      Developer: VAGEESH S");
        System.out.println("=======================================");
        System.out.println("User Interface Options:");
        System.out.println("1. Property Tax Calculator");
        System.out.println("2. Vehicle Tax Calculator");
        System.out.println("3. Display All Records");
        System.out.println("4. Exit Application");
        System.out.print("Enter your choice: ");
    }

    // ---------------------------------------------------------
    // PROPERTY USER INTERFACE
    // ---------------------------------------------------------
    private static void propertyUI() {
        System.out.println("\n--- PROPERTY TAX CALCULATION ---");

        System.out.print("Enter built-up area: ");
        double area = sc.nextDouble();

        System.out.print("Enter age factor: ");
        double ageFactor = sc.nextDouble();

        System.out.print("Enter base value of the land: ");
        double baseValue = sc.nextDouble();

        System.out.print("Is property inside main city? (yes/no): ");
        String cityInput = sc.next();
        boolean isCity = cityInput.equalsIgnoreCase("yes");

        // Create property object
        Property p = new Property(area, ageFactor, baseValue, isCity);

        double tax = p.calculateTax();
        System.out.println("Calculated Property Tax: " + tax);

        System.out.print("Save this property? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            properties.add(p);
            System.out.println("Property saved.");
        }
    }

    // ---------------------------------------------------------
    // VEHICLE USER INTERFACE
    // ---------------------------------------------------------
    private static void vehicleUI() {
        System.out.println("\n--- VEHICLE TAX CALCULATION ---");

        System.out.print("Enter registration number: ");
        String regNo = sc.next();

        System.out.print("Enter brand: ");
        String brand = sc.next();

        System.out.print("Enter purchase cost: ");
        double cost = sc.nextDouble();

        System.out.print("Enter maximum velocity: ");
        double velocity = sc.nextDouble();

        System.out.print("Enter capacity (no. of seats): ");
        int capacity = sc.nextInt();

        System.out.print("Enter vehicle type (petrol/diesel/cng): ");
        String type = sc.next();

        // Create vehicle object
        Vehicle v = new Vehicle(regNo, brand, cost, velocity, capacity, type);

        double tax = v.calculateTax();
        System.out.println("Calculated Vehicle Tax: " + tax);

        System.out.print("Save this vehicle? (yes/no): ");
        if (sc.next().equalsIgnoreCase("yes")) {
            vehicles.add(v);
            System.out.println("Vehicle saved.");
        }
    }

    // ---------------------------------------------------------
    // DISPLAY RECORDS USER INTERFACE
    // ---------------------------------------------------------
    private static void displayRecordsUI() {
        System.out.println("\n=========== STORED RECORDS ===========");

        if (properties.isEmpty() && vehicles.isEmpty()) {
            System.out.println("No Data Present at This Moment.");
        } else {
            double totalPropTax = 0;
            double totalVehTax = 0;

            System.out.println("\n--- Properties ---");
            if (properties.isEmpty()) {
                System.out.println("No Property Data.");
            } else {
                for (Property p : properties) {
                    System.out.println(p + " | Tax: " + p.calculateTax());
                    totalPropTax += p.calculateTax();
                }
                System.out.println("Total Properties: " + properties.size());
                System.out.println("Total Property Tax: " + totalPropTax);
            }

            System.out.println("\n--- Vehicles ---");
            if (vehicles.isEmpty()) {
                System.out.println("No Vehicle Data.");
            } else {
                for (Vehicle v : vehicles) {
                    System.out.println(v + " | Tax: " + v.calculateTax());
                    totalVehTax += v.calculateTax();
                }
                System.out.println("Total Vehicles: " + vehicles.size());
                System.out.println("Total Vehicle Tax: " + totalVehTax);
            }

            System.out.println("\nTOTAL TAX PAYABLE = " + (totalPropTax + totalVehTax));
        }

        System.out.println("\nPress any key to return to main menu...");
        sc.next();
    }
}
