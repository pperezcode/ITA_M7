package com.vehicles.project;

import exceptions.*;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception {
		if(diameter < 0.4 || diameter > 4) 		
			throw new DiameterException("El diametre de la roda ha d'estar entre 0.4 i 4.");		// Validem tamany de la roda
	
		this.brand = brand;
		this.diameter = diameter;
	}
		
	public boolean equals(Wheel otherWheel) {
	    if ((otherWheel.brand.equals(this.brand)) && (otherWheel.diameter == this.diameter)) {
	    	return true;
	    } else {
	    	return false;
	    }
	}
}
