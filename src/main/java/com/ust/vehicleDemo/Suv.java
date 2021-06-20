package com.ust.vehicleDemo;

public class Suv extends Car implements VehicleDao {

	int noOfAirBags;
	int groundClearence;
	String model;
	int noOfSeats;

	public Suv() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suv(String brand, String transmission) {
		super(brand, transmission);
		// TODO Auto-generated constructor stub
	}

	public Suv(String brand, String transmission, int noOfAirBags, int groundClearence, String model, int noOfSeats) {
		super(brand, transmission);
		this.noOfAirBags = noOfAirBags;
		this.groundClearence = groundClearence;
		this.model = model;
		this.noOfSeats = noOfSeats;
	}

	public String getBrand() {
		return getBrand();
	}

	public String getTransmission() {
		return getTransmission();
	}

	public int getNoOfAirBags() {
		return noOfAirBags;
	}

	public void setNoOfAirBags(int noOfAirBags) {
		this.noOfAirBags = noOfAirBags;
	}

	public int getGroundClearence() {
		return groundClearence;
	}

	public void setGroundClearence(int groundClearence) {
		this.groundClearence = groundClearence;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public String safety() {
		
		return "5 STAR SAFETY"; 

	}

}
