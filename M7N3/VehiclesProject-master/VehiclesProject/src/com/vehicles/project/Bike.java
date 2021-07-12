package com.vehicles.project;

import java.util.List;

import exceptions.*;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color, List<Person> owner, List<Person> drivers) throws Exception {
		super(plate, brand, color, owner, drivers);
	}

	public void addWheels(List<Wheel> frontWheel, List<Wheel> backWheel) throws Exception {
		addOneWheel(frontWheel);
		addOneWheel(backWheel);
	}

	public void addOneWheel(List<Wheel> wheel) throws Exception {
		if (wheel.size() != 1)
			throw new WheelNumberException("Una bicicleta només porta una roda trasera/davantera.");
		
		Wheel newWheel = wheel.get(0);

		this.wheels.add(newWheel);
	}

}
