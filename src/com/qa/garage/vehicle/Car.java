package com.qa.garage.vehicle;

public class Car extends Vehicle {

	private int noOfDoors;

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	@Override
	public String toString() {
		return super.toString() + "noOfDoors = " + noOfDoors;
	}
	
	public Car(String type, String manufacturer, String colour, int noOfDoors) {
		this.type = type;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.noOfDoors = noOfDoors;
	}
	
}
