package com.xworkz.xworkzapp.clothes;

public class Clothes {

	private String name;
	private String brand;
	private int modId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getModId() {
		return modId;
	}
	public void setModId(int modId) {
		this.modId = modId;
	}
	
	@Override
	public String toString() {
		return "Clothes [name=" + name + ", brand=" + brand + "]";
	}
	
	@Override
	public int hashCode(){
		return  (int)modId;
		
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
