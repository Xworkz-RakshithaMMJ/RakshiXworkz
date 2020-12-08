package com.xworkz.VegetableUtil;

import com.xworkz.Vegetable.Vegetable;

public class VegetableUtil {
public static void main(String[] args) {
	Vegetable vege = new Vegetable();
	vege.setName("Beetroot");
	vege.setPrice(35);
	vege.setTypeOfVege("Underground growing vegetable");
	System.out.println(vege.getName()+" "+vege.getPrice()+" "+vege.getTypeOfVege());
	
}
}
