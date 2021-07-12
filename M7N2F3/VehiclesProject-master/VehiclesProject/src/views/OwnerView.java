package views;

import java.time.DateTimeException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import com.vehicles.project.License;
import com.vehicles.project.Owner;

public class OwnerView {
	
	public int newOwner() {
		String name;
		String surname;
		String fullName;		
				
		int day;
		int month;
		int year;
		int id;
		int typeOfLicense;
		int askForInsurance;
		int askForOwnGarage;

		boolean dataValidation;
		boolean insurance;
		boolean ownGarage;
		
		License driverLicense = null;
		LocalDate dob = null;
		LocalDate expiryDate = null;
		Owner ownerNew = null;
		
		
		name = JOptionPane.showInputDialog("Nom del titular:").toUpperCase();
		surname = JOptionPane.showInputDialog("Cognoms del titular:").toUpperCase();
		fullName = name + " " + surname;

		// Data de naixement
		do {
			day = Integer.parseInt(JOptionPane.showInputDialog("Data de naixement\n DIA:"));	
			month = Integer.parseInt(JOptionPane.showInputDialog("Data de naixement\n MES (en número):"));
			year = Integer.parseInt(JOptionPane.showInputDialog("Data de naixement\n ANY:"));
						
			try {
				dob = LocalDate.of(year, month, day);
				dataValidation = true;
			} catch (DateTimeException e) {
				System.out.println(e.getMessage());
				dataValidation = false;
			}
			
		} while (!dataValidation);
		
				
		// Llicència
		id = Integer.parseInt(JOptionPane.showInputDialog("Número de llicència de conduir."));	
		typeOfLicense = Integer.parseInt(JOptionPane.showInputDialog("Quin tipus de llicència tens?" + 
																	"\n1. Moto" + 
																	"\n2. Cotxe" + 
																	"\n3. Camió" + 
																	"\n4. Moto + Cotxe" +
																	"\n5. Moto + Camió" +
																	"\n6. Cotxe + Camió" +
																	"\n7. Moto + Cotxe + Camió"));
		
						
		// Expiry date
		do {
			day = Integer.parseInt(JOptionPane.showInputDialog("Caducitat de la llicència\n DIA:"));	
			month = Integer.parseInt(JOptionPane.showInputDialog("Caducitat de la llicència\n MES (en número):"));
			year = Integer.parseInt(JOptionPane.showInputDialog("Caducitat de la llicència\n ANY:"));
						
			try {
				expiryDate = LocalDate.of(year, month, day);
				dataValidation = true;
			} catch (DateTimeException e) {
				System.out.println(e.getMessage());
				dataValidation = false;
			}
			
		} while (!dataValidation);
		
		
		// Driver's License
		try {
			driverLicense = new License(id, typeOfLicense, fullName, expiryDate);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		askForInsurance = Integer.parseInt(JOptionPane.showInputDialog("El titular té assegurança?\n1. Sí\n2. No"));
		
		if (askForInsurance == 1) {
			insurance = true;
		} else {
			insurance = false;
		}
		
		askForOwnGarage = Integer.parseInt(JOptionPane.showInputDialog("El titular té garatge propi?\n1. Sí\n2. No"));

		if (askForOwnGarage == 1) {
			ownGarage = true;
		} else {
			ownGarage = false;
		}
		
		
		try {
			ownerNew = new Owner(name, surname, dob, driverLicense, insurance, ownGarage);
			System.out.println(name + " " + surname + ": titular afegit correctament.");
			return typeOfLicense;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}		
		
		
	}
}
