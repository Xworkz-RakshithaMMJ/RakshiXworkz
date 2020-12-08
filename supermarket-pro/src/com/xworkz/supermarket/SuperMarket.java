package com.xworkz.supermarket;

public class SuperMarket {
	
	private String name;
	private String address;
	private int noOfSections;
	private String products;
	private double bill;
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public int getnoOfSections(){
		return noOfSections;
	}
	public void setnoOfSections(int noOfSections){
		this.noOfSections = noOfSections;
	}
	public String getProducts(){
		return products;
	}
	public void setProducts(String products){
		this.products = products;
	}
	public double getBill(){
		return bill;
	}
	public void setBill(double bill){
		this.bill = bill;
	}
}
