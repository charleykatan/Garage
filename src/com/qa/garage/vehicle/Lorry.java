package com.qa.garage.vehicle;

public class Lorry extends Vehicle {

	private double maxLoad;

	public double getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(double maxLoad) {
		this.maxLoad = maxLoad;
	}

	@Override
	public String toString() {
		return super.toString() + "maxLoad = " + maxLoad;
	}
	
	public Lorry(String type, String manufacturer, String colour, double maxLoad) {
		this.type = type;
		this.manufacturer = manufacturer;
		this.colour = colour;
		this.maxLoad = maxLoad;
	}
	
}
