package com.xworkz.rocket;

import java.util.Date;

public class Rocket {
	public String name;
	public int id;
	public Date date = new Date();
	public Rocket(){
		System.out.println("created");	
	}
	public Rocket(String name, int id) {
		this.name = name;
		this.id = id;
		
	}
}
