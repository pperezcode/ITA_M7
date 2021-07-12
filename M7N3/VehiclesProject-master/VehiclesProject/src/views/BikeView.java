package views;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.vehicles.project.Bike;
import com.vehicles.project.Person;
import com.vehicles.project.Vehicle;
import com.vehicles.project.Wheel;

public class BikeView {
		
	public void bikeWheels(List<Vehicle> vehicles, List<Person> owner, List<Person> drivers) {
		String plate;
		String brand;
		String color;
		String wheelBrand;
		
		double wheelDiameter;
		
		Bike myBike = null;
		
		
		plate = JOptionPane.showInputDialog("Matrícula del vehicle:").toUpperCase();
		brand = JOptionPane.showInputDialog("Marca del vehicle:").toUpperCase();
		color = JOptionPane.showInputDialog("Color del vehicle:").toUpperCase();

		try {
			myBike = new Bike(plate, brand, color, owner, drivers);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		// Afegir-li la roda trasera, demanant a l’usuari la marca i el diametre.
		List<Wheel> backWheel = new ArrayList<Wheel>();
		
		wheelBrand = JOptionPane.showInputDialog("Marca de la roda trasera:").toUpperCase();
		wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda trasera:"));
		
		try {
			backWheel.add(new Wheel(wheelBrand, wheelDiameter));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
			
		
		// Afegir-li la roda davantera demanant a l’usuari la marca i el diametre.
		List<Wheel> frontWheel = new ArrayList<Wheel>();
		
		wheelBrand = JOptionPane.showInputDialog("Marca de la roda davantera:").toUpperCase();
		wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda davantera:"));
		
		try {
			frontWheel.add(new Wheel(wheelBrand, wheelDiameter));
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
			
		
		// Afegim les rodes a la moto.
		try {
			myBike.addWheels(frontWheel, backWheel);
			System.out.println(plate + "-" + brand + "-" + color + ": moto afegida correctament.");
			vehicles.add(myBike);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	
	}	
}

