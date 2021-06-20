package com.ust.vehicleDemo;

public class Car {

	String brand;
	String transmission;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public Car(String brand, String transmission) {
		super();
		this.brand = brand;
		this.transmission = transmission;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	

}
