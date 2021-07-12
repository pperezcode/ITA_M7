package com.vehicles.project;

import java.util.List;

import exceptions.*;

public class Car extends Vehicle {

	public Car(String plate, String brand, String color) throws Exception {
		super(plate, brand, color);
	}

	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Exception {
		addTwoWheels(frontWheels);
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new WheelNumberException("Un cotxe només porta dues rodes traseres/davanteres.");
		
		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new DifferentWheelsException("Les rodes dreta i esquerra són diferents!");

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}
