package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.clothes.Clothes;

public class ClothesUtil {
public static void main(String[] args) {
	
	Clothes clothes = new Clothes();
	clothes.setName("Shirt");
	clothes.setBrand("Lee");
	clothes.setModId(34);
	
	Clothes pant = new Clothes();
	pant.setName("Pant");
	pant.setBrand("Pepe Jeans");
	pant.setModId(12);
	
	Clothes leggings = new Clothes();
	leggings.setName("Leggings");
	leggings.setBrand("Avasa");
	leggings.setModId(56);
	
	Clothes plazo = new Clothes();
	plazo.setName("Plazo");
	plazo.setBrand("xyz");
	plazo.setModId(78);
	
	Clothes jeans = new Clothes();
	jeans.setName("Jeans");
	jeans.setBrand("Levi's");
	jeans.setModId(18);
	
	System.out.println(clothes);
	System.out.println(pant);
	System.out.println(leggings);
	System.out.println(plazo);
	System.out.println(jeans);
	
	System.out.println(clothes.hashCode());
	System.out.println(pant.hashCode());
	System.out.println(leggings.hashCode());
	System.out.println(plazo.hashCode());
	System.out.println(jeans.hashCode());
	
    System.out.println(clothes.equals(jeans));
	
}
}

