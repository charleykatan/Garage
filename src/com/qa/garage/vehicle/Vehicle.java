package com.qa.garage.vehicle;

public abstract class Vehicle {

	protected static int nextID = 1;
	
	protected int ID;
	protected String type;
	protected String manufacturer;
	protected String colour;
	
	public Vehicle() {
		this.ID = Vehicle.nextID;
		Vehicle.nextID++;
	}
	
	public Vehicle(String type, String manufacturer, String colour) {
		this.type = type;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.ID = Vehicle.nextID;
		Vehicle.nextID++;
	}

	@Override
	public String toString() {
		return "Vehicle: ID = " + ID + ", type = " + type + ", manufacturer = " + manufacturer + ", colour = " + colour + ", ";
	}

	public int getID() {
		return this.ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getColour() {
		return this.colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
