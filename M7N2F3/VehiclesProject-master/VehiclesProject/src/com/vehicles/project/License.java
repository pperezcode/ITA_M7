package com.vehicles.project;

import java.time.LocalDate;

import exceptions.*;

public class License {
	
	protected int id;
	protected int typeOfLicense;		// 1.Moto 2.Cotxe 3.Cami�
	protected String fullName;
	protected LocalDate expiryDate;
	
	public License(int id, int typeOfLicense, String fullName, LocalDate expiryDate) throws Exception {
		
		if(expiryDate == null)
			throw new DateNullException("El camp data no pot estar buit.");					// Validar la introducci� de data de naixement.
		
				
		this.id = id;
		this.typeOfLicense = typeOfLicense;
		this.fullName = fullName;
		this.expiryDate = expiryDate;
		
	}
	

}
