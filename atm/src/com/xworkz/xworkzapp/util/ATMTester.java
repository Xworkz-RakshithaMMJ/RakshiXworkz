package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.atm.ATM;

public class ATMTester {
public static void main(String[] args) {
	
	ATM atm = new ATM();
	atm.setBankName("SBI");
	atm.setAddress("Rajajinagar");
	atm.setCvv(34);
	
	ATM rbi = new ATM();
	atm.setBankName("RBI");
	atm.setAddress("Jayanagar");
	atm.setCvv(12);
	
	ATM syndicate = new ATM();
	syndicate.setBankName("Syndicate Bank");
	syndicate.setAddress("Vijaynagar");
	syndicate.setCvv(67);
	
	ATM corporation = new ATM();
	corporation.setBankName("Corporation bank");
	corporation.setAddress("Kotturu");
	corporation.setCvv(89);
	
	ATM hdfc = new ATM();
	hdfc.setBankName("HDFC");
	hdfc.setAddress("Ballari");
	hdfc.setCvv(29);
	
	System.out.println(atm);
	System.out.println(rbi);
	System.out.println(syndicate);
	System.out.println(corporation);
	System.out.println(hdfc);
	
	System.out.println(atm.hashCode());
	System.out.println(rbi.hashCode());
	System.out.println(syndicate.hashCode());
	System.out.println(corporation.hashCode());
	System.out.println(hdfc.hashCode());
	
    System.out.println(atm.equals(hdfc));
	
	
}
}
