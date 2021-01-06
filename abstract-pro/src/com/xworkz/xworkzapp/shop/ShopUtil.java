package com.xworkz.xworkzapp.shop;

public class ShopUtil {
public static void main(String[] args) {
	Shop automobileshop = new Automobile();
	automobileshop.serve(); 
	Shop bakeryshop = new Bakery();
	bakeryshop.serve();
	bakeryshop.store();
}
}
