package views;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.vehicles.project.Car;
import com.vehicles.project.Wheel;

public class CarView {
	
	public void carWheels() {
		String plate;
		String brand;
		String color;
		String wheelBrand;
		double wheelDiameter;
		Car myCar = null;

		plate = JOptionPane.showInputDialog("Matrícula del vehicle:").toUpperCase();
		brand = JOptionPane.showInputDialog("Marca del vehicle:").toUpperCase();
		color = JOptionPane.showInputDialog("Color del vehicle:").toUpperCase();
		
		try {
			myCar = new Car(plate, brand, color);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
		// Afegir-li dues rodes traseres demanant a l’usuari la marca i el diametre.
		List<Wheel> backWheels = new ArrayList<Wheel>();
		
		for (int i = 0; i <= 1; i++) {
			
			wheelBrand = JOptionPane.showInputDialog("Marca de la roda trasera " + (i + 1) + ":").toUpperCase();
			wheelDiameter = Double.parseDouble(JOptionPane.showInputDialog("Diàmetre de la roda trasera " + (i + 1) + ":"));
			
			try {
				backWheels.add(new Wheel(wheelBrand, wheelDiameter));
			} catch (Exception e){
				System.out.println(e.getMessage());
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
				System.out.println(e.getMessage());
			}
		}
		
		
		// Afegim les rodes al cotxe.
		try {
			myCar.addWheels(frontWheels, backWheels);
			System.out.println(plate + "-" + brand + "-" + color + ": cotxe afegit correctament.");
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
