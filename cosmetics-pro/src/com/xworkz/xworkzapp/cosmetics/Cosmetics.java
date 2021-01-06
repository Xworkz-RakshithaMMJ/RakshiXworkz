package com.xworkz.xworkzapp.cosmetics;

public class Cosmetics {

	private String name;
	private int modelNumber;
	private String brand;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Cosmetics [name=" + name + ", brand=" + brand + "]";
	}
	
	@Override
	public int hashCode(){
		return  (int)modelNumber;
		
	}
	@Override
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null){
			System.out.println("Object is null");
		}
		if(this.hashCode() == obj.hashCode()){
			return true;	
		}
		if(this.name == obj){
			return true;
		}
		return false;
		
	}
	
}

	

	

