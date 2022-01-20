package com.qa.garage.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.vehicle.Car;
import com.qa.garage.vehicle.Lorry;
import com.qa.garage.vehicle.Motorbike;
import com.qa.garage.vehicle.Vehicle;

public class Garage {
	
	public List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	public List<Vehicle> toRemove = new ArrayList<Vehicle>();
	double bill;
	
	public void fixVehicle(Vehicle v) {
		System.out.println("Repairs for " + v.getColour() + " " + v.getManufacturer() + " completed.");
		if (v.getType() == "Car") {
			bill = (400 + v.getID() * 25.50);
			System.out.println("Balance owed: £" + bill);
		} else if (v.getType() == "Motorbike") {
			bill = (200 + v.getID() * 12.50);
			System.out.println("Balance owed: £" + bill);
		} else if (v.getType() == "Lorry") {
			bill = (1000 + v.getID() * 50.50);
			System.out.println("Balance owed: £" + bill);		
		}
	}
	
	public float calcBillByType() {
		float bill = 0.0f;
		for (Vehicle v : this.vehicleList)
		if (v instanceof Car) {
			Car c = (Car) v;
			bill += c.getNoOfDoors() * 50 + c.getID() * 20;
 		} else if (v instanceof Motorbike) {
 			Motorbike m = (Motorbike) v;
 			bill += m.getNoOfHelmets() * 100 + m.getID() * 30;
 		} else if (v instanceof Lorry) {
 			Lorry l = (Lorry) v;
 			bill += l.getMaxLoad() * 100 + l.getID() * 15;
 		} 
		return bill;
		
//		 {
//			if (v.getType() == "Car") {
//				bill = (400 + v.getID() * 25.50);
//				System.out.println("Bill for " + v.getColour() + " " + v.getManufacturer() +": £" + bill); // Could be improved to calculate by noOfDoors etc subclass methods
//			} else if (v.getType() == "Motorbike") {
//				bill = (200 + v.getID() * 12.50);
//				System.out.println("Bill for " + v.getColour() + " " + v.getManufacturer() +": £" + bill);
//			} else if (v.getType() == "Lorry") {
//				bill = (1000 + v.getID() * 50.50);
//				System.out.println("Bill for " + v.getColour() + " " + v.getManufacturer() +": £" + bill);
//			}
//		}
		
	}
	
	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
		System.out.println(v.getColour() + " " + v.getManufacturer() + " added to garage.");
		System.out.println("Number of vehicles in garage: " + vehicleList.size());

 	}
	
	public void removeVehicle(Vehicle v) {
		vehicleList.remove(v);
		System.out.println("Number of vehicles in garage: " + vehicleList.size());

	}
	
	public void removeVehicleByID(int ID) {

		for (Vehicle v : vehicleList) {
			if (ID == v.getID()) {
				toRemove.add(v);
			}
		}
		vehicleList.removeAll(toRemove);
		System.out.println("Vehicle ID " + ID +" has been removed. \nFull vehicle details:");
		System.out.println(toRemove);
		System.out.println("Number of vehicles in garage: " + vehicleList.size());
		System.out.println("Updated vehicle list:");
		printVehicleList();
		toRemove.clear();
			}
		
	public void removeVehiclesByType(String type) {
		
		for (Vehicle v : vehicleList) {
			if (type == v.getType()) {
				toRemove.add(v);
			}
		}
		vehicleList.removeAll(toRemove);
		toRemove.clear();
		System.out.println("All vehicles of the type " + type + " have been removed.");
		printVehicleList();
	}
	
	public void emptyGarage() {
		vehicleList.clear();
		System.out.println("Garage is empty.");
	}
	
	public void printVehicleList() {
		for(int i = 0; i < vehicleList.size(); i++){
	        System.out.print(vehicleList.get(i) + "\n");
	    } System.out.println("Number of vehicles in garage: " + vehicleList.size());
	
	}
	        
}
