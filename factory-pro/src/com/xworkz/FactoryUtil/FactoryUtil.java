package com.xworkz.FactoryUtil;

import com.xworkz.Factory.Factory;

public class FactoryUtil {
public static void main(String[] args) {
	Factory fac = new Factory();
	fac.name="mysore sandal";
	fac.address="mysore";
	System.out.println(fac.name);
	System.out.println(fac.address);
	Factory.toProduceGoods();

}
}
