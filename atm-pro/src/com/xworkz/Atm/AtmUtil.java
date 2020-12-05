package com.xworkz.Atm;

import com.xworkz.Atm.Atm;

public class AtmUtil {
public static void main(String[] args) {
	Atm atm = new Atm();
	atm.name="kotak";
	atm.address="rajaji nagar";
	atm.noOfBranches=7;
	System.out.println(atm.name);
	System.out.println(atm.name);
	System.out.println(atm.address);
	System.out.println(atm.noOfBranches);
	Atm.toWithdraw();
	Atm.toDeposit();

}
}
