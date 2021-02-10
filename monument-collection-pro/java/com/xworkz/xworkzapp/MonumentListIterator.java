package com.xworkz.xworkzapp;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;

public class MonumentListIterator {
public static void main(String[] args) {
	
	List<String> monuments=new ArrayList<String>();
	monuments.add("Taj Mahal");
	
	String charMinar="CharMinar";
	monuments.add(charMinar);
	
	monuments.add("Statue of Liberty");
	monuments.add("Mysore Palace");
	monuments.add("Vidhana Soudha");
	monuments.add("Hampi");
	
	ListIterator<String> listiterator= monuments.listIterator(4);
	while (listiterator.hasNext()) {
		System.out.println(listiterator.next());
	}
	System.out.println(listiterator.previousIndex());
	
	System.out.println("************==========**********");
	while(listiterator.hasPrevious()){
		System.out.println(listiterator.previous());
	}
}
}
