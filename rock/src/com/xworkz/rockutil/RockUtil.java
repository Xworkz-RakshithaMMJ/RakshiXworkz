package com.xworkz.rockutil;

import java.util.Date;

import com.xworkz.rock.Rock;

public class RockUtil {
public static void main(String[] args) {
	Rock rocket = new Rock();
	rocket.setName("PSLV");
	rocket.setId(567);
	rocket.setDate(new Date());
	System.out.println(rocket.getName()+" "+rocket.getDate()+" "+rocket.getId());
}
}
