package com.xworkz.spring.component;

public class Power {

	private boolean on;

	public Power(boolean on) {

		super();
		System.out.println("invoked Power");
		this.on = on;
	}

	public boolean isOn() {
		return on;
	}
}
