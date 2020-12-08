package com.xworkz.clothesUtil;

import com.xworkz.clothes.Clothes;

public class ClothesUtil {
public static void main(String[] args) {
	Clothes clothe = new Clothes();
	clothe.setCategory("Jeans");
	clothe.setBrand("Levis");
	clothe.setGender("Male");
	clothe.setPrice(1455);
	System.out.println(clothe.getCategory()+" "+clothe.getBrand()+" "+clothe.getGender()+" "+clothe.getPrice());
}
}
