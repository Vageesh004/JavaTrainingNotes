package com.project2.CoreJavaProj;


public class Property{

    private int propertyId;
    private double builtUpArea;
    private double baseValue;
    private boolean inCity;
    private int ageOfConstruction;
    private String locality;

    public Property(int propertyId, double builtUpArea, double baseValue,
                    boolean inCity, int ageOfConstruction, String locality){

        this.propertyId = propertyId;
        this.builtUpArea = builtUpArea;
        this.baseValue = baseValue;
        this.inCity = inCity;
        this.ageOfConstruction = ageOfConstruction;
        this.locality = locality;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public double getBuiltUpArea() {
        return builtUpArea;
    }

    public double getBaseValue() {
        return baseValue;
    }

    public boolean isInCity() {
        return inCity;
    }

    public int getAgeOfConstruction() {
        return ageOfConstruction;
    }

    public String getLocality() {
        return locality;
    }
    
    
}
