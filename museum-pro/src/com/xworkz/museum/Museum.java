package com.xworkz.museum;

public class Museum {
	//instance members
	public int id;
	public String name;
	public String address;
	public int noOfFloors;
	public String department;
	
	public Museum(int id,String name,String address,int noOfFloors,String department)
	{
		System.out.println("Museum cont with no arg is created");
		
		this.id=id;
		this.name=name;
		this.address=address;
		this.noOfFloors=noOfFloors;
		this.department=department;
		
	}	
}
