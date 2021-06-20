package com.ust.vehicleDemo;

public class Sedan extends Car implements VehicleDao {

	int groundClearence;
	String model;
	int noOfSeats;
	
	public String getBrand() {
		return getBrand();
	}

	public Sedan(String brand, String transmission, int groundClearence, String model, int noOfSeats) {
		super(brand, transmission);
		this.groundClearence = groundClearence;
		this.model = model;
		this.noOfSeats = noOfSeats;
	}

	public Sedan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sedan(String brand, String transmission) {
		super(brand, transmission);
		// TODO Auto-generated constructor stub
	}

	public String getTransmission() {
		return getTransmission();
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
		// TODO Auto-generated method stub
		return "3 STAR Safety";
	}

	
}
