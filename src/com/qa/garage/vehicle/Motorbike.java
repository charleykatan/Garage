package com.qa.garage.vehicle;

public class Motorbike extends Vehicle {

	private int noOfHelmets;

	public int getNoOfHelmets() {
		return noOfHelmets;
	}

	public void setNoOfHelmets(int noOfHelmets) {
		this.noOfHelmets = noOfHelmets;
	}

	@Override
	public String toString() {
		return super.toString() + "noOfHelmets = " + noOfHelmets;
	}
	
	public Motorbike(String type, String manufacturer, String colour, int noOfHelmets) {
		this.type = type;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.noOfHelmets = noOfHelmets;
	}
	
}
