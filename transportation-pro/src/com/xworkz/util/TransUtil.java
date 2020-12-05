package com.xworkz.util;

import com.xworkz.transport.Transportation;

public class TransUtil {
	public static void main(String[] args) {
		
		
		Transportation trans = new Transportation();
		trans.id="VRL Logistics";
		trans.name="LN234RYY";
		trans.noOfBranches=5;
		trans.address[0]="Rajajinagar";
		trans.address[1]="Jayanagar";
		trans.address[2]="MG Road";
		trans.address[3]="Brigade Road";
		trans.address[4]="HSR Layout";
		System.out.println(trans.id + " " +trans.name + " " +trans.noOfBranches);

		trans.importAndExport();
		trans.transport();
		for(int i=0; i<(trans.address).length; i++)
			System.out.println(trans.address[i]);
		for(String address : trans.address){
			System.out.println(address);
		}
	}
}

