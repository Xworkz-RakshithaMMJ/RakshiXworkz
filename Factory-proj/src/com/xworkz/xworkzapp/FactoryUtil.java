package com.xworkz.xworkzapp;

public class FactoryUtil {
public static void main(String[] args) {
	Factory fact = new DairyMilk();
	fact.toProduceGoods();
	
	Factory fact1 = new AmulIceCream();
	fact1.toProduceGoods();
}
}
