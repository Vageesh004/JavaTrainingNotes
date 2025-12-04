package com.project2.CoreJavaProj;

public class Vehicle{

    private int vehicleId;
    private String registrationNumber;
    private String brand;
    private double purchaseCost;
    private int maxVelocity;
    private int capacity;
    private String fuelType; // 1 = Petrol, 2 = Diesel, 3 = CNG/LPG

    public Vehicle(int vehicleId, String registrationNumber, String brand,
                   double purchaseCost, int maxVelocity, int capacity, String fuelType) {

        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.purchaseCost = purchaseCost;
        this.maxVelocity = maxVelocity;
        this.capacity = capacity;
        this.fuelType = fuelType;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getPurchaseCost() {
        return purchaseCost;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getFuelType() {
        return fuelType;
    }
    
    
}
