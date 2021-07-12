package views;

import java.time.DateTimeException;
import java.time.LocalDate;

import javax.swing.JOptionPane;

import com.vehicles.project.Driver;
import com.vehicles.project.License;

public class DriverView {
	
	public int newOwner() {
		String name;
		String surname;
		String fullName;		
				
		int day;
		int month;
		int year;
		int id;
		int typeOfLicense;
		
		boolean dataValidation;
		
		License driverLicense = null;
		LocalDate dob = null;
		LocalDate expiryDate = null;
		Driver driverNew = null;
		
				
		name = JOptionPane.showInputDialog("Nom del conductor:").toUpperCase();
		surname = JOptionPane.showInputDialog("Cognoms del conductor:").toUpperCase();
		fullName = name + " " + surname;

		// Data de naixement
		do {
			day = Integer.parseInt(JOptionPane.showInputDialog("Data de naixement\n DIA:"));	
			month = Integer.parseInt(JOptionPane.showInputDialog("Data de naixement\n MES (en n�mero):"));
			year = Integer.parseInt(JOptionPane.showInputDialog("Data de naixement\n ANY:"));
						
			try {
				dob = LocalDate.of(year, month, day);
				dataValidation = true;
			} catch (DateTimeException e) {
				System.out.println(e.getMessage());
				dataValidation = false;
			}
			
		} while (!dataValidation);
		
				
		// Llic�ncia
		id = Integer.parseInt(JOptionPane.showInputDialog("N�mero de llic�ncia de conduir."));	
		typeOfLicense = Integer.parseInt(JOptionPane.showInputDialog("Quin tipus de llic�ncia tens?" + 
																	"\n1. Moto" + 
																	"\n2. Cotxe" + 
																	"\n3. Cami�" + 
																	"\n4. Moto + Cotxe" +
																	"\n5. Moto + Cami�" +
																	"\n6. Cotxe + Cami�" +
																	"\n7. Moto + Cotxe + Cami�"));
		
						
		// Expiry date
		do {
			day = Integer.parseInt(JOptionPane.showInputDialog("Caducitat de la llic�ncia\n DIA:"));	
			month = Integer.parseInt(JOptionPane.showInputDialog("Caducitat de la llic�ncia\n MES (en n�mero):"));
			year = Integer.parseInt(JOptionPane.showInputDialog("Caducitat de la llic�ncia\n ANY:"));
						
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

				
		try {
			driverNew = new Driver(name, surname, dob, driverLicense);
			System.out.println(name + " " + surname + ": titular afegit correctament.");
			return typeOfLicense;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return -1;
		}		
		
	}
}
