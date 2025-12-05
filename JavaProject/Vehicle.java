package com.project2.CoreJavaProj;

public class Vehicle{

	private static int idCounter=1;
	
    private int vehicleId;
    private String registrationNumber;
    private String brand;
    private double purchaseCost;
    private int maxVelocity;
    private int capacity;
    private String fuelType; // 1 = Petrol, 2 = Diesel, 3 = CNG/LPG
    private double vehicleTax;

    public Vehicle(String registrationNumber, String brand,
                   double purchaseCost, int maxVelocity, int capacity, String fuelType) {

        this.vehicleId = idCounter++;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
        this.purchaseCost = purchaseCost;
        this.maxVelocity = maxVelocity;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.vehicleTax=vehicleTax;
    }
    
    

    public Vehicle() {
		super();
	}





	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	}



	public void setMaxVelocity(int maxVelocity) {
		this.maxVelocity = maxVelocity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}



	public void setVehicleTax(double vehicleTax) {
		this.vehicleTax = vehicleTax;
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
    
    public double getVehicleTax() {
    	return vehicleTax;
    }
    
}
