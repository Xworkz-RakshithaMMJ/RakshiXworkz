package com.xworkz.xworkzapp.dto;

import com.xworkz.xworkzapp.constants.Specialization;

public class HospitalDTO {

	private String name;
	private String address;
	private Specialization spec;
	private PatientDTO patientdto;
	
	public HospitalDTO(){
		
	}
	

	public HospitalDTO(String name, String address, Specialization spec) {
		super();
		this.name = name;
		this.address = address;
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", address=" + address + ", spec=" + spec + ", patientdto=" + patientdto
				+ "]";
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

	public Specialization getSpec() {
		return spec;
	}

	public void setSpec(Specialization spec) {
		this.spec = spec;
	}
	
	
	
}
