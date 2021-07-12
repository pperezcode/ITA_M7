package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AppVehiclesM7N1F2 {

	public static void main(String[] args) {
				
		String plate;
		String brand;
		String color;
		String wheelBrand;
		double wheelDiameter;
		
		
		// Demanar a l�usuari la matr�cula del cotxe, la marca i el seu color. 
		
		plate = JOptionPane.showInputDialog("Matr�cula del cotxe:").toUpperCase();
		brand = JOptionPane.showInputDialog("Marca del cotxe:").toUpperCase();
		color = JOptionPane.showInputDialog("Color del cotxe:").toUpperCase();

			
		// Crear el cotxe amb les dades anteriors. 
		
		Car myCar = null;
		
		try {
			myCar = new Car(plate, brand, color);
		} catch (Exception e) {
			System.out.println("La matr�cula ha de tenir 4 n�meros i 2-3 lletres.");
		}
					
		
		// Afegir-li dues rodes traseres demanant a l�usuari la marca i el diametre.
		
		List<Wheel> backWheels = new ArrayList<Wheel>();
		
		for (int i = 0; i <= 1; i++) {
			
			wheelBrand = JOptionPane.showInputDialog("Marca de la roda trasera " + (i + 1) + ":").toUpperCase();
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Di�metre de la roda trasera " + (i + 1) + ": "));
			
			try {
				backWheels.add(new Wheel(wheelBrand, wheelDiameter));
			} catch (Exception e){
				System.out.println("El di�metre de les rodes ha d'estar entre 0.4 i 4.");
			}
			
		}
		
		
		// Afegir-li dues rodes davanteres demanant a l�usuari la marca i el diametre.
		
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		
		for (int i = 0; i <= 1; i++) {

			wheelBrand = JOptionPane.showInputDialog("Marca de la roda davantera " + (i + 1) + ":").toUpperCase();
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Di�metre de la roda davantera " + (i + 1) + ": "));
			
			try {
				frontWheels.add(new Wheel(wheelBrand, wheelDiameter));
			} catch (Exception e){
				System.out.println("El di�metre de les rodes ha d'estar entre 0.4 i 4.");
			}
			
		}
				
		
		// Afegim les rodes al cotxe.
				
		try {
			myCar.addWheels(frontWheels, backWheels);
			System.out.println(plate + "-" + brand + "-" + color + ": afegit correctament.");
		} catch (Exception e){
			System.out.println("Les rodes introdu�des no s�n iguals.");
			
		}		
	}
}
