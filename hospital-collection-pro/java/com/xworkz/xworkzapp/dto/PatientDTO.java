package com.xworkz.xworkzapp.dto;

public class PatientDTO {

	private int patId;
	private String name;
	private String address;
	private int age;
	
	public PatientDTO(){
		
	}
	
	public PatientDTO(int patid,String name, String address, int age) {
		super();
		this.patId=patId;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "PatientDTO [patId=" + patId + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

	public int getPatId() {
		return patId;
	}

	public void setPatId(int patId) {
		this.patId = patId;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
}
