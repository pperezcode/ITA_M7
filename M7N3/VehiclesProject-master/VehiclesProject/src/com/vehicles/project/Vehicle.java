package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import exceptions.*;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Person> owner;
	protected List<Person> drivers = new ArrayList<Person>();
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color, List<Person> owner, List<Person> drivers) throws Exception{
		if (!plate.toUpperCase().matches("^[0-9]{4}[A-Z]{2,3}$")) 
			throw new PlateFormatException("La matrícula ha tenir 4 números i 2-3 lletres.");		// Validar format de la matrícula

		this.plate = plate;
		this.brand = brand;
		this.color = color;
		this.owner = owner;
		this.drivers = drivers;
			
	}
}
