package com.vehicles.project;

import java.time.LocalDate;

import exceptions.*;

public abstract class Person {

	protected String name;
	protected String surname;
	protected LocalDate dob;		// Date of birth
	
	public Person(String name, String surname, LocalDate dob) throws Exception {
		if ((name == null) || (surname == null))
			throw new NoFullNameException("El nom i el cognom no poden estar buits.");				// Validar la introducció de nom i cognom.
	
		
		if((dob.getDayOfMonth() < 1) || (dob.getDayOfMonth() >= 31))
			throw new FormatException("El dia ha d'estar entre 1 i 31.");					// Validar la introducció de data de naixement.
		
		if((dob.getMonthValue() < 1) || (dob.getMonthValue() >= 12))
			throw new FormatException("El mes ha d'estar entre 1 i 12.");					
		
		if((dob.getYear() < (LocalDate.now().getYear() - 100)) || (dob.getYear() > LocalDate.now().getYear()))
			throw new FormatException("L'any introduït és incorrecte.");			
				
		this.name = name;
		this.surname = surname;
		this.dob = dob;
	}
	
	// Getters
	
	public String getFullName() {
		return name + " " + surname;
	}
}
