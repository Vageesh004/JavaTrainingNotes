package com.project2.CoreJavaProj;

import interfaces.TaxCalculator;

public class Property implements TaxCalculator{
	private double builtUpArea;
	private double baseValue;
	private int ageOfConstruction;
	private boolean isInCity;
	
	public Property(double builtUpArea, double baseValue, int ageOfConstruction, boolean isInCity) {
		super();
		this.builtUpArea = builtUpArea;
		this.baseValue = baseValue;
		this.ageOfConstruction = ageOfConstruction;
		this.isInCity = isInCity;
	}

	public Property() {
		super();
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

	public int getAgeOfConstruction() {
		return ageOfConstruction;
	}

	public void setAgeOfConstruction(int ageOfConstruction) {
		this.ageOfConstruction = ageOfConstruction;
	}

	public boolean isInCity() {
		return isInCity;
	}

	public void setInCity(boolean isInCity) {
		this.isInCity = isInCity;
	}

	@Override
	public String toString() {
		return "Property [builtUpArea=" + builtUpArea + ", baseValue=" + baseValue + ", ageOfConstruction="
				+ ageOfConstruction + ", isInCity=" + isInCity + "]";
	}
	
	
	
	
}
