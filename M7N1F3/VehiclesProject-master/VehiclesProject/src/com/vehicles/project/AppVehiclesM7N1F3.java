package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AppVehiclesM7N1F3 {

	public static void main(String[] args) {
		int option;
		String plate;
		String brand;
		String color;
		String wheelBrand;
		double wheelDiameter;
		
		// Preguntar a l’usuari si vol crear un cotxe o una moto. 
		option = Integer.parseInt(JOptionPane.showInputDialog("Vols crear un cotxe o una moto? \n1. Cotxe\n2. Moto"));
		
		
		// Demanar a l’usuari la matrícula, la marca i el seu color.
		plate = JOptionPane.showInputDialog("Matrícula del vehicle:").toUpperCase();
		brand = JOptionPane.showInputDialog("Marca del vehicle:").toUpperCase();
		color = JOptionPane.showInputDialog("Color del vehicle:").toUpperCase();

		
		// Crear el vehícle amb les dades anteriors. Afegir-li les rodes traseres i davanteres, demanant a l'usuari marca i diàmetre.
		switch (option) {
		case 1:			// Cotxe
			Car myCar = null;
			try {
				myCar = new Car(plate, brand, color);
			} catch (Exception e) {
				System.out.println("La matrícula ha de tenir 4 números i 2-3 lletres.");
			}

			// Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
			List<Wheel> backWheels = new ArrayList<Wheel>();
			
			for (int i = 0; i <= 1; i++) {
				
				wheelBrand = JOptionPane.showInputDialog("Marca de la roda trasera " + (i + 1) + ":").toUpperCase();
				wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda trasera " + (i + 1) + ":"));
				
				try {
					backWheels.add(new Wheel(wheelBrand, wheelDiameter));
				} catch (Exception e){
					System.out.println("El diàmetre de les rodes ha d'estar entre 0.4 i 4.");
				}
			}
			
			// Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.
			List<Wheel> frontWheels = new ArrayList<Wheel>();
			
			for (int i = 0; i <= 1; i++) {
				
				wheelBrand = JOptionPane.showInputDialog("Marca de la roda davantera " + (i + 1) + ":").toUpperCase();
				wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda davantera " + (i + 1) + ":"));
				
				try {
					frontWheels.add(new Wheel(wheelBrand, wheelDiameter));
				} catch (Exception e){
					System.out.println("El diàmetre de les rodes ha d'estar entre 0.4 i 4.");
				}
			}
			
			// Afegim les rodes al cotxe.
			try {
				myCar.addWheels(frontWheels, backWheels);
				System.out.println(plate + "-" + brand + "-" + color + ": cotxe afegit correctament.");
			} catch (Exception e){
				System.out.println("Les rodes introduïdes no són iguals.");
			}
			break;
			
		case 2:		// Moto
			Bike myBike = null;
			try {
				myBike = new Bike(plate, brand, color);
			} catch (Exception e) {
				System.out.println("La matrícula ha de tenir 4 números i 2-3 lletres.");
			}

			// Afegir-li la roda trasera, demanant a l’usuari la marca i el diametre.
			List<Wheel> backWheel = new ArrayList<Wheel>();
			
			wheelBrand = JOptionPane.showInputDialog("Marca de la roda trasera:").toUpperCase();
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda trasera:"));
			
			try {
				backWheel.add(new Wheel(wheelBrand, wheelDiameter));
			} catch (Exception e){
				System.out.println("El diàmetre de les rodes ha d'estar entre 0.4 i 4.");
			}
						
			// Afegir-li la roda davantera demanant a l’usuari la marca i el diametre.
			List<Wheel> frontWheel = new ArrayList<Wheel>();
			
			wheelBrand = JOptionPane.showInputDialog("Marca de la roda davantera:").toUpperCase();
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda davantera:"));
			
			try {
				frontWheel.add(new Wheel(wheelBrand, wheelDiameter));
			} catch (Exception e){
				System.out.println("El diàmetre de les rodes ha d'estar entre 0.4 i 4.");
			}
						
			// Afegim les rodes a la moto.
			try {
				myBike.addWheels(frontWheel, backWheel);
				System.out.println(plate + "-" + brand + "-" + color + ": moto afegida correctament.");
			} catch (Exception e) {
				System.out.println("Les rodes introduïdes no són iguals.");
			}
				
			break;

		default:
			System.out.println("Els valors introduïts no són correctes, torna-ho a intentar.");
			break;
		}
	}
}
