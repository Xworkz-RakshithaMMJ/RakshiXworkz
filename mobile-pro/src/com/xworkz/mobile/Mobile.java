package com.xworkz.mobile;

public class Mobile {

	private String name;
	private String modelNumber;
	private double price;
	
	public Mobile(String name,String modelNumber,double price){
		this.name=name;
		this.modelNumber=modelNumber;
		this.price=price;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getModelNumber(){
		return modelNumber;
	}
	public void setModelNumber(String modelNumber){
		this.modelNumber=modelNumber;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price=price;
	}
}
