package com.xworkz.xworkzapp;

public class HumanTester {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.setAge(26);
		human.setName("Rajee");
		human.setAadharNumber(101);
		System.out.println(human);
		

		Human virat = new Human();
		virat.setAge(28);
		virat.setName("Virat");
		virat.setAadharNumber(101);
		                             

		Human arjun = new Human();
		arjun.setAge(29);
		arjun.setName("Arjun");
		arjun.setAadharNumber(103);
	
		Human geetha = new Human();
		geetha.setAge(30);
		geetha.setName("Geeta");
		geetha.setAadharNumber(104);
	
		Human pradeep = new Human();
		pradeep.setAge(32);
		pradeep.setName("Pradeep");
		pradeep.setAadharNumber(105);
		System.out.println(arjun);
		System.out.println(virat);
		System.out.println(geetha);
		System.out.println(pradeep);
		//System.out.println(arjun.toString());
		System.out.println(human.hashCode());
		System.out.println(arjun.hashCode());
		System.out.println(virat.hashCode());
		System.out.println(geetha.hashCode());
		System.out.println(pradeep.hashCode());
		//memory location* 31 +1
		    System.out.println(arjun.equals(pradeep));
		    System.out.println();
	}
}
