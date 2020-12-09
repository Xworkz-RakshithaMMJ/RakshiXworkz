package com.xworkz.util;

import com.xworkz.country.India;

public class CountryUtil {
public static void main(String[] args) {
	India india = new India(30,680,"New Delhi");
	/*india.setNoOfStates(28);
	india.setNoOfLang(780);
	india.setCapital("Delhi");*/
	/*india.noOfStates=45;
	india.noOfLang=657;
	india.capital="New Delhi";
	System.out.println(india.noOfStates()+" "+india.noOfLang()+" "+india.capital());*/
	System.out.println(india.getNoOfStates()+" "+india.getNoOfLang()+" "+india.getCapital());
}
}
