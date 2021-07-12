package views;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.vehicles.project.Person;
import com.vehicles.project.Vehicle;

import exceptions.LicenseException;

public class VehicleView {
	
	public void createVehicle(List<Person> users, List <Vehicle> vehicles) throws LicenseException {
		int option;
		int typeOfLicenseOwner;
		int ownerDriver;
		int typeOfLicenseDriver;

		List <Person> owner = new ArrayList<Person>();
		List <Person> drivers = new ArrayList<Person>();
			

		
		JOptionPane.showMessageDialog(null, "Abans de crear el vehicle, hem d'assignar-li un titular");
		
		OwnerView ownerView = new OwnerView();
		typeOfLicenseOwner = ownerView.newOwner(users, owner);
		
		System.out.println("users: " + users.size());					// Validem que s'estan afegint usuaris correctament
		System.out.println("typeOfLicense Owner: " + typeOfLicenseOwner);
		
						
		option = Integer.parseInt(JOptionPane.showInputDialog("Vols crear un cotxe, una moto o un camió? \n1. Cotxe\n2. Moto\n3. Camió"));
		
		
		if (option == 1 || option == 2 || option == 3) {
			
			ownerDriver = Integer.parseInt(JOptionPane.showInputDialog("El tilular del vehicle serà també el conductor?\n1. Sí\n2. No"));
			
			switch (ownerDriver) {
				case 1: 	// Titular és conductor
					System.out.println("La llicència del titular permet conduir aquest vehicle.");
					break;

				case 2: 	// Titular és diferent al conductor
					DriverView driverView = new DriverView();
					typeOfLicenseDriver = driverView.newOwner(users, drivers);
					System.out.println("Nou conductor creat. Verificant llicència...");
					
					System.out.println("users: " + users.size());
					
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
					
				default:
					System.out.println("Els valors introduïts no són correctes, torna-ho a intentar.");
					break;
				
			}
			
		}		
		
		
		// Segons la opció escollida, introduïm dades de vehicle i de rodes, per donar-lo d'alta al sistema.
		switch (option) {

			case 1:			// Cotxe
				if (typeOfLicenseOwner == 2 || typeOfLicenseOwner == 4 || typeOfLicenseOwner == 6 || typeOfLicenseOwner == 7) {
					CarView carView = new CarView();
					carView.carWheels(vehicles, owner, drivers);
				} else throw new LicenseException("La llicència no permet conduir cotxe.");
				break;
				
			case 2:		// Moto
				if (typeOfLicenseOwner == 1 || typeOfLicenseOwner == 4 || typeOfLicenseOwner == 5 || typeOfLicenseOwner == 7) {
					BikeView bikeView = new BikeView();
					bikeView.bikeWheels(vehicles, owner, drivers);					
				} else throw new LicenseException("La llicència no permet conduir moto.");
				break;
				
			case 3:			// Camió
				if (typeOfLicenseOwner == 3 || typeOfLicenseOwner == 5 || typeOfLicenseOwner == 6 || typeOfLicenseOwner == 7) {
					TruckView truckView = new TruckView();
					truckView.truckView(vehicles, owner, drivers);
				} else throw new LicenseException("La llicència no permet conduir camió.");
				break;
	
			default:
				System.out.println("Els valors introduïts no són correctes, torna-ho a intentar.");
				break;
			
		}
		
		System.out.println("vehicles: " + vehicles.size());					// Validem que s'estan afegint vehicles correctament

	}

}
