package com.vehicles.project;

import javax.swing.JOptionPane;

import exceptions.LicenseException;
import views.*;

public class AppVehiclesM7N2F3 {

	public static void main(String[] args) throws LicenseException {
		int option;
		int typeOfLicenseOwner;
		int ownerDriver;
		int typeOfLicenseDriver;

		
		// Crear l'usuari (tipus Titular) amb totes les dades ja emplenades. 
		
		OwnerView ownerView = new OwnerView();
		typeOfLicenseOwner = ownerView.newOwner();
		
		System.out.println("typeOfLicense Owner: " + typeOfLicenseOwner);
		
		/* Per poder crear un vehicle has de tenir la llicència adequada, de no tenir-la t'ha d'avisar amb una excepció.
		 * 
		 *  Quin tipus de llicència tens?" + 
		 *  "\n1. Moto" + 
			"\n2. Cotxe" + 
			"\n3. Camió" + 
			"\n4. Moto + Cotxe" +
			"\n5. Moto + Camió" +
			"\n6. Cotxe + Camió" +
			"\n7. Moto + Cotxe + Camió"));
																	
		 */
				
		option = Integer.parseInt(JOptionPane.showInputDialog("Vols crear un cotxe, una moto o un camió? \n1. Cotxe\n2. Moto\n3. Camió"));
		
		// Segons la opció escollida, introduïm dades de vehicle i de rodes, per donar-lo d'alta al sistema.
		switch (option) {
		case 1:			// Cotxe
			if (typeOfLicenseOwner == 2 || typeOfLicenseOwner == 4 || typeOfLicenseOwner == 6 || typeOfLicenseOwner == 7) {
				CarView carView = new CarView();
				carView.carWheels();
			} else throw new LicenseException("La llicència no permet conduir cotxe.");
			
					
			break;
			
		case 2:		// Moto
			if (typeOfLicenseOwner == 1 || typeOfLicenseOwner == 4 || typeOfLicenseOwner == 5 || typeOfLicenseOwner == 7) {
				BikeView bikeView = new BikeView();
				bikeView.bikeWheels();					
			} else throw new LicenseException("La llicència no permet conduir moto.");
			break;
			
		case 3:			// Camió
			if (typeOfLicenseOwner == 3 || typeOfLicenseOwner == 5 || typeOfLicenseOwner == 6 || typeOfLicenseOwner == 7) {
				TruckView truckView = new TruckView();
				truckView.truckView();
			} else throw new LicenseException("La llicència no permet conduir camió.");
			break;

		default:
			System.out.println("Els valors introduïts no són correctes, torna-ho a intentar.");
			break;
		}
		
		if (option == 1 || option == 2 || option == 3) {
			
			ownerDriver = Integer.parseInt(JOptionPane.showInputDialog("El tilular del vehicle serà també el conductor?\n1. Sí\n2. No"));
			
			switch (ownerDriver) {
			case 1: 	// Titular és conductor
				System.out.println("La llicència del titular permet conduir aquest vehicle.");
				break;
			case 2: 	// Titular és diferent al conductor
				DriverView driverView = new DriverView();
				typeOfLicenseDriver = driverView.newOwner();
				System.out.println("Nou conductor creat. Verificant llicència...");
				
				switch (option) {
				case 1:			// Cotxe
					if (typeOfLicenseDriver == 2 || typeOfLicenseDriver == 4 || typeOfLicenseDriver == 6 || typeOfLicenseDriver == 7) {
						System.out.println("El conductor té llicència apta per a conduir cotxe.");
					} else throw new LicenseException("La llicència no permet conduir cotxe.");
					break;
					
				case 2:		// Moto
					if (typeOfLicenseDriver == 1 || typeOfLicenseDriver == 4 || typeOfLicenseDriver == 5 || typeOfLicenseDriver == 7) {
						System.out.println("El conductor té llicència apta per a conduir moto.");					
					} else throw new LicenseException("La llicència no permet conduir moto.");
					break;
					
				case 3:			// Camió
					if (typeOfLicenseDriver == 3 || typeOfLicenseDriver == 5 || typeOfLicenseDriver == 6 || typeOfLicenseDriver == 7) {
						System.out.println("El conductor té llicència apta per a conduir camió.");					
					} else throw new LicenseException("La llicència no permet conduir camió.");
					break;

				default:
					System.out.println("Els valors introduïts no són correctes, torna-ho a intentar.");
					break;
				}
			}
			
		}
		
	}
}
