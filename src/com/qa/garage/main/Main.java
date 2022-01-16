package com.qa.garage.main;

import java.util.Arrays;

import com.qa.garage.garage.Garage;
import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Lorry;
import com.qa.garage.vehicle.Motorbike;

public class Main {

	public static void main(String[] args) {

		Garage myGarage = new Garage();
		Car peaGreen = new Car("Car", "Hyundai", "Electric Green", 4);
		Car blackMerc = new Car("Car", "Mercedes", "Black", 5);
		Motorbike vespa = new Motorbike("Motorbike", "Vespa", "Red", 1);
		Motorbike harley = new Motorbike("Motorbike", "Harley Davidson", "Black", 2);
		Lorry eddieStoppard = new Lorry("Lorry", "BMW", "Green", 2500.00);
		Lorry waitrose = new Lorry("Lorry", "Mercedes", "White", 5000.00);
		
		myGarage.vehicleList.addAll(Arrays.asList(peaGreen, blackMerc, vespa, harley, eddieStoppard, waitrose));
		
		Motorbike bella = new Motorbike("Motorbike", "Yamaha", "Green", 2);
		myGarage.addVehicle(bella);
		myGarage.fixVehicle(bella);
		myGarage.printVehicleList();
		myGarage.calcBillByType();
		myGarage.removeVehicleByID(4);
		myGarage.fixVehicle(waitrose);

	}

}
