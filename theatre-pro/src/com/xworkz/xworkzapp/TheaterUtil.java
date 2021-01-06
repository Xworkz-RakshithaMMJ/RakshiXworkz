package com.xworkz.xworkzapp;

public class TheaterUtil {
public static void main(String[] args) {
	
	Theater theater = new Theater();
	theater.setName("Navrang");
	theater.setAddress("Rajajinagar");
	theater.setId(1);
	
	Theater sgk = new Theater();
	sgk.setName("SGK");
	sgk.setAddress("Kottur");
	sgk.setId(2);
	
	Theater renuka = new Theater();
	renuka.setName("Renuka");
	renuka.setAddress("Kottur");
	renuka.setId(3);
	
	Theater radhika = new Theater();
	radhika.setName("Radhika");
	radhika.setAddress("Ballari");
	radhika.setId(4);
	
	Theater gayathri = new Theater();
	gayathri.setName("Gayathri");
	gayathri.setAddress("Mysore");
	gayathri.setId(5);
	
	System.out.println(theater);
	System.out.println(sgk);
	System.out.println(renuka);
	System.out.println(radhika);
	System.out.println(gayathri);
	
	System.out.println(theater.hashCode());
	System.out.println(sgk.hashCode());
	System.out.println(renuka.hashCode());
	System.out.println(radhika.hashCode());
	System.out.println(gayathri.hashCode());

    System.out.println(theater.equals(renuka));
	   
}
}
