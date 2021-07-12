package com.vehicles.project;

import java.time.LocalDate;

public class Owner extends Person{

	protected License driverLicense;
	protected boolean insurance;
	protected boolean ownGarage;

	public Owner(String name, String surname, LocalDate dob, License driverLicense, boolean insurance, boolean ownGarage) throws Exception {
		super(name, surname, dob);
		
		this.driverLicense = driverLicense;
		this.insurance = insurance;
		this.ownGarage = ownGarage;
	}
}
