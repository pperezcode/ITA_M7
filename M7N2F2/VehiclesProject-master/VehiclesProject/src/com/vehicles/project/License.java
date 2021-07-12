package com.vehicles.project;

import java.time.LocalDate;

import exceptions.*;

public class License {
	
	protected int id;
	protected String typeOfLicense;
	protected String fullName;
	protected LocalDate expiryDate;
	
	public License(int id, String typeOfLicense, String fullName, LocalDate expiryDate) throws Exception {
		
		if(expiryDate == null)
			throw new DateNullException("El camp data no pot estar buit.");					// Validar la introducció de data de naixement.
		
				
		this.id = id;
		this.typeOfLicense = typeOfLicense;
		this.fullName = fullName;
		this.expiryDate = expiryDate;
		
	}
	

}
