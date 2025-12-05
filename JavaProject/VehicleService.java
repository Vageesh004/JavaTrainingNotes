package com.project2.CoreJavaProj;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VehicleService implements TaxCalculator {

    private final List<Vehicle> vehicles = new ArrayList<>();
    private final DecimalFormat df = new DecimalFormat("#0.00");

    // Add vehicle (with basic validation)
    public void addVehicle(Vehicle v) {
        // registration number validation (4-digit string not "0000")
        String reg = v.getRegistrationNumber();
        if (reg == null || reg.length() != 4 || reg.equals("0000"))
            throw new IllegalArgumentException("Registration must be a 4-digit string and not '0000'.");

        if (v.getPurchaseCost() < 50000 || v.getPurchaseCost() > 1000000)
            throw new IllegalArgumentException("Purchase cost must be between 50000 and 1000000.");

        if (v.getMaxVelocity() < 120 || v.getMaxVelocity() > 300)
            throw new IllegalArgumentException("Max velocity must be between 120 and 300.");

        if (v.getCapacity() < 2 || v.getCapacity() > 50)
            throw new IllegalArgumentException("Capacity must be between 2 and 50.");

        // fuel type must be Petrol, Diesel or CNG/LPG (case-insensitive)
        String ft = v.getFuelType();
        if (ft == null) throw new IllegalArgumentException("Fuel type required.");
        String lower = ft.trim().toLowerCase();
        if (!lower.equals("petrol") && !lower.equals("diesel") && !lower.equals("cng/lpg"))
            throw new IllegalArgumentException("Fuel type must be Petrol, Diesel or CNG/LPG.");

        vehicles.add(v);
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    public Vehicle searchById(int id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id) return v;
        }
        return null;
    }

    @Override
    public double calculateTax(Object obj) {
        if (obj instanceof Vehicle) {
            return calculateTax((Vehicle) obj);
        } else {
            throw new IllegalArgumentException("Vehicle expected for vehicle tax calculation.");
        }
    }

    // Actual vehicle tax logic
    public double calculateTax(Vehicle v) {
        double base = v.getMaxVelocity() + v.getCapacity();
        double cost = v.getPurchaseCost();

        String ft = v.getFuelType().trim().toLowerCase();
        double percent;
        switch (ft) {
            case "petrol":
                percent = 0.10;
                break;
            case "diesel":
                percent = 0.11;
                break;
            case "cng/lpg":
                percent = 0.12;
                break;
            default:
                percent = 0.0;
        }

        double tax = base + (cost * percent);
        double rounded = Math.round(tax * 100.0) / 100.0;
        v.setVehicleTax(rounded);
        return rounded;
    }

    public double getTotalVehicleTax() {
        double sum = 0;
        for (Vehicle v : vehicles) {
            if (v.getVehicleTax() == 0) calculateTax(v);
            sum += v.getVehicleTax();
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public void sortByTaxAscending() {
        vehicles.sort(Comparator.comparingDouble(Vehicle::getVehicleTax));
    }

    public void sortById() {
        vehicles.sort(Comparator.comparingInt(Vehicle::getVehicleId));
    }

    // Console display
    public void displayAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("NO VEHICLE DATA.");
            return;
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-6s | %-8s | %-8s | %-8s | %-6s | %-8s | %-10s%n",
                "ID", "REG NO", "BRAND", "COST", "VEL", "CAPACITY", "TAX");
        System.out.println("--------------------------------------------------------------------------------");
        for (Vehicle v : vehicles) {
            if (v.getVehicleTax() == 0) calculateTax(v);
            System.out.printf("%-6d | %-8s | %-8s | %-8.2f | %-6d | %-8d | %-10s%n",
                    v.getVehicleId(),
                    v.getRegistrationNumber(),
                    v.getBrand(),
                    v.getPurchaseCost(),
                    v.getMaxVelocity(),
                    v.getCapacity(),
                    df.format(v.getVehicleTax()));
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("TOTAL VEHICLES : %d\t TOTAL VEHICLE TAX : %s%n",
                vehicles.size(), df.format(getTotalVehicleTax()));
    }
}
