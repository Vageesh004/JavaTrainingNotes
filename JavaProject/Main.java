package com.project2.CoreJavaProj;

/**
 * Hello world!
 */
import java.util.*;

public class Main {
	
	
    private static List<Property> properties = new ArrayList<>();
    private static List<Vehicle> vehicles = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in);
    
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";


    public static void main(String[] args) {
    	
    	loginScreen();

        while (true) {
            displayWelcomeScreen();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    propertyMenu();
                    break;

                case 2:
                    vehicleMenu();
                    break;

                case 3:
                    displayRecordsUI();
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
    
 // ---------------------------------------------------------
    // LOGIN SCREEN
    // ---------------------------------------------------------
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
    
    
    // ---------------------------------------------------------
    // MAIN MENU (TABULAR FORMAT)
    // ---------------------------------------------------------
    
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

    // ---------------------------------------------------------
    // ---------------------------------------------------------
    // PROPERTY MENU
    // ---------------------------------------------------------
    private static void propertyMenu() {

        while (true) {
            System.out.println("===================================================");
            System.out.println("|                PROPERTY MENU                    |");
            System.out.println("===================================================");
            System.out.println("| 1. ADD PROPERTY DETAILS                         |");
            System.out.println("| 2. CALCULATE PROPERTY TAX                       |");
            System.out.println("| 3. DISPLAY ALL PROPERTIES                       |");
            System.out.println("| 4. BACK TO MAIN MENU                            |");
            System.out.println("===================================================");
            System.out.print("ENTER YOUR CHOICE : ");
            
        }
        
