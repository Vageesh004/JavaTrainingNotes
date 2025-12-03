package com.project2.CoreJavaProj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class VehicleService {

    private List<Vehicle> vehicles = new ArrayList<>();

    // Add vehicle
    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    // Get all vehicles
    public List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    // Calculate tax for specific vehicle
    public double calculateTax(Vehicle v) {

        double base = v.getMaxVelocity() + v.getCapacity();
        double cost = v.getPurchaseCost();

        double taxPercent;

        switch (v.getFuelType()) {
            case 1: taxPercent = 0.10; break; // Petrol
            case 2: taxPercent = 0.11; break; // Diesel
            case 3: taxPercent = 0.12; break; // CNG/LPG
            default: taxPercent = 0.0; // Should never occur if validated
        }

        double tax = base + (cost * taxPercent);

        return Math.round(tax * 100.0) / 100.0; // two decimals
    }

    // Total vehicle tax
    public double getTotalVehicleTax() {
        double sum = 0;
        for (Vehicle v : vehicles) {
            sum += calculateTax(v);
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    // Sort by tax
    public void sortByTax() {
        vehicles.sort(Comparator.comparingDouble(this::calculateTax));
    }

    // Sort by ID
    public void sortById() {
        vehicles.sort(Comparator.comparingInt(Vehicle::getVehicleId));
    }

    // Search by vehicle ID
    public Vehicle searchById(int id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id) return v;
        }
        return null;
    }
}