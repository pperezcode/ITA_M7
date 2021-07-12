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
	
		if(dob == null)
			throw new DateNullException("El camp data no pot estar buit.");					// Validar la introducció de data de naixement.
						
		this.name = name;
		this.surname = surname;
		this.dob = dob;
	}
	
	// Getters
	
	public String getFullName() {
		return name + " " + surname;
	}
}
