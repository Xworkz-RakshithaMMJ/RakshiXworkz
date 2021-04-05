package com.xworkz.spring.component;

public class WashingMachine {

	private String companyName;
	private float capacity;
	private Motor motor;
	private Power pow;

	public WashingMachine() {
		System.out.println("invoked WashingMachine");
	}

	public WashingMachine(String companyName, float capacity, Motor motor, Power pow) {
		super();
		this.companyName = companyName;
		this.capacity = capacity;
		this.motor = motor;
		this.pow = pow;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCapacity(float capacity) {
		this.capacity = capacity;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public void setPow(Power pow) {
		this.pow = pow;
	}

	public void wash() {
		if (pow.isOn()) {
			this.motor.rotate();
		}

	}

	@Override
	public String toString() {
		return "WashingMachine [companyName=" + companyName + ", capacity=" + capacity + ", motor=" + motor + ", pow="
				+ pow + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void displayDetails() {
		System.out.println("invoked displayDetails");
		System.out.println(this.capacity);
		System.out.println(this.companyName);
		System.out.println(this.pow);
		System.out.println(this.motor);
	}

}
