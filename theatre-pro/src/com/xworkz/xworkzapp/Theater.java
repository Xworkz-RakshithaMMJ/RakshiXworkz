package com.xworkz.xworkzapp;

public class Theater {

	private String name;
	private int id;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Theater [name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode(){
		return  (int)id;
		
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

	

