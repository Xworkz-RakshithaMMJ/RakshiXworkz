package com.xworkz.spring.component;

public class Motor {

	private int warrantyPeriod;

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	public void rotate() {
		System.out.println("motor rotating");
	}
}
