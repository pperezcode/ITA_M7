package views;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.vehicles.project.Person;
import com.vehicles.project.Truck;
import com.vehicles.project.Vehicle;
import com.vehicles.project.Wheel;

public class TruckView {
		
	public void truckView(List<Vehicle> vehicles, List<Person> owner, List<Person> drivers) {	
		String plate;
		String brand;
		String color;
		String wheelBrand;
		
		double wheelDiameter;
		
		Truck myTruck = null;

		
		plate = JOptionPane.showInputDialog("Matrícula del vehicle:").toUpperCase();
		brand = JOptionPane.showInputDialog("Marca del vehicle:").toUpperCase();
		color = JOptionPane.showInputDialog("Color del vehicle:").toUpperCase();

		try {
			myTruck = new Truck(plate, brand, color, owner, drivers);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		// Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
		List<Wheel> backWheelsT = new ArrayList<Wheel>();
		
		for (int i = 0; i <= 1; i++) {
			
			wheelBrand = JOptionPane.showInputDialog("Marca de la roda trasera " + (i + 1) + ":").toUpperCase();
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda trasera " + (i + 1) + ":"));
			
			try {
				backWheelsT.add(new Wheel(wheelBrand, wheelDiameter));
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		
		// Afegir-li dues rodes davanteres demanant a l’usuari la marca i el diametre.
		List<Wheel> frontWheelsT = new ArrayList<Wheel>();
		
		for (int i = 0; i <= 1; i++) {
			
			wheelBrand = JOptionPane.showInputDialog("Marca de la roda davantera " + (i + 1) + ":").toUpperCase();
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda davantera " + (i + 1) + ":"));
			
			try {
				frontWheelsT.add(new Wheel(wheelBrand, wheelDiameter));
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
		
		
		// Afegim les rodes al cotxe.
		try {
			myTruck.addWheels(frontWheelsT, backWheelsT);
			System.out.println(plate + "-" + brand + "-" + color + ": camió afegit correctament.");
			vehicles.add(myTruck);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	
	}	
}

