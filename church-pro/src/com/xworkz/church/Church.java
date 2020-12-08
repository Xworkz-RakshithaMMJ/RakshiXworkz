package com.xworkz.church;

public class Church {

	
	private String name;
	private String address;
	private int noOfFathersAndSisters;
	
	public Church(){
		System.out.println("Church object is created");
	}
	public Church(String name,String address,int noOfFathersAndSisters){
		this.name=name;
		this.address=address;
		this.noOfFathersAndSisters=noOfFathersAndSisters;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public int getNoOfFathersAndSisters(){
		return noOfFathersAndSisters;
	}
	public void setNoOfFathersAndSisters(int noOfFathersAndSisters){
		this.noOfFathersAndSisters=noOfFathersAndSisters;
	}
}
