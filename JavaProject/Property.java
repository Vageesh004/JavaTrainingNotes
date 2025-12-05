package com.project2.CoreJavaProj;


public class Property{

	private static int idCounter=1;
	
    private int propertyId;
    private double builtUpArea;
    private double baseValue;
    private boolean isCity;
    private int ageOfConstruction;
    private String locality;
    private double propertyTax;

    public Property() {
    	super();
    	
    }
    public Property(double builtUpArea, double baseValue,
                    boolean inCity, int ageOfConstruction, String locality,double propertyTax){

        this.propertyId = idCounter++;
        this.builtUpArea = builtUpArea;
        this.baseValue = baseValue;
        this.isCity = isCity;
        this.ageOfConstruction = ageOfConstruction;
        this.locality = locality;
        this.propertyTax=propertyTax;
    }
	
    
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public double getBuiltUpArea() {
		return builtUpArea;
	}
	public void setBuiltUpArea(double builtUpArea) {
		this.builtUpArea = builtUpArea;
	}
	public double getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(double baseValue) {
		this.baseValue = baseValue;
	}
	public boolean isCity() {
		return isCity;
	}
	public void setCity(boolean isCity) {
		this.isCity = isCity;
	}
	public int getAgeOfConstruction() {
		return ageOfConstruction;
	}
	public void setAgeOfConstruction(int ageOfConstruction) {
		this.ageOfConstruction = ageOfConstruction;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public double getPropertyTax() {
		return propertyTax;
	}
	public void setPropertyTax(double propertyTax) {
		this.propertyTax = propertyTax;
	}

	public int getPropertyId() {
    	return propertyId;
    }
    
    public void setVehicleId() {
    	this.propertyId=propertyId;
    }
	@Override
	public String toString() {
		return "Property [propertyId=" + propertyId + ", builtUpArea=" + builtUpArea + ", baseValue=" + baseValue
				+ ", isCity=" + isCity + ", ageOfConstruction=" + ageOfConstruction + ", locality=" + locality
				+ ", propertyTax=" + propertyTax + "]";
	}
    
    
    
}

