package com.xworkz.supermarketUtil;

import com.xworkz.supermarket.SuperMarket;

public class SuperMarketUtil {
public static void main(String[] args) {
	SuperMarket superMarket = new SuperMarket();
	superMarket.setName("Amma's Supermarket");
	superMarket.setAddress("Gandhinagar,Ballari.");
	superMarket.setnoOfSections(18);
	superMarket.setProducts("Household products");
	superMarket.setBill(867.98);
	System.out.println(superMarket.getName()+" "+superMarket.getAddress()+" "+superMarket.getnoOfSections()+" "+superMarket.getProducts()+" "+superMarket.getBill());
}
}
