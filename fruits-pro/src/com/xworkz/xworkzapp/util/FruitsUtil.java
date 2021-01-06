package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.fruits.Fruits;
import com.xworkz.xworkzapp.fruits.Mango;

public class FruitsUtil {
	public static void main(String[] args) {
		//up casting
		Fruits fruits = new Mango();
		//down casting
		Mango mango = (Mango)fruits;
		fruits.price=45.00;
		fruits.quality="First quality";
		fruits.tokeepHealthy();
		System.out.println(fruits.price+"  "+fruits.quality);
	}
	}


