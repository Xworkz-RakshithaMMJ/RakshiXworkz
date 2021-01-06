package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.satellite.Satellite;

public class SatelliteTester {
public static void main(String[] args) {
	
	Satellite satellite = new Satellite();
	satellite.setName("ABC");
	satellite.setModelNum(123);
	
	Satellite xyz = new Satellite();
	xyz.setName("XYZ");
	xyz.setModelNum(234);
	
	Satellite pqr = new Satellite();
	pqr.setName("PQR");
	pqr.setModelNum(789);
	
	Satellite lmn = new Satellite();
	lmn.setName("LMN");
	lmn.setModelNum(465);
	
	Satellite lmn1 = new Satellite();
	lmn1.setName("ABC");
	lmn1.setModelNum(123);
	
	System.out.println(satellite);
	System.out.println(xyz);
	System.out.println(pqr);
	System.out.println(lmn);
	System.out.println(lmn1);
	
	System.out.println(satellite.hashCode());
	System.out.println(xyz.hashCode());
	System.out.println(pqr.hashCode());
	System.out.println(lmn.hashCode());
	System.out.println(lmn1.hashCode());
	
    System.out.println(satellite.equals(lmn));

}
}
