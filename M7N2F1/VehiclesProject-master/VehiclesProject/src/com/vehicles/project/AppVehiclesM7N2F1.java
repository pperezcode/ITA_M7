package com.vehicles.project;

import javax.swing.JOptionPane;

import views.*;

public class AppVehiclesM7N2F1 {

	public static void main(String[] args) {
		int option;
		
		option = Integer.parseInt(JOptionPane.showInputDialog("Vols crear un cotxe, una moto o un cami�? \n1. Cotxe\n2. Moto\n3. Cami�"));
		
		// Segons la opci� escollida, introdu�m dades de vehicle i de rodes, per donar-lo d'alta al sistema.
		switch (option) {
		case 1:			// Cotxe
			CarView carView = new CarView();
			carView.carWheels();
			break;
			
		case 2:		// Moto
			BikeView bikeView = new BikeView();
			bikeView.bikeWheels();			
			break;
			
		case 3:			// Cami�
			TruckView truckView = new TruckView();
			truckView.truckView();
			break;

		default:
			System.out.println("Els valors introdu�ts no s�n correctes, torna-ho a intentar.");
			break;
		}
	}
}
