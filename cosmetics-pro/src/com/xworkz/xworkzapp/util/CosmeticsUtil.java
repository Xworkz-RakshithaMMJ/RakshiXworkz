package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.cosmetics.Cosmetics;

public class CosmeticsUtil {
public static void main(String[] args) {
	
	Cosmetics cosmetics = new Cosmetics();
	cosmetics.setName("Kajal");
	cosmetics.setBrand("Maybelline");
	cosmetics.setModelNumber(123);
	
	
	Cosmetics eyeliner = new Cosmetics();
	eyeliner.setName("Eyeliner");
	eyeliner.setBrand("LakeMe");
	eyeliner.setModelNumber(121);
	
	Cosmetics tacumpowder = new Cosmetics();
	tacumpowder.setName("Tacum Powder");
	tacumpowder.setBrand("Ponds");
	tacumpowder.setModelNumber(345);
	
	Cosmetics cream = new Cosmetics();
	cream.setName("Cream");
	cream.setBrand("Fair and Lovely");
	cream.setModelNumber(789);
	
	Cosmetics lipstick = new Cosmetics();
	lipstick.setName("Lipstick");
	lipstick.setBrand("Maybelline");
	lipstick.setModelNumber(567);
	
	System.out.println(cosmetics);
	System.out.println(tacumpowder);
	System.out.println(eyeliner);
	System.out.println(cream);
	System.out.println(lipstick);
	
	System.out.println(cosmetics.hashCode());
	System.out.println(tacumpowder.hashCode());
	System.out.println(eyeliner.hashCode());
	System.out.println(cream.hashCode());
	System.out.println(lipstick.hashCode());
	
    System.out.println(cosmetics.equals(lipstick));
	
}
}
