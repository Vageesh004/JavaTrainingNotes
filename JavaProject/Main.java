package com.project2.CoreJavaProj;

import java.text.DecimalFormat;
import java.util.*;

public class Main {
	
	
    private static List<Property> properties = new ArrayList<>();
    private static List<Vehicle> vehicles = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);
    
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    private static PropertyService ps=new PropertyService();
    private static VehicleService vs=new VehicleService();
    
    private static final DecimalFormat df=new DecimalFormat("0.00");

    public static void main(String[] args) {
        loginScreen();
        mainLoop();
    }

    private static void loginScreen() {
        System.out.println("===============================================");
        System.out.println("|          WELCOME TO TAX CALCULATION APP     |");
        System.out.println("===============================================");
        System.out.println("|            PLEASE LOGIN TO CONTINUE         |");
        System.out.println("===============================================");

        while (true) {
            System.out.print("ENTER USERNAME : ");
            String uname = sc.next();

            System.out.print("ENTER PASSWORD : ");
            String pwd = sc.next();

            if (uname.equals(USERNAME) && pwd.equals(PASSWORD)) {
                System.out.println("\nLOGIN SUCCESSFUL!\n");
                break;
            } else {
                System.out.println("\nINVALID CREDENTIALS! PLEASE TRY AGAIN.\n");
            }
        }
    }
    
    
    private static void mainLoop() {
        while (true) {
            displayMainMenu();
            int choice = readInt();

            switch (choice) {
                case 1:
                    propertyMenu();
                    break;
                case 2:
                    vehicleMenu();
                    break;
                case 3:
                    displayTotals();
                    break;
                case 4:
                    System.out.println("\nTHANK YOU FOR USING THE TAX MANAGEMENT APPLICATION.");
                    System.out.println("CLOSING APPLICATION...");
                    return;
                default:
                    System.out.println("INVALID CHOICE. TRY AGAIN.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("===================================================");
        System.out.println("|                MAIN MENU OPTIONS                |");
        System.out.println("===================================================");
        System.out.println("| 1. PROPERTY TAX                                 |");
        System.out.println("| 2. VEHICLE TAX                                  |");
        System.out.println("| 3. DISPLAY TOTAL RECORDS                        |");
        System.out.println("| 4. EXIT                                         |");
        System.out.println("===================================================");
        System.out.print("ENTER YOUR CHOICE : ");
    }
    
    
    private static void propertyMenu() {
        while (true) {
            System.out.println("===================================================");
            System.out.println("|                PROPERTY MENU                    |");
            System.out.println("===================================================");
            System.out.println("| 1. ADD PROPERTY DETAILS                         |");
            System.out.println("| 2. CALCULATE PROPERTY TAX (BY ID)               |");
            System.out.println("| 3. DISPLAY ALL PROPERTIES                       |");
            System.out.println("| 4. BACK TO MAIN MENU                            |");
            System.out.println("===================================================");
            System.out.print("ENTER YOUR CHOICE : ");

            int ch = readInt();
            switch (ch) {
                case 1:
                    addPropertyInteractive();
                    break;
                case 2:
                    calculatePropertyTaxInteractive();
                    break;
                case 3:
                    ps.displayAllProperties();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("INVALID CHOICE.");
            }
        }
    }
    
    
    private static void addPropertyInteractive() {
        try {
            System.out.print("ENTER BUILT-UP AREA (positive): ");
            double builtUp = readDouble();

            System.out.print("ENTER BASE VALUE (positive): ");
            double baseValue = readDouble();

            System.out.print("IS PROPERTY IN MAIN CITY? (Y/N): ");
            String city = sc.next();
            boolean isCity;
            if (city.equalsIgnoreCase("y")) isCity = true;
            else if (city.equalsIgnoreCase("n")) isCity = false;
            else {
                System.out.println("INVALID INPUT FOR CITY (must be Y or N). Aborting add.");
                return;
            }

            System.out.print("ENTER AGE OF CONSTRUCTION (positive integer): ");
            int age = readInt();

            System.out.print("ENTER LOCALITY (single word): ");
            String locality = sc.next();

            Property p = new Property(builtUp, baseValue, isCity, age, locality, 0.0);
            ps.addProperty(p);
            System.out.println("PROPERTY ADDED. ID = " + p.getPropertyId());
        } catch (IllegalArgumentException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
    
    
    private static void calculatePropertyTaxInteractive() {
        System.out.print("ENTER PROPERTY ID TO CALCULATE TAX: ");
        int id = readInt();
        Property p = ps.searchById(id);
        if (p == null) {
            System.out.println("PROPERTY NOT FOUND.");
            return;
        }
        double tax = ps.calculateTax(p);
        System.out.println("PROPERTY ID " + id + " TAX = " + df.format(tax));
    }
    
    
    private static void vehicleMenu() {
        while (true) {
            System.out.println("===================================================");
            System.out.println("|                 VEHICLE MENU                    |");
            System.out.println("===================================================");
            System.out.println("| 1. ADD VEHICLE DETAILS                          |");
            System.out.println("| 2. CALCULATE VEHICLE TAX (BY ID)                |");
            System.out.println("| 3. DISPLAY ALL VEHICLES                         |");
            System.out.println("| 4. BACK TO MAIN MENU                            |");
            System.out.println("===================================================");
            System.out.print("ENTER YOUR CHOICE : ");

            int ch = readInt();
            switch (ch) {
                case 1:
                    addVehicleInteractive();
                    break;
                case 2:
                    calculateVehicleTaxInteractive();
                    break;
                case 3:
                    vs.displayAllVehicles();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("INVALID CHOICE.");
            }
        }
    }
    
    
    
    private static void addVehicleInteractive() {
        try {
            System.out.print("ENTER 4-DIGIT REGISTRATION NUMBER (e.g. 0010): ");
            String reg = sc.next();

            System.out.print("ENTER BRAND: ");
            String brand = sc.next();

            System.out.print("ENTER PURCHASE COST (50000 - 1000000): ");
            double cost = readDouble();

            System.out.print("ENTER MAX VELOCITY (120 - 300): ");
            int vel = readInt();

            System.out.print("ENTER CAPACITY (2 - 50): ");
            int cap = readInt();

            System.out.print("ENTER VEHICLE TYPE (Petrol / Diesel / CNG/LPG): ");
            String type = sc.next();

            Vehicle v = new Vehicle(reg, brand, cost, vel, cap, type);
            vs.addVehicle(v);
            System.out.println("VEHICLE ADDED. ID = " + v.getVehicleId());
        } catch (IllegalArgumentException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
    
    private static void calculateVehicleTaxInteractive() {
        System.out.print("ENTER VEHICLE ID TO CALCULATE TAX: ");
        int id = readInt();
        Vehicle v = vs.searchById(id);
        if (v == null) {
            System.out.println("VEHICLE NOT FOUND.");
            return;
        }
        double tax = vs.calculateTax(v);
        System.out.println("VEHICLE ID " + id + " TAX = " + df.format(tax));
    }

    private static void displayTotals() {
        System.out.println("===================================================");
        System.out.println("|                TOTAL RECORDS                    |");
        System.out.println("===================================================");
        ps.displayAllProperties();
        vs.displayAllVehicles();
        double total = ps.getTotalPropertyTax() + vs.getTotalVehicleTax();
        System.out.println("---------------------------------------------------");
        System.out.println("TOTAL TAX PAYABLE (ALL) = " + df.format(total));
        System.out.println("---------------------------------------------------");
    }
    
    private static int readInt() {
        while (!sc.hasNextInt()) {
            sc.next(); // consume invalid
            System.out.print("PLEASE ENTER A VALID NUMBER: ");
        }
        int v = sc.nextInt();
        return v;
    }

    private static double readDouble() {
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("PLEASE ENTER A VALID NUMBER: ");
        }
        return sc.nextDouble();
    }
}

