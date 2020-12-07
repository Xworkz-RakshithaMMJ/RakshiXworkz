package com.xworkz.fruitUtil;

import com.xworkz.fruit.Fruit;

public class FruitUtil {
public static void main(String[] args) {
	Fruit fruit = new Fruit();
	fruit.setName("Orange per kg");
	fruit.setPrice(40);
	System.out.println(fruit.getName()+" "+fruit.getPrice());
}
}
