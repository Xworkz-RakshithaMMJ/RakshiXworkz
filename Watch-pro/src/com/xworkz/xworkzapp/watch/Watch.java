package com.xworkz.xworkzapp.watch;

import java.util.Date;

public class Watch {

	public String modelNo;
	public double price;
	
	 public void displayTime(){
		Date date =new Date();
		System.out.println(date);
	}
	
}
