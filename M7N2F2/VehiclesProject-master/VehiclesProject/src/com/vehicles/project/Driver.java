package com.vehicles.project;

import java.time.LocalDate;

public class Driver extends Person{

	protected License driverLicense;

	public Driver(String name, String surname, LocalDate dob, License driverLicense) throws Exception {
		super(name, surname, dob);
		
		this.driverLicense = driverLicense;

	}
}
