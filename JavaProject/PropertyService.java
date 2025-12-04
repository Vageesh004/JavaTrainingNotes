package com.project2.CoreJavaProj;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PropertyService implements TaxCalculator{

    private List<Property> properties = new ArrayList<>();

    // Add property
    public void addProperty(Property property) {
        properties.add(property);
    }

    // Get all properties
    public List<Property> getAllProperties() {
        return properties;
    }

    // Calculate tax for a specific property
    public double calculateTax() {

        double ageFactor = 1 + (p.getAgeOfConstruction() * 0.01); 
        double baseTax = p.getBuiltUpArea() * ageFactor * p.getBaseValue();

        if (p.isInCity()) {
            baseTax += (0.5 * p.getBuiltUpArea());
        }

        return Math.round(baseTax * 100.0) / 100.0; // Two decimals
    }

    // Total tax for all properties
    public double getTotalPropertyTax() {
        double sum = 0;
        for (Property p : properties) {
            sum += calculateTax(p);
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    // Sort properties by tax (ascending)
    public void sortByTax() {
        properties.sort(Comparator.comparingDouble(this::calculateTax));
    }

    // Sort by property ID
    public void sortById() {
        properties.sort(Comparator.comparingInt(Property::getPropertyId));
    }

    // Search by Property ID
    public Property searchById(int id) {
        for (Property p : properties) {
            if (p.getPropertyId() == id) return p;
        }
        return null;
    }
}
