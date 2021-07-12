package com.vehicles.project;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}

	public boolean equals(Wheel otherWheel) {
		
	    if ((otherWheel.brand == this.brand) && (otherWheel.diameter == this.diameter))
	    	return true;
	    else {
	    	return false;
	    }
	}
	
}
