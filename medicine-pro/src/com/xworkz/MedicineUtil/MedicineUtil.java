package com.xworkz.MedicineUtil;

import com.xworkz.Medicine.Medicine;

public class MedicineUtil {
	public static void main(String[] args)
	{
	Medicine med = new Medicine();
	med.name="crocin";
	med.price=10;
	System.out.println(med.name);
	System.out.println(med.price);
	Medicine.toCure();
	}
}
