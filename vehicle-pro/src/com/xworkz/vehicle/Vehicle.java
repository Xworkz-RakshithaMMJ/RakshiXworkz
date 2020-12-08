package com.xworkz.vehicle;

public class Vehicle {

	private String name;
	private String typeOfVehicle;
	private String noOfWheels;
	private double price;
	
	public Vehicle(String name,String typeOfVehicle,String noOfWheels,double price){
		this.name=name;
		this.typeOfVehicle=typeOfVehicle;
		this.noOfWheels=noOfWheels;
		this.price=price;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getTypeOfVehicle(){
		return typeOfVehicle;
	}
	public void setTypeOfVehicle(String typeOfVehicle ){
		this.typeOfVehicle=typeOfVehicle;
	}
	public String getNoOfWheels(){
		return noOfWheels;
	}
	public void setNoOfWheels(String noOfWheels){
		this.noOfWheels=noOfWheels;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
}
