
package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.LicenseException;
import views.*;

public class AppVehiclesM7N3 {

	public static void main(String[] args) throws LicenseException {
		int menu;

		List <Vehicle> vehicles = new ArrayList<Vehicle>();
		List <Person> users = new ArrayList<Person>();
		
		
		do {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Què vols fer dins de l'aplicació?" + 
																"\n1. Crear un vehicle" + 
																"\n2. Crear un usuari" + 
																"\n3. Sortir del programa"));
			
			switch (menu) {
			case 1: 			// Menú vehicle
				VehicleView vehicleView = new VehicleView();
				vehicleView.createVehicle(users, vehicles);
				break;

			case 2: 			// Menú usuari
				UserView userView = new UserView();
				userView.createUser(users, vehicles);
				break;
			
			case 3: 			// Sortir
				System.out.println("Finalitzant el programa...");

				break;
			
			default:
				System.out.println("El valor introduit no és correcte, escull una altra opció.");;
				
			}
		
		} while (menu != 3);
		
		System.out.println("Programa finalitzat");

	}
}