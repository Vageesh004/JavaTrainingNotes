package com.project2.CoreJavaProj;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class PropertyService implements TaxCalculator {

    private final List<Property> properties = new ArrayList<>();
    private final DecimalFormat df = new DecimalFormat("#0.00");

    // Add property to service (stores in internal list)
    public void addProperty(Property property) {
        // Basic validation (can be extended)
        if (property.getBaseValue() <= 0)
            throw new IllegalArgumentException("Base value must be positive and non-zero.");
        if (property.getAgeOfConstruction() <= 0)
            throw new IllegalArgumentException("Age of construction must be positive and non-zero.");
        properties.add(property);
        
        for(Property a:properties) System.out.println(a);
    }

    // Return all properties (read-only view)
    public List<Property> getAllProperties() {
        return new ArrayList<>(properties);
    }

    // Find by id
    public Property searchById(int id) {
        for (Property p : properties) {
            if (p.getPropertyId() == id) return p;
        }
        return null;
    }

    // Override interface - dispatch based on runtime type
    @Override
    public double calculateTax(Object obj) {
        if (obj instanceof Property) {
            return calculateTax((Property) obj);
        } else {
            throw new IllegalArgumentException("Property expected for property tax calculation.");
        }
    }

    // Actual property tax logic (returns two decimals)
    public double calculateTax(Property p) {
        double ageFactor = 1 + (p.getAgeOfConstruction() * 0.01); // example age factor logic
        double baseTax = p.getBuiltUpArea() * ageFactor * p.getBaseValue();

        if (p.isCity()) {
            baseTax += (0.5 * p.getBuiltUpArea());
        }

        double rounded = Math.round(baseTax * 100.0) / 100.0;
        p.setPropertyTax(rounded); // store tax on the object for display if needed
        return rounded;
    }

    public double getTotalPropertyTax() {
        double sum = 0;
        for (Property p : properties) {
            // if tax not computed yet, compute it
            if (p.getPropertyTax() == 0) calculateTax(p);
            sum += p.getPropertyTax();
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    // Sorting helpers
    public void sortByTaxAscending() {
        properties.sort(Comparator.comparingDouble(Property::getPropertyTax));
    }

    public void sortById() {
        properties.sort(Comparator.comparingInt(Property::getPropertyId));
    }

    // Nicely formatted table output (for console)
    public void displayAllProperties() {
        if (properties.isEmpty()) {
            System.out.println("NO PROPERTY DATA.");
            return;
        }

        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-6s | %-10s | %-10s | %-6s | %-4s | %-12s | %-10s%n",
                "ID", "BUILT-UP", "BASE VALUE", "CITY", "AGE", "LOCALITY", "TAX");
        System.out.println("--------------------------------------------------------------------------------");

        for (Property p : properties) {
            // ensure tax computed
            if (p.getPropertyTax() == 0) calculateTax(p);
            System.out.printf("%-6d | %-10.2f | %-10.2f | %-6s | %-4d | %-12s | %-10s%n",
                    p.getPropertyId(),
                    p.getBuiltUpArea(),
                    p.getBaseValue(),
                    p.isCity() ? "Y" : "N",
                    p.getAgeOfConstruction(),
                    p.getLocality(),
                    df.format(p.getPropertyTax()));
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("TOTAL PROPERTIES : %d\t TOTAL PROPERTY TAX : %s%n",
                properties.size(), df.format(getTotalPropertyTax()));
    }
}
