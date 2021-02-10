package com.xworkz.xworkzapp.dto;

import java.util.Date;

import com.xworkz.xworkzapp.constants.BloodGroup;
import com.xworkz.xworkzapp.constants.Gender;

public class CommonDTO {

	private String name;
	private int age;
	private AddressDTO addressdto;
	private Date DOB;
	private long mobileNo;
	private BloodGroup bloodGroup;
	private Gender gender;
	
	public CommonDTO(){
		
	}

	public CommonDTO(String name, int age, AddressDTO addressdto, Date dOB, long mobileNo, BloodGroup bloodGroup,
			Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.addressdto = addressdto;
		DOB = dOB;
		this.mobileNo = mobileNo;
		this.bloodGroup = bloodGroup;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public AddressDTO getAddressdto() {
		return addressdto;
	}

	public void setAddressdto(AddressDTO addressdto) {
		this.addressdto = addressdto;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
}
