package com.xworkz.util;

import com.xworkz.industry.SteelIndustry;

public class IndustryUtil {
public static void main(String[] args) {
	SteelIndustry industry = new SteelIndustry("HSR layout",456,"manufacturing");
	System.out.println(industry.getArea()+" "+industry.getNoOfWorkers()+" "+industry.getType());
}
}
