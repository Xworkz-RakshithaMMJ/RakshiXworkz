package com.xworkz.rocketUtil;

import com.xworkz.rocket.Rocket;

public class RocketUtil {
	
public static void main(String[] args) {
	Rocket rocket = new Rocket("PSLV",567);
	//rocket.date = new Date();    
	System.out.println(rocket.id + " "+rocket.date+" "+rocket.name);
}
}
